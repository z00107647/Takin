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

package com.pamirs.tro.entity.domain.vo.auth;

import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * @Author: fanxx
 * @Date: 2020/9/3 下午8:37
 * @Description:
 */
@Data
public class RoleVo {
    List<ActionVo> actionList;
    private Long id;
    private Long applicationId;
    private String name;
    private String alias;
    private String code;
    private String description;
    private Integer status;
    private String remark;
    private Date createTime;
    private Date updateTime;
    private Integer isDeleted;
    private String features;
}
