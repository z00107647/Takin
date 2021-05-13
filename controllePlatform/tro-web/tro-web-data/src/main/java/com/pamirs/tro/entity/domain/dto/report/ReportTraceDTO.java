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

package com.pamirs.tro.entity.domain.dto.report;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName ReportCountDTO
 * @Description 压测报告；统计返回
 * @Author qianshui
 * @Date 2020/7/22 下午2:19
 */
@ApiModel
@Data
public class ReportTraceDTO implements Serializable {

    private static final long serialVersionUID = 8928035842416997931L;

    @ApiModelProperty(value = "入口名称")
    private String interfaceName;

    @ApiModelProperty(value = "应用名称")
    private String applicationName;

    @ApiModelProperty(value = "状态")
    private Boolean succeeded;

    @ApiModelProperty(value = "总耗时")
    private Long totalRt;

    @ApiModelProperty(value = "开始时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    @ApiModelProperty(value = "traceId")
    private String traceId;

}
