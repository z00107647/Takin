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

package com.pamirs.tro.entity.domain.dto.linkmanage.linkstatistics;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Auther: vernon
 * @Date: 2020/1/7 00:19
 * @Description:
 */
@Data
@ApiModel(value = "BusinessCoverDto", description = "BusinessCoverDto")
public class BusinessCoverDto implements Serializable {
    @ApiModelProperty(name = "month", value = "月份")
    private String month;
    @ApiModelProperty(name = "cover", value = "数量")
    private String cover;
}
