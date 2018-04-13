package com.hnu.mapper.cht;

import com.hnu.entity.cht.Captain;
import com.hnu.entity.cht.CaptainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaptainMapper {
    long countByExample(CaptainExample example);

    int deleteByExample(CaptainExample example);

    int deleteByPrimaryKey(Integer tjid);

    int insert(Captain record);

    int insertSelective(Captain record);

    List<Captain> selectByExample(CaptainExample example);

    Captain selectByPrimaryKey(Integer tjid);

    int updateByExampleSelective(@Param("record") Captain record, @Param("example") CaptainExample example);

    int updateByExample(@Param("record") Captain record, @Param("example") CaptainExample example);

    int updateByPrimaryKeySelective(Captain record);

    int updateByPrimaryKey(Captain record);
}