package com.hnu.mapper.cht;

import com.hnu.entity.cht.AgentUser;
import com.hnu.entity.cht.AgentUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgentUserMapper {
    long countByExample(AgentUserExample example);

    int deleteByExample(AgentUserExample example);

    int insert(AgentUser record);

    int insertSelective(AgentUser record);

    List<AgentUser> selectByExample(AgentUserExample example);

    int updateByExampleSelective(@Param("record") AgentUser record, @Param("example") AgentUserExample example);

    int updateByExample(@Param("record") AgentUser record, @Param("example") AgentUserExample example);
}