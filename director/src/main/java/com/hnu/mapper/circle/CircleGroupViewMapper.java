package com.hnu.mapper.circle;

import com.hnu.entity.circle.CircleGroupView;
import com.hnu.entity.circle.CircleGroupViewExample;
import java.util.List;

import com.hnu.entity.results.CaptaninInfo;
import com.hnu.entity.results.GroupInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CircleGroupViewMapper {
    long countByExample(CircleGroupViewExample example);

    int deleteByExample(CircleGroupViewExample example);

    int insert(CircleGroupView record);

    int insertSelective(CircleGroupView record);

    List<CircleGroupView> selectByExample(CircleGroupViewExample example);

    int updateByExampleSelective(@Param("record") CircleGroupView record, @Param("example") CircleGroupViewExample example);

    int updateByExample(@Param("record") CircleGroupView record, @Param("example") CircleGroupViewExample example);

    //点击查看成员，显示分组信息的查询
    @Select("SELECT circlename,groupid,groupname,count(membertjid) as membercount FROM circle_group_view where tjid=210020 GROUP BY groupid")
    List<GroupInfo> findGroupInfoList(Integer tjid);

    //大查询返回的调度圈子分组查询（不超过5条）
    @Select("SELECT groupname,count(membertjid) as membercount FROM circle_group_view where tjid=#{tjid} GROUP BY groupid limit 5")
    List<CaptaninInfo> findCaptaninInfoList(Integer tjid);
}