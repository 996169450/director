package com.hnu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hnu.entity.cht.*;
import com.hnu.entity.eep.User;
import com.hnu.entity.results.*;
import com.hnu.mapper.cht.*;
import com.hnu.mapper.circle.CircleGroupViewMapper;
import com.hnu.mapper.circle.FactoryMemberMapper;
import com.hnu.mapper.eep.UserMapper;
import com.hnu.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by cqf on 2018/3/12.
 */
@Service
public class DirectorServiceImpl implements DirectorService {
    @Autowired
    DirectorMapper directorMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    DirectorUserMapper directorUserMapper;

    @Autowired
    AgentUserMapper agentUserMapper;

    @Autowired
    DirectorAllInfoMapper directorAllInfoMapper;

    @Autowired
    CaptainFactoryInfoMapper captainFactoryInfoMapper;

    @Autowired
    FactoryMemberMapper factoryMemberMapper;

    @Autowired
    CircleGroupViewMapper circleGroupViewMapper;

    @Override
    public int addDirector(int tjid,String mobile,int agenttjid, String park) {
        Date date=new Date();
//        String name=userMapper.selectNameByTjid(tjid);
        Director director =new Director();
        director.setTjid(tjid);
//        director.setName(name);
        director.setMobile(mobile);
        director.setAgenttjid(agenttjid);
        director.setPark(park);
        director.setRegisttime(date);
//        director.setDirectorstatus(1);
        return directorMapper.addDirector(director);
    }

    @Override
    public Integer selectByTjid(int tjid) {
        return directorMapper.selectByTjid(tjid);
    }

    @Override
    public int deleteByKeyList(List<Integer> keylist) {
        return directorMapper.deleteByKeyList(keylist);
    }

    @Override
    public DirectorAndUser queryDirector(Integer tjid) {
        Director director=directorMapper.selectByPrimaryKey(tjid);
        User user=userMapper.selectByPrimaryKey(tjid);
        DirectorAndUser directorAndUser=new DirectorAndUser();
        directorAndUser.setTjid(tjid);
        directorAndUser.setName(user.getName());
        directorAndUser.setMobile(director.getMobile());
        directorAndUser.setAgenttjid(director.getAgenttjid());
        directorAndUser.setIdcard(user.getIdcard());
        directorAndUser.setPark(director.getPark());
//        String mobile = directorAndUser.getUsername();
//        String[] strs= mobile.split("\\.");
//        mobile=strs[2];
//        directorAndUser.setmUsername(mobile);
        return directorAndUser;
    }

    @Override
    public int updateDirector(int tjid,String mobile,int agenttjid,String park){
        return directorMapper.updateDirector(tjid,mobile,agenttjid,park);
    }

//    @Override
//    public int selectStatusById(int tjid) {
//        return directorMapper.selectStatusById(tjid);
//    }

//    @Override
//    public Integer updateDirectorStatus(int tjid, int directorstatus) {
//        if(directorstatus==0){
//            directorstatus=1;
//        }else {
//            directorstatus=0;
//        }
//        directorMapper.updateDirectorStatus(tjid,directorstatus);
//        return directorstatus;
//    }

    @Override
    public List<DirectorUser> findDirectorUserList(String username) {
        DirectorUserExample directorUserExample=new DirectorUserExample();
        directorUserExample.or().andUsernameLike("%"+username+"%");
        List<DirectorUser> directorUserList=directorUserMapper.selectByExample(directorUserExample);
        return directorUserList;
    }

    @Override
    public List<AgentUser> findAgentUserList(String username) {
        AgentUserExample agentUserExample=new AgentUserExample();
        agentUserExample.or().andUsernameLike("%"+username+"%");
        List<AgentUser> agentUserList=agentUserMapper.selectByExample(agentUserExample);
        return agentUserList;
    }

    @Override
    public PageInfo findDirectorAllInfoList(Map<String, Object> map) {
        DirectorAllInfoExample directorAllInfoExample=new DirectorAllInfoExample();
        //设置根据注册日期降序排列
        directorAllInfoExample.setOrderByClause("registtime DESC");
        //获取criteria对象
        DirectorAllInfoExample.Criteria criteria=directorAllInfoExample.createCriteria();
        Integer tjid= (Integer)map.get("tjid");
        String name= (String)map.get("name");
        String idcard = (String)map.get("idcard");
        Byte status =(Byte)map.get("status");
        String captaininfo =(String)map.get("captaininfo");
        String factoryinfo =(String)map.get("factoryinfo");
        Integer pageNum=(Integer)map.get("pageNum");
        Integer pageSize=(Integer)map.get("pageSize");
        if(tjid!=null){
            criteria.andTjidEqualTo(tjid);
        }
        if(!StringUtils.isEmpty(name)){
            criteria.andNameLike("%"+name+"%");
        }
        if(!StringUtils.isEmpty(idcard)){
            criteria.andIdcardEqualTo(idcard);
        }
        if(status!=null){
            criteria.andStatusEqualTo(status);
        }
        if(!StringUtils.isEmpty(captaininfo)){
            //根据调度圈成员的名字或tjid模糊查询其所在调度圈的id列表
            List<String> list=captainFactoryInfoMapper.findCircleIdByTypeAndInfo((byte)1,captaininfo);
            if (list.size()!=0){        //如果列表不为空就加入到判断条件
                criteria.andCaptaincircleidIn(list);
            }else {                     //如果为空，查不到任何结果
                criteria.andCaptaincircleidIsNull();   //// TODO: 2018/4/8  这里的处理可能有点问题
            }
        }
        if(!StringUtils.isEmpty(factoryinfo)){
            List<String> list=captainFactoryInfoMapper.findCircleIdByTypeAndInfo((byte)11,factoryinfo);
            if (list.size()!=0){
                criteria.andFactorycircleidIn(list);
            }else {
                criteria.andFactorycircleidIsNull();
            }
        }

        PageHelper.startPage(pageNum,pageSize);
        List<DirectorAllInfo> directorAllInfoList=directorAllInfoMapper.selectByExample(directorAllInfoExample);
        //创建结果封装集合
        List<DirectorResult> directorResultList=new ArrayList<>();
        //便利directorAllInfoList集合进行封装
        for (DirectorAllInfo directorAllInfo:directorAllInfoList) {
            //业务总监信息
            DirectorInfo directorInfo=new DirectorInfo();
            directorInfo.setTjid(directorAllInfo.getTjid());
            directorInfo.setName(directorAllInfo.getName());
            directorInfo.setMobile(directorAllInfo.getMobile());
            directorInfo.setIdcard(directorAllInfo.getIdcard());
            directorInfo.setRegisttime(directorAllInfo.getRegisttime());
            directorInfo.setStatus(directorAllInfo.getStatus());

            //车队在信息列表
            List<CaptaninInfo> captaninInfoList=circleGroupViewMapper.findCaptaninInfoList(directorAllInfo.getTjid());

            //厂商信息列表
            List<FactoryInfo> factoryInfoList=factoryMemberMapper.findFactoryInfoByTjid(directorAllInfo.getTjid());

            //代理商信息
            AgentInfo agentInfo=new AgentInfo();
            agentInfo.setAgentname(directorAllInfo.getAgentname());
            agentInfo.setAgenttjid(directorAllInfo.getAgenttjid());
            agentInfo.setAgentmobile(directorAllInfo.getAgentmobile());

            //业务总监结果集
            DirectorResult directorResult=new DirectorResult();
            directorResult.setDirectorInfo(directorInfo);
            directorResult.setCaptaninInfoList(captaninInfoList);
            directorResult.setFactoryInfoList(factoryInfoList);
            directorResult.setAgentInfo(agentInfo);
            directorResultList.add(directorResult);
        }

        PageInfo pageInfo = new PageInfo(directorResultList);

        return pageInfo;
    }

//    @Override
//    public DirectorInfo selectDirectorInfoByTjid(int tjid) {
//        return directorMapper.selectDirectorInfoByTjid(tjid);
//    }
//
//    @Override
//    public DirectorInfo selectDirectorInfoByMobile(String mobile) {
//        return directorMapper.selectDirectorInfoByMobile(mobile);
//    }

}
