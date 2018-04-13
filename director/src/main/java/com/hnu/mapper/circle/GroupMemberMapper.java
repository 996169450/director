package com.hnu.mapper.circle;

import com.hnu.entity.circle.GroupMember;
import com.hnu.entity.circle.GroupMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface GroupMemberMapper {
    long countByExample(GroupMemberExample example);

    int deleteByExample(GroupMemberExample example);

    int deleteByPrimaryKey(String id);

    int insert(GroupMember record);

    int insertSelective(GroupMember record);

    List<GroupMember> selectByExample(GroupMemberExample example);

    GroupMember selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GroupMember record, @Param("example") GroupMemberExample example);

    int updateByExample(@Param("record") GroupMember record, @Param("example") GroupMemberExample example);

    int updateByPrimaryKeySelective(GroupMember record);

    int updateByPrimaryKey(GroupMember record);

    //根据分组id查找该分组下成员的数量
    @Select("select count(*) from tb_group_member where groupid=#{groupid}")
    Integer selectMemberCountByGroupid(String groupid);

    //根据分组id查找该分组下成员的tjid
    @Select("select tjid from tb_group_member where groupid=#{groupid}")
    List<Integer> findTjidByGroupId(String groupid);
}