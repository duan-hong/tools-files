package com.ai.channel.mgmt.dao.mapper.interfaces;

import com.ai.channel.mgmt.dao.mapper.bo.WoOrdInfoHis;
import com.ai.channel.mgmt.dao.mapper.bo.WoOrdInfoHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WoOrdInfoHisMapper {
    int countByExample(WoOrdInfoHisExample example);

    int deleteByExample(WoOrdInfoHisExample example);

    int deleteByPrimaryKey(Long historyId);

    int insert(WoOrdInfoHis record);

    int insertSelective(WoOrdInfoHis record);

    List<WoOrdInfoHis> selectByExampleWithBLOBs(WoOrdInfoHisExample example);

    List<WoOrdInfoHis> selectByExample(WoOrdInfoHisExample example);

    WoOrdInfoHis selectByPrimaryKey(Long historyId);

    int updateByExampleSelective(@Param("record") WoOrdInfoHis record, @Param("example") WoOrdInfoHisExample example);

    int updateByExampleWithBLOBs(@Param("record") WoOrdInfoHis record, @Param("example") WoOrdInfoHisExample example);

    int updateByExample(@Param("record") WoOrdInfoHis record, @Param("example") WoOrdInfoHisExample example);

    int updateByPrimaryKeySelective(WoOrdInfoHis record);

    int updateByPrimaryKeyWithBLOBs(WoOrdInfoHis record);

    int updateByPrimaryKey(WoOrdInfoHis record);
}