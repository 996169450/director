package com.hnu.service;

import com.hnu.entity.eep.User;
import com.hnu.entity.results.DirectorBaseInfo;

/**
 * Created by cqf on 2018/3/14.
 */
public interface UserService {
    Integer selectByTjid(int tjid);
//    User findByTjid(int tjid);
//    int updateUserMobile( int tjid,String mobile);
    int resetUserPassword(int tjid);
    DirectorBaseInfo selectDirectorBaseInfoByTjid(int tjid);
    Integer selectStatusByTjid(int tjid);
    Integer updateUserStatus(int id,int status);
}
