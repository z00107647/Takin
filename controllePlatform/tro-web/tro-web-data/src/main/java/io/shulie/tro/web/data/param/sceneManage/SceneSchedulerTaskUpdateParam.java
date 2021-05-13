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

package io.shulie.tro.web.data.param.sceneManage;

import java.util.Date;

import lombok.Data;

/**
 * @Author: mubai
 * @Date: 2020-11-30 21:44
 * @Description:
 */

@Data
public class SceneSchedulerTaskUpdateParam {

    private Long id;

    private Long sceneId;

    private String content;

    private Integer isExecuted;

    private Date executeTime;

    private Boolean isDeleted ;
}
