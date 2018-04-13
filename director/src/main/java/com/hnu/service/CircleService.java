package com.hnu.service;

import com.github.pagehelper.PageInfo;
import com.hnu.entity.results.GroupInfo;

import java.util.List;

/**
 * Created by cqf on 2018/3/26.
 */
public interface CircleService {
    List<GroupInfo> findGroupInfoList(int tjid);
    PageInfo findCaptainMemberList(String groupid,int pageNum, int pageSize);
    PageInfo findFactoryMemberList(int tjid,int pageNum, int pageSize);
}
