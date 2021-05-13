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

package com.pamirs.tro.entity.domain.vo.linkmanage;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Auther: vernon
 * @Date: 2020/1/3 22:51
 * @Description:
 */
@Data
@ApiModel(value = "BusinessFlowTree", description = "业务流程树")
public class BusinessFlowTree {
    @ApiModelProperty(name = "children", value = "子节点")
    List<BusinessFlowTree> children;
    @ApiModelProperty(name = "key", value = "唯一标识")
    private String key;
    @ApiModelProperty(name = "id", value = "主键")
    private String id;
}
