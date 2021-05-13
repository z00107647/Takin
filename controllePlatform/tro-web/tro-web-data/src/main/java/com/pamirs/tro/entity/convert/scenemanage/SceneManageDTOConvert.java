/*
 * Copyright 2021 Shulie Technology, Co.Ltd
 * Email: shulie@shulie.io
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pamirs.tro.entity.convert.scenemanage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.pamirs.tro.common.constant.SceneManageConstant;
import com.pamirs.tro.entity.domain.dto.scenemanage.RuleDTO;
import com.pamirs.tro.entity.domain.dto.scenemanage.SceneBusinessActivityRefDTO;
import com.pamirs.tro.entity.domain.dto.scenemanage.SceneManageListDTO;
import com.pamirs.tro.entity.domain.dto.scenemanage.SceneScriptRefDTO;
import com.pamirs.tro.entity.domain.dto.scenemanage.SceneSlaRefDTO;
import com.pamirs.tro.entity.domain.entity.scenemanage.SceneBusinessActivityRef;
import com.pamirs.tro.entity.domain.entity.scenemanage.SceneManage;
import com.pamirs.tro.entity.domain.entity.scenemanage.SceneScriptRef;
import com.pamirs.tro.entity.domain.entity.scenemanage.SceneSlaRef;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName SceneManageConvert
 * @Description
 * @Author qianshui
 * @Date 2020/4/17 下午4:26
 */
@Mapper
public interface SceneManageDTOConvert {

    SceneManageDTOConvert INSTANCE = Mappers.getMapper(SceneManageDTOConvert.class);

    @Mappings({
        @Mapping(source = "id", target = "id"),
        @Mapping(source = "customId", target = "customId"),
        @Mapping(source = "sceneName", target = "sceneName"),
        @Mapping(source = "lastPtTime", target = "lastPtTime", dateFormat = "yyyy-MM-dd HH:mm:ss"),
        @Mapping(source = "status", target = "status")
    })
    SceneManageListDTO of(SceneManage source);

    List<SceneManageListDTO> ofs(List<SceneManage> sources);

    @AfterMapping
    default void fillSceneManageListDTO(SceneManage source, @MappingTarget SceneManageListDTO dto) {
        String ptConfig = source.getPtConfig();
        JSONObject jsonObject = JSON.parseObject(ptConfig);
        BigDecimal flow = jsonObject.getBigDecimal(SceneManageConstant.ESTIMATE_FLOW);
        dto.setEstimateFlow(flow != null ? flow.setScale(2, RoundingMode.HALF_UP) : null);
    }

    @Mappings({
        @Mapping(source = "id", target = "id"),
        @Mapping(source = "bindRef", target = "bindRef"),
        @Mapping(source = "businessActivityId", target = "businessActivityId"),
        @Mapping(source = "businessActivityName", target = "businessActivityName")
    })
    SceneBusinessActivityRefDTO of(SceneBusinessActivityRef source);

    @AfterMapping
    default void fillGoalValue(SceneBusinessActivityRef source, @MappingTarget SceneBusinessActivityRefDTO dto) {
        String goalValue = source.getGoalValue();
        if (StringUtils.isBlank(goalValue)) {
            return;
        }
        JSONObject jsonObject = JSON.parseObject(goalValue);
        dto.setTargetTPS(jsonObject.getInteger(SceneManageConstant.TPS));
        dto.setTargetRT(jsonObject.getInteger(SceneManageConstant.RT));
        dto.setTargetSuccessRate(jsonObject.getBigDecimal(SceneManageConstant.SUCCESS_RATE));
        dto.setTargetSA(jsonObject.getBigDecimal(SceneManageConstant.SA));
    }

    List<SceneBusinessActivityRefDTO> ofBusinessActivityList(List<SceneBusinessActivityRef> sources);

    @Mappings({
        @Mapping(source = "id", target = "id"),
        @Mapping(source = "fileName", target = "fileName"),
        @Mapping(source = "fileSize", target = "fileSize"),
        @Mapping(source = "fileType", target = "fileType"),
        @Mapping(source = "uploadPath", target = "uploadPath"),
        @Mapping(source = "uploadTime", target = "uploadTime", dateFormat = "yyyy-MM-dd HH:mm:ss"),
        @Mapping(source = "isDeleted", target = "isDeleted"),
    })
    SceneScriptRefDTO of(SceneScriptRef source);

    List<SceneScriptRefDTO> ofScriptList(List<SceneScriptRef> sources);

    @AfterMapping
    default void fillScript(SceneScriptRef source, @MappingTarget SceneScriptRefDTO dto) {
        if (StringUtils.isBlank(source.getFileExtend())) {
            return;
        }
        JSONObject jsonObject = JSON.parseObject(source.getFileExtend());
        dto.setUploadedData(jsonObject.getLong(SceneManageConstant.DATA_COUNT));
        dto.setIsSplit(jsonObject.getInteger(SceneManageConstant.IS_SPLIT));
        dto.setTopic(jsonObject.getString(SceneManageConstant.TOPIC));
    }

    @Mappings({
        @Mapping(source = "id", target = "id"),
        @Mapping(source = "slaName", target = "ruleName"),
        @Mapping(source = "status", target = "status"),
        @Mapping(source = "businessActivityIds", target = "businessActivity", ignore = true)
    })
    SceneSlaRefDTO of(SceneSlaRef source);

    @AfterMapping
    default void fillSlaRule(SceneSlaRef source, @MappingTarget SceneSlaRefDTO dto) {
        String condition = source.getCondition();
        JSONObject jsonObject = JSON.parseObject(condition);
        Integer compareType = jsonObject.getInteger(SceneManageConstant.COMPARE_TYPE);
        BigDecimal compareValue = jsonObject.getBigDecimal(SceneManageConstant.COMPARE_VALUE);
        Integer achieveTimes = jsonObject.getInteger(SceneManageConstant.ACHIEVE_TIMES);
        String event = jsonObject.getString(SceneManageConstant.EVENT);
        dto.setEvent(event);
        RuleDTO ruleDTO = new RuleDTO();
        ruleDTO.setIndexInfo(source.getTargetType());
        ruleDTO.setCondition(compareType);
        ruleDTO.setDuring(compareValue);
        ruleDTO.setTimes(achieveTimes);
        dto.setRule(ruleDTO);
        dto.setBusinessActivity(StringUtils.split(source.getBusinessActivityIds(), ","));
    }

    List<SceneSlaRefDTO> ofSlaList(List<SceneSlaRef> sources);
}
