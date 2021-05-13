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

package io.shulie.tro.web.app.request.datasource;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.pamirs.tro.common.constant.DataSourceVerifyTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author shiyajian
 * create: 2020-12-28
 */
@Data
@ApiModel("数据源修改对象")
public class DataSourceUpdateRequest {

    @ApiModelProperty("数据源ID")
    @NotNull
    private Long datasourceId;

    @ApiModelProperty("数据源名称")
    @Size(max = 64)
    private String datasourceName;

    @ApiModelProperty("数据源类型")
    private DataSourceVerifyTypeEnum type;

    @ApiModelProperty("数据源地址")
    private String jdbcUrl;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;
}
