package com.ai.channel.mgmt.dao.mapper.interfaces;

import com.ai.channel.mgmt.dao.mapper.bo.WoOrdInfo;
import com.ai.channel.mgmt.dao.mapper.bo.WoOrdInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WoOrdInfoMapper {
    int countByExample(WoOrdInfoExample example);

    int deleteByExample(WoOrdInfoExample example);

    int deleteByPrimaryKey(Long woId);

    int insert(WoOrdInfo record);

    int insertSelective(WoOrdInfo record);

    List<WoOrdInfo> selectByExampleWithBLOBs(WoOrdInfoExample example);

    List<WoOrdInfo> selectByExample(WoOrdInfoExample example);

    WoOrdInfo selectByPrimaryKey(Long woId);

    int updateByExampleSelective(@Param("record") WoOrdInfo record, @Param("example") WoOrdInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") WoOrdInfo record, @Param("example") WoOrdInfoExample example);

    int updateByExample(@Param("record") WoOrdInfo record, @Param("example") WoOrdInfoExample example);

    int updateByPrimaryKeySelective(WoOrdInfo record);

    int updateByPrimaryKeyWithBLOBs(WoOrdInfo record);

    int updateByPrimaryKey(WoOrdInfo record);
}