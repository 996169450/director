package com.hnu.mapper.cht;

import com.hnu.entity.cht.DirectorUser;
import com.hnu.entity.cht.DirectorUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DirectorUserMapper {
    long countByExample(DirectorUserExample example);

    int deleteByExample(DirectorUserExample example);

    int insert(DirectorUser record);

    int insertSelective(DirectorUser record);

    List<DirectorUser> selectByExample(DirectorUserExample example);

    int updateByExampleSelective(@Param("record") DirectorUser record, @Param("example") DirectorUserExample example);

    int updateByExample(@Param("record") DirectorUser record, @Param("example") DirectorUserExample example);
}