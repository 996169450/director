package com.hnu.service.impl;

import com.hnu.entity.eep.User;
import com.hnu.entity.results.DirectorBaseInfo;
import com.hnu.entity.results.DirectorBaseInfoMore;
import com.hnu.mapper.eep.UserMapper;
import com.hnu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cqf on 2018/3/14.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Integer selectByTjid(int tjid) {
        return userMapper.selectByTjid(tjid);
    }

//    @Override
//    public User findByTjid(int tjid) {
//        return userMapper.findByTjid(tjid);
//    }

//    @Override
//    public int updateUserMobile(int tjid,String mobile) {
//        //根据tjid找到对应的user用户
//        User user=userMapper.findByTjid(tjid);
//        //获取username字段对电话号码进行处理
//        String username=user.getUsername();
//        String[] strs=username.split("\\.");
//        strs[2]=mobile;
//        //拼接新的username
//        StringBuffer bf=new StringBuffer();
//        for (String str:strs) {
//            bf.append("."+str);
//        }
//        bf.append(".");
//        bf.deleteCharAt(0);
//        username=bf.toString();
//        return userMapper.updateUserMobile(tjid,username);
//    }

    @Override
    public int resetUserPassword(int tjid) {
        return userMapper.resetUserPassword(tjid);
    }

    @Override
    public DirectorBaseInfo selectDirectorBaseInfoByTjid(int tjid) {
        DirectorBaseInfo directorBaseInfo=new DirectorBaseInfo();
        DirectorBaseInfoMore directorBaseInfoMore=userMapper.selectDirectorBaseInfoMoreByTjid(tjid);
        String username=directorBaseInfoMore.getUsername();
        String[] strs=username.split("\\.");
        String mobile=strs[2];
        directorBaseInfo.setName(directorBaseInfoMore.getName());
        directorBaseInfo.setMobile(mobile);
        directorBaseInfo.setIdcard(directorBaseInfoMore.getIdcard());
        return directorBaseInfo;
    }

    @Override
    public Integer selectStatusByTjid(int tjid) {
        return userMapper.selectStatusByTjid(tjid);
    }

    @Override
    public Integer updateUserStatus(int tjid, int status) {
        if (status == 1) {
            status=2;
        }else {
            status=1;
        }
        userMapper.updateUserStatus(tjid,status);
        return status;
    }
}
