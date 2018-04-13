package com.hnu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hnu.entity.circle.CaptainMember;
import com.hnu.entity.circle.CaptainMemberExample;
import com.hnu.entity.circle.FactoryMember;
import com.hnu.entity.circle.FactoryMemberExample;
import com.hnu.entity.results.GroupInfo;
import com.hnu.mapper.circle.*;
import com.hnu.service.CircleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cqf on 2018/3/26.
 */
@Service
public class CircleServiceImpl implements CircleService {

    @Autowired
    CircleMapper circleMapper;

    @Autowired
    CircleGroupMapper circleGroupMapper;

    @Autowired
    GroupMemberMapper groupMemberMapper;

    @Autowired
    CaptainMemberMapper captainMemberMapper;

    @Autowired
    FactoryMemberMapper factoryMemberMapper;

    @Autowired
    CircleGroupViewMapper circleGroupViewMapper;

    @Override
    public List<GroupInfo> findGroupInfoList(int tjid) {

        return circleGroupViewMapper.findGroupInfoList(tjid);
    }

    @Override
    public PageInfo findCaptainMemberList(String groupid, int pageNum, int pageSize) {
        //创建查询条件
        CaptainMemberExample captainMemberExample=new CaptainMemberExample();
        captainMemberExample.or().andGroupidEqualTo(groupid);
        //设置分页参数
        PageHelper.startPage(pageNum, pageSize);
        List<CaptainMember> captainMemberList=captainMemberMapper.selectByExample(captainMemberExample);
        PageInfo pageInfo = new PageInfo(captainMemberList);
        return pageInfo;
    }

    @Override
    public PageInfo findFactoryMemberList(int tjid, int pageNum, int pageSize) {
        FactoryMemberExample factoryMemberExample=new FactoryMemberExample();
        factoryMemberExample.or().andTjidEqualTo(tjid);
        PageHelper.startPage(pageNum,pageSize);
        List<FactoryMember> factoryMemberList=factoryMemberMapper.selectByExample(factoryMemberExample);
        PageInfo pageInfo=new PageInfo(factoryMemberList);
        return pageInfo;
    }
}
