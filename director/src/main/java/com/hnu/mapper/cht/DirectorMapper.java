package com.hnu.mapper.cht;

import com.hnu.entity.cht.Director;
import com.hnu.entity.cht.DirectorExample;
import java.util.List;

import com.hnu.mapper.cht.impl.DirectorMapperImpl;
import org.apache.ibatis.annotations.*;

public interface DirectorMapper {
    long countByExample(DirectorExample example);

    int deleteByExample(DirectorExample example);

    int deleteByPrimaryKey(Integer tjid);

    int insert(Director record);

    int insertSelective(Director record);

    List<Director> selectByExample(DirectorExample example);

    Director selectByPrimaryKey(Integer tjid);

    int updateByExampleSelective(@Param("record") Director record, @Param("example") DirectorExample example);

    int updateByExample(@Param("record") Director record, @Param("example") DirectorExample example);

    int updateByPrimaryKeySelective(Director record);

    int updateByPrimaryKey(Director record);

    //插入物流顾问
    @Insert("insert into tb_director(tjid,mobile,agenttjid,park,registtime) values(#{tjid},#{mobile},#{agenttjid},#{park},#{registtime})")
    int addDirector(Director director);

    //查找表中是否有此tjid
    @Select("SELECT 1 FROM tb_director WHERE tjid=#{tjid}")               //没有符合条件的记录时返回为null,所以返回值要为整型对象（*****）
    Integer selectByTjid(int tjid);

    //批量删除物流顾问
    //@Delete("DELETE FROM tb_director WHERE id IN (1,4)")
    @DeleteProvider(type= DirectorMapperImpl.class, method= "deleteByKeyList")
    int deleteByKeyList(@Param("keylist") List<Integer> keylist);

    //查询物流顾问         /*有问题，这个tb_user是db_cht库里面的*/
//    @Select("select u.tjid, d.mobile, u.name ,u.idcard, d.park ,d.agenttjid from tb_user u,tb_director d where u.tjid=d.tjid and d.tjid=#{tjid}")
//    DirectorAndUser queryDirector(Integer tjid);

//    //根据tjid修改园区信息
//    @Update("update tb_director set park=#{park} where tjid=#{tjid}")
//    int updateConsultantPark(@Param("tjid") int tjid,@Param("park") String park);       //传递的两个参数和sql语句中的两个参数位置不一致时，需要用@Param指定参数名称

    //更新物流顾问
    @Update("update tb_director set mobile=#{mobile},agenttjid=#{agenttjid},park=#{park} where tjid=#{tjid}")
    int updateDirector(@Param("tjid") int tjid, @Param("mobile") String mobile, @Param("agenttjid") int agenttjid, @Param("park") String park);

//    //根据物流顾问id修改物流顾问状态
//    @Update("update tb_director set directorstatus=#{directorstatus} where tjid=#{tjid}")
//    int updateDirectorStatus(@Param("tjid") int id, @Param("directorstatus") int consultantstatus);

//    //查询业务总监的账户状态
//    @Select("select directorstatus from tb_director where tjid=#{tjid}")
//    int selectStatusById(int tjid);

//    //根据tjid查询业务总监tjid，name，mobile
//    @Select("select tjid,name,mobile from tb_director where tjid=#{tjid}")
//    DirectorInfo selectDirectorInfoByTjid(int tjid);
//
//    //根据mobile查询业务总监tjid，name，mobile
//    @Select("select tjid,name,mobile from tb_director where mobile=#{mobile}")
//    DirectorInfo selectDirectorInfoByMobile(String mobile);

}