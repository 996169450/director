package com.hnu.mapper.cht;

import com.hnu.entity.cht.CaptainFactoryInfo;
import com.hnu.entity.cht.CaptainFactoryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CaptainFactoryInfoMapper {
    long countByExample(CaptainFactoryInfoExample example);

    int deleteByExample(CaptainFactoryInfoExample example);

    int insert(CaptainFactoryInfo record);

    int insertSelective(CaptainFactoryInfo record);

    List<CaptainFactoryInfo> selectByExample(CaptainFactoryInfoExample example);

    int updateByExampleSelective(@Param("record") CaptainFactoryInfo record, @Param("example") CaptainFactoryInfoExample example);

    int updateByExample(@Param("record") CaptainFactoryInfo record, @Param("example") CaptainFactoryInfoExample example);

    //根据用户名或tjid模糊查询圈子成员所属圈子id
    @Select("select id from captain_factoryinfo where type=#{type} and concat(tjid,name) like '%' #{info} '%'")  //1. '%#{info}%'这个写法不对    2.查出来的list可能为空，调用criteria.andCaptaincircleidIn(list)时会出错，需要判空
    List<String> findCircleIdByTypeAndInfo(@Param("type") Byte type,@Param("info") String info);     //Parameter 'type' not found. Available parameters are [arg1, arg0, param1, param2]
}