package com.hnu.mapper.circle;

import com.hnu.entity.circle.Circle;
import com.hnu.entity.circle.CircleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CircleMapper {
    long countByExample(CircleExample example);

    int deleteByExample(CircleExample example);

    int deleteByPrimaryKey(String id);

    int insert(Circle record);

    int insertSelective(Circle record);

    List<Circle> selectByExample(CircleExample example);

    Circle selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Circle record, @Param("example") CircleExample example);

    int updateByExample(@Param("record") Circle record, @Param("example") CircleExample example);

    int updateByPrimaryKeySelective(Circle record);

    int updateByPrimaryKey(Circle record);

//    //根据业务总监tjid查找其对应调度圈的id
//    @Select("select id as circleid from tb_circle where tjid=#{tjid} and type=1")
//    String selectCircleIdByTjid(int tjid);
//
//    //根据业务总监tjid查找圈子名称
//    @Select("select name as circlename from tb_circle where tjid=#{tjid} and type=1")
//    String selectCircleNameByTjid(int tjid);
}