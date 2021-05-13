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

package io.shulie.tro.cloud.open.req.scenemanage;

import java.io.Serializable;
import java.util.List;

import io.shulie.tro.cloud.open.req.HttpCloudRequest;
import lombok.Data;

/**
 * @author 无涯
 * @Package io.shulie.tro.cloud.open.bean.scenemanage
 * @description:
 * @date 2020/10/22 8:07 下午
 */
@Data
public class SceneManageQueryReq extends HttpCloudRequest implements Serializable {

    private Long customId;

    private String customName;

    private Long sceneId;

    private String sceneName;

    private Integer status;

    private List<Long> customIds;

    /**
     * 场景ids (逗号进行分割)
     */
    private String sceneIds ;

    private String lastPtStartTime ;

    private String lastPtEndTime ;

}
