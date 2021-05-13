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

package com.pamirs.tro.entity.dao.machine;

import java.util.List;

import com.pamirs.tro.entity.domain.entity.machine.MachineTaskLog;
import com.pamirs.tro.entity.domain.entity.machine.MachineTaskLogExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TMachineTaskLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MachineTaskLog record);

    int insertSelective(MachineTaskLog record);

    List<MachineTaskLog> selectByExampleWithBLOBs(MachineTaskLogExample example);

    List<MachineTaskLog> selectByExample(MachineTaskLogExample example);

    MachineTaskLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MachineTaskLog record,
        @Param("example") MachineTaskLogExample example);

    int updateByExampleWithBLOBs(@Param("record") MachineTaskLog record,
        @Param("example") MachineTaskLogExample example);

    int updateByExample(@Param("record") MachineTaskLog record, @Param("example") MachineTaskLogExample example);

    int updateByPrimaryKeySelective(MachineTaskLog record);

    int updateByPrimaryKeyWithBLOBs(MachineTaskLog record);

    int updateByPrimaryKey(MachineTaskLog record);
}
