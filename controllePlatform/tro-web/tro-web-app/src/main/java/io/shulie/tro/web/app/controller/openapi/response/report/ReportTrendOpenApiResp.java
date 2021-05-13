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

package io.shulie.tro.web.app.controller.openapi.response.report;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zhaoyong
 */
@Data
@ApiModel
public class ReportTrendOpenApiResp implements Serializable {

    @ApiModelProperty(value = "刻度，时间")
    private List<String> time;

    @ApiModelProperty(value = "tps")
    private List<String> tps;

    @ApiModelProperty(value = "rt")
    private List<String> rt;

    @ApiModelProperty(value = "成功率")
    private List<String> successRate;

    @ApiModelProperty(value = "sa")
    private List<String> sa;
}
