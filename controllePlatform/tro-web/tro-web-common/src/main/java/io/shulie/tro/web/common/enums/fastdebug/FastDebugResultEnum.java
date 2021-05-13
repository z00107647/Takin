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

package io.shulie.tro.web.common.enums.fastdebug;

import lombok.Getter;

/**
 * @author 无涯
 * @Package io.shulie.tro.web.common.enums.fastdebug
 * @date 2020/12/28 4:03 下午
 */
@Getter
public enum FastDebugResultEnum {
    ERROR(false, "失败"),
    SUCCESS(true, "成功");
    private Boolean status;
    private String desc;

    FastDebugResultEnum(Boolean status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public static String getDescByStatus(Boolean status) {
        return status?SUCCESS.desc:ERROR.desc;
    }

}
