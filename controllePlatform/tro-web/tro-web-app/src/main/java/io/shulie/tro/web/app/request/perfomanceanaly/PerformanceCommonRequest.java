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

package io.shulie.tro.web.app.request.perfomanceanaly;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName PerformanceCommonRequest
 * @Description
 * @Author qianshui
 * @Date 2020/11/9 下午5:08
 */
@Data
public class PerformanceCommonRequest implements Serializable {

    private static final long serialVersionUID = -4824698831230176544L;

    @ApiModelProperty(value = "应用名称")
    private String appName;

    /**
     *  appIp | agentId
     */
    @ApiModelProperty(value = "进程名称")
    private String processName;
}
