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

package io.shulie.tro.web.data.param.user;

import lombok.Data;

/**
 * @Author: fanxx
 * @Date: 2021/3/10 11:14 上午
 * @Description:
 */
@Data
public class UserCreateParam {

    /**
     * 登录账号
     */
    private String name;

    /**
     * 用户名称
     */
    private String nick;

    /**
     * 用户key
     */
    private String key;

    /**
     * 租户 id customer
     */
    private Long customerId;

    /**
     * 盐值
     */
    private String salt;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 用户类型，0:系统管理员，1:其他
     */
    private Integer userType;
}
