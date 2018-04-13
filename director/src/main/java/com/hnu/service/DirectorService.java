package com.hnu.service;

import com.github.pagehelper.PageInfo;
import com.hnu.entity.cht.AgentUser;
import com.hnu.entity.cht.DirectorAllInfo;
import com.hnu.entity.cht.DirectorUser;
import com.hnu.entity.results.DirectorAndUser;

import java.util.List;
import java.util.Map;

/**
 * Created by cqf on 2018/3/12.
 */
public interface DirectorService {
     int addDirector(int tjid, String mobile, int agenttjid, String park);
     Integer selectByTjid(int tjid);
     int deleteByKeyList(List<Integer> keylist);
     DirectorAndUser queryDirector(Integer tjid);
     int updateDirector(int tjid, String mobile, int agenttjid, String park);
//     int selectStatusById(int tjid);
//     Integer updateDirectorStatus(int tjid, int directorstatus);
//     DirectorInfo selectDirectorInfoByTjid(int tjid);
//     DirectorInfo selectDirectorInfoByMobile(String mobile);
     List<DirectorUser> findDirectorUserList(String username);
     List<AgentUser> findAgentUserList(String username);
     PageInfo findDirectorAllInfoList(Map<String,Object> map);
}
