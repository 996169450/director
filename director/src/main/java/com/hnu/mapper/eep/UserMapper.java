package com.hnu.mapper.eep;

import com.hnu.entity.eep.User;
import com.hnu.entity.eep.UserExample;
import java.util.List;

import com.hnu.entity.results.DirectorBaseInfoMore;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer tjid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer tjid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


    //查找表中是否有此tjid
    @Select("SELECT 1 FROM tb_user WHERE tjid=#{tjid}")
    Integer selectByTjid(int tjid);                                     //没有符合条件的记录时返回为null,所以返回值要为整型对象（*****）

    @Select("select * from tb_user where tjid=#{tjid}")
    User findByTjid(int tjid);

//    更新手机号码
//    @Update("update tb_user set username=#{username} where tjid=#{tjid}")
//    int updateUserMobile(@Param("tjid") int tjid,@Param("username") String username);

    //    重置密码
    @Update( "update tb_user set password='e10adc3949ba59abbe56e057f20f883e' where tjid=#{tjjid}")
    int resetUserPassword(int tjid);

//    @Select("select name from tb_user where tjid=#{tjid}")
//    String selectNameByTjid(int tjid);

    //根据tjid查询姓名，username吗，身份证号
    @Select("select name,idcard,username from tb_user where tjid=#{tjid}")
    DirectorBaseInfoMore selectDirectorBaseInfoMoreByTjid(int tjid);

    //查询业务总监在user表中的账户状态
    @Select("select status from tb_user where tjid=#{tjid}")
    Integer selectStatusByTjid(int tjid);

    //根据业务总监tjid修账户状态
    @Update("update tb_user set status=#{status} where tjid=#{tjid}")
    int updateUserStatus(@Param("tjid") int id, @Param("status") int status);
}