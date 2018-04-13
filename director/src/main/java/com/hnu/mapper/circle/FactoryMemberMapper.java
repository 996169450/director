package com.hnu.mapper.circle;

import com.hnu.entity.circle.FactoryMember;
import com.hnu.entity.circle.FactoryMemberExample;
import java.util.List;

import com.hnu.entity.results.FactoryInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface FactoryMemberMapper {
    long countByExample(FactoryMemberExample example);

    int deleteByExample(FactoryMemberExample example);

    int insert(FactoryMember record);

    int insertSelective(FactoryMember record);

    List<FactoryMember> selectByExample(FactoryMemberExample example);

    int updateByExampleSelective(@Param("record") FactoryMember record, @Param("example") FactoryMemberExample example);

    int updateByExample(@Param("record") FactoryMember record, @Param("example") FactoryMemberExample example);

    @Select("select factorytjid,factoryname from factory_member where tjid=#{tjid} limit 5")   //factory_member这个视图已经设置了圈子类型为11
    List<FactoryInfo> findFactoryInfoByTjid(Integer tjid);
}