package com.hnu.mapper.circle;

import com.hnu.entity.circle.CaptainMember;
import com.hnu.entity.circle.CaptainMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaptainMemberMapper {
    long countByExample(CaptainMemberExample example);

    int deleteByExample(CaptainMemberExample example);

    int insert(CaptainMember record);

    int insertSelective(CaptainMember record);

    List<CaptainMember> selectByExample(CaptainMemberExample example);

    int updateByExampleSelective(@Param("record") CaptainMember record, @Param("example") CaptainMemberExample example);

    int updateByExample(@Param("record") CaptainMember record, @Param("example") CaptainMemberExample example);
}