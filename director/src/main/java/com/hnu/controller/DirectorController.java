package com.hnu.controller;

import com.hnu.entity.cht.AgentUser;
import com.hnu.entity.cht.DirectorUser;
import com.hnu.entity.results.*;
import com.hnu.service.CircleService;
import com.hnu.service.DirectorService;
import com.hnu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cqf on 2018/3/12.
 */
//@EnableTransactionManagement
@RestController
@RequestMapping("/director")
public class DirectorController {

    @Autowired
    UserService userService;

    @Autowired
    DirectorService directorService;

    @Autowired
    CircleService circleService;

    /*
    1.根据会员号或手机号模糊查询业务总监基本信息
     */
    @GetMapping("/queryinfo")
    public JsonResult queryInfo(@RequestParam("username") String username){
        if(StringUtils.isEmpty(username)){
            return new JsonResult(0,"手机号不能为空");
        }

//        if(username.length()==6){
//            int tjid=Integer.parseInt(username);
//            directorInfo=directorService.selectDirectorInfoByTjid(tjid);
//        }else {
//            directorInfo=directorService.selectDirectorInfoByMobile(username);
//        }

        List<DirectorUser> directorUserList=directorService.findDirectorUserList(username);
        return new JsonResult(1,"请求成功",directorUserList);
    }

    /*
    2.查询物业务总监信息（大查询）
     */
    @GetMapping("/directorlist")
    public JsonResult directorList(@RequestParam(value = "tjid",required = false) Integer tjid,    //精确
                                   @RequestParam(value = "name",required = false) String name,     //模糊
                                   @RequestParam(value = "idcard",required = false) String idcard,  //精确
                                   @RequestParam(value = "status",required = false) Byte status,  //精确
                                   @RequestParam(value = "captaininfo",required = false) String captaininfo,  //模糊(会员名，或tjid)
                                   @RequestParam(value = "factoryinfo",required = false) String factoryinfo,  //模糊
                                   @RequestParam("pageNum") Integer pageNum,
                                   @RequestParam("pageSize") Integer pageSize){
        if (pageNum==null){
            return new JsonResult(0,"pageNum值不能为空");
        }
        if (pageSize==null){
            return new JsonResult(0,"pageSize值不能为空");
        }

        Map<String,Object> map = new HashMap<>();
        map.put("tjid",tjid);
        map.put("name",name);
        map.put("idcard",idcard);
        map.put("status",status);
        map.put("captaininfo",captaininfo);
        map.put("factoryinfo",factoryinfo);
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);

        return new JsonResult(1,"请求成功",directorService.findDirectorAllInfoList(map));
    }


    /*
    3.根据会员号查姓名，手机号，身份证号
     */
    @GetMapping("/querybaseinfo")
    public JsonResult queryBaseInfo(@RequestParam("tjid") Integer tjid){
        if(tjid==null){
            return new JsonResult(0,"会员号不能为空");
        }

        if (userService.selectByTjid(tjid)==null){
            return new JsonResult(0,"无此会员号");
        }
        DirectorBaseInfo directorBaseInfo=userService.selectDirectorBaseInfoByTjid(tjid);
        return new JsonResult(1,"请求成功",directorBaseInfo);
    }

    /*
    4.根据会员号或手机号模糊查询代理商基本信息
     */
    @GetMapping("/queryagentinfo")
    public JsonResult queryAgentInfo(@RequestParam("username") String username){
        if(StringUtils.isEmpty(username)){
            return new JsonResult(0,"手机号不能为空");
        }

        List<AgentUser> agentUserList=directorService.findAgentUserList(username);
        return new JsonResult(1,"请求成功",agentUserList);
    }

    /*
    5.增加物流顾问
     */
    @GetMapping("/adddirector")
    public JsonResult addDirector(@RequestParam("tjid") Integer tjid,
                                  //@RequestParam("name") String name,
                                  @RequestParam("mobile") String mobile,
                                   // @RequestParam(value = "idCard") int idCard,
                                  @RequestParam("agenttjid") Integer agenttjid,
                                  @RequestParam(value = "park",required = false) String park){
        if(tjid==null){
            return new JsonResult(0,"会员号不能为空");
        }
        if(StringUtils.isEmpty(mobile)){
            return new JsonResult(0,"手机号不能为空");
        }
        if(agenttjid==null){
            return new JsonResult(0,"代理商不能为空");
        }

        //在会员表中看是不是有这个会员号
        if (userService.selectByTjid(tjid)==null){
            return new JsonResult(0,"无此会员号");
        }

        int userstatus=userService.selectStatusByTjid(tjid);
        if(userstatus==3||userstatus==4){
            return new JsonResult(0,"用户会员号状态为保留或闲置状态");
        }

        //在业务总监表中看是不是已经注册过了
        if(directorService.selectByTjid(tjid)!=null){
            return new JsonResult(1,"你已注册业务总监，无须再次注册");
        }

        directorService.addDirector(tjid,mobile,agenttjid,park);

        return new JsonResult(1,"请求成功");
    }

    /*
    6.批量删除物流顾问
     */
    @GetMapping("/deletedirector")
    public JsonResult deleteDirector(@RequestParam("tjids") String tjids){   //传入字符串

        if(StringUtils.isEmpty(tjids)){
            return new JsonResult(0,"主键字符串不能为空");
        }
        String[] strs=tjids.split(",");

        List<Integer> keylist=new ArrayList<Integer>();

        for (String tjid:strs) {
            keylist.add(Integer.valueOf(tjid));
        }
        if (keylist.size()==0){
            return new JsonResult(0,"主键列表元素不能为空");
        }

        directorService.deleteByKeyList(keylist);
        return new JsonResult(1,"请求成功");
    }

    /*
    7.修改物流顾问前的查询
     */
    @GetMapping("/querydirector")
    public JsonResult queryDirector(@RequestParam("tjid") Integer tjid){

        if (tjid==null){
            return new JsonResult(0,"tjid不能为空");
        }

        if(directorService.selectByTjid(tjid)==null){
            return new JsonResult(0,"无此tjid的业务总监");
        }
        DirectorAndUser directorAndUser = directorService.queryDirector(tjid);
        return new JsonResult(1,"请求成功", directorAndUser);
    }

    /*
    8.修改物流顾问
     */
//    @Transactional
    @GetMapping("/updatedirector")
    public JsonResult updateDirector(@RequestParam("tjid") Integer tjid,
                                     @RequestParam("mobile") String mobile,
                                     @RequestParam("agenttjid") Integer agenttjid,
                                     @RequestParam(value = "park",required = false) String park){

        if(tjid==null){
            return new JsonResult(0,"会员号不能为空");
        }
        if(StringUtils.isEmpty(mobile)){
            return new JsonResult(0,"手机号不能为空");
        }
        if(agenttjid==null){
            return new JsonResult(0,"代理商不能为空");
        }

        if(directorService.selectByTjid(tjid)==null){
            return new JsonResult(0,"无此tjid的业务总监");
        }

        directorService.updateDirector(tjid,mobile,agenttjid,park);
        return new JsonResult(1,"请求成功");
    }

    /*
    9.重置密码
     */
    @GetMapping("/resetpassword")
    public JsonResult resetPassword(@RequestParam("tjid") Integer tjid){

        if (tjid==null){
            return new JsonResult(0,"tjid值不能为空");
        }
        userService.resetUserPassword(tjid);
        return new JsonResult(1,"请求成功");
    }

    /*
    10.修改账户状态
     */
    @GetMapping("/lock")
    public JsonResult lock(@RequestParam("tjid") Integer tjid,@RequestParam("status") Integer status){

        if (tjid==null){
            return new JsonResult(0,"tjid值不能为空");
        }
        if (status==null){
            return new JsonResult(0,"账户状态值不能为空");
        }

        if(status!=1&&status!=2){
            return new JsonResult(0,"传入的状态值不合法");
        }

        int userstatus=userService.selectStatusByTjid(tjid);

        if(userstatus==3){
            return new JsonResult(0,"用户表状态为闲置状态");
        }

        if(userstatus==4){
            return new JsonResult(0,"用户表状态为保留状态");
        }

        if(directorService.selectByTjid(tjid)==null){
            return new JsonResult(0,"无此tjid的业务总监");
        }

        if((status==userstatus&&userstatus==1)||(status==userstatus&&userstatus==2)){
            status=userService.updateUserStatus(tjid,status);
            return new JsonResult(1,"请求成功",status);
        }else {
            return new JsonResult(0,"传入的状态值与用户表状态不一致");
        }
    }


    /*
    11.点击查看成员按钮，查看分组接口
     */
    @GetMapping("/querygroup")
    public JsonResult queryGroup(@RequestParam("tjid") Integer tjid){
        if (tjid==null){
            return new JsonResult(0,"tjid值不能为空");
        }

//        if(directorService.selectByTjid(tjid)==null){
//            return new JsonResult(0,"无此tjid的业务总监");
//        }

        List<GroupInfo> groupInfoList=circleService.findGroupInfoList(tjid);

        return new JsonResult(1,"请求成功",groupInfoList);
    }

    /*
    12.查询分组成员
     */
    @GetMapping("/querymember")
    public JsonResult queryMember(@RequestParam("groupid") String groupid,
                                  @RequestParam("pageNum")Integer pageNum,
                                  @RequestParam("pageSize")Integer pageSize){
        if (StringUtils.isEmpty(groupid)){
            return new JsonResult(0,"groupid值不能为空");
        }
        if (pageNum==null){
            return new JsonResult(0,"pageNum值不能为空");
        }
        if (pageSize==null){
            return new JsonResult(0,"pageSize值不能为空");
        }

        return new JsonResult(1,"请求成功",circleService.findCaptainMemberList(groupid,pageNum,pageSize));
    }



    /*
    13.点击更多，查询厂商接口
     */
    @GetMapping("/queryfactory")
    public JsonResult queryFactory(@RequestParam("tjid") Integer tjid,
                                   @RequestParam("pageNum") Integer pageNum,
                                   @RequestParam("pageSize") Integer pageSize){

        if (tjid==null){
            return new JsonResult(0,"tjid值不能为空");
        }
        if (pageNum==null){
            return new JsonResult(0,"pageNum值不能为空");
        }
        if (pageSize==null){
            return new JsonResult(0,"pageSize值不能为空");
        }

        return new JsonResult(1,"请求成功",circleService.findFactoryMemberList(tjid,pageNum,pageSize));
    }
}
