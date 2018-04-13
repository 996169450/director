package com.hnu.mapper.circle;

import com.hnu.entity.circle.CircleGroup;
import com.hnu.entity.circle.CircleGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CircleGroupMapper {
    long countByExample(CircleGroupExample example);

    int deleteByExample(CircleGroupExample example);

    int deleteByPrimaryKey(String id);

    int insert(CircleGroup record);

    int insertSelective(CircleGroup record);

    List<CircleGroup> selectByExample(CircleGroupExample example);

    CircleGroup selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CircleGroup record, @Param("example") CircleGroupExample example);

    int updateByExample(@Param("record") CircleGroup record, @Param("example") CircleGroupExample example);

    int updateByPrimaryKeySelective(CircleGroup record);

    int updateByPrimaryKey(CircleGroup record);

//    //根据circle的id查找其下的分组id，名称
//    @Select("select id as groupid,name as groupname from tb_circle_group where circleid=#{circleid}")
//    List<Group> findGroupByCircleId(String circleid);
}