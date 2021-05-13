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

package io.shulie.tro.web.app.request.user;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @Author: fanxx
 * @Date: 2020/11/5 9:26 下午
 * @Description:
 */
@Data
@Valid
public class ResourceScopeQueryRequest implements Serializable {

    private static final long serialVersionUID = -42665250230498099L;

    @NotNull(message = "roleId不为空")
    private Long roleId;

}
