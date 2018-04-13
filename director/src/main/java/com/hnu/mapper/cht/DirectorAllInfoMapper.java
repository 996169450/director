package com.hnu.mapper.cht;

import com.hnu.entity.cht.DirectorAllInfo;
import com.hnu.entity.cht.DirectorAllInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DirectorAllInfoMapper {
    long countByExample(DirectorAllInfoExample example);

    int deleteByExample(DirectorAllInfoExample example);

    int insert(DirectorAllInfo record);

    int insertSelective(DirectorAllInfo record);

    List<DirectorAllInfo> selectByExample(DirectorAllInfoExample example);

    int updateByExampleSelective(@Param("record") DirectorAllInfo record, @Param("example") DirectorAllInfoExample example);

    int updateByExample(@Param("record") DirectorAllInfo record, @Param("example") DirectorAllInfoExample example);
}