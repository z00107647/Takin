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

package com.pamirs.tro.entity.domain.vo.engine;

import lombok.Data;

/**
 * @author hezhongqi
 */
@Data
public class EngineNotifyParam {

    /**
     * 任务ID
     */
    private Long resultId;

    /**
     * 场景ID
     */
    private Long sceneId;

    /**
     * 客户Id 新增
     */
    private Long customerId;

    /**
     * 状态
     */
    private String status;

    /**
     * 消息
     */
    private String msg;

    /**
     * 开启压测时间，结束压测时间
     */
    private Long time;

    /**
     * pod序号
     */
    private String podNum;

    public EngineNotifyParam() {

    }
}
