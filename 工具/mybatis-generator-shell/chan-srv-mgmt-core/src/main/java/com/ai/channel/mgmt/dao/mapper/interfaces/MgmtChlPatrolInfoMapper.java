package com.ai.channel.mgmt.dao.mapper.interfaces;

import com.ai.channel.mgmt.dao.mapper.bo.MgmtChlPatrolInfo;
import com.ai.channel.mgmt.dao.mapper.bo.MgmtChlPatrolInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgmtChlPatrolInfoMapper {
    int countByExample(MgmtChlPatrolInfoExample example);

    int deleteByExample(MgmtChlPatrolInfoExample example);

    int deleteByPrimaryKey(Long patrolId);

    int insert(MgmtChlPatrolInfo record);

    int insertSelective(MgmtChlPatrolInfo record);

    List<MgmtChlPatrolInfo> selectByExample(MgmtChlPatrolInfoExample example);

    MgmtChlPatrolInfo selectByPrimaryKey(Long patrolId);

    int updateByExampleSelective(@Param("record") MgmtChlPatrolInfo record, @Param("example") MgmtChlPatrolInfoExample example);

    int updateByExample(@Param("record") MgmtChlPatrolInfo record, @Param("example") MgmtChlPatrolInfoExample example);

    int updateByPrimaryKeySelective(MgmtChlPatrolInfo record);

    int updateByPrimaryKey(MgmtChlPatrolInfo record);
}