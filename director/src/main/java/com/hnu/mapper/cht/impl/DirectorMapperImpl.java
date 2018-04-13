package com.hnu.mapper.cht.impl;

import java.util.List;
import java.util.Map;

/**
 * Created by cqf on 2018/3/17.
 */
public class DirectorMapperImpl {
    public String deleteByKeyList(Map<String, List<Integer>> para){
        List<Integer> keylist=para.get("keylist");
        StringBuffer bf = new StringBuffer();
        bf.append("DELETE FROM tb_director WHERE tjid IN (");
            for(Integer index:keylist){
                bf.append(index);
            bf.append(",");
        }
        bf.deleteCharAt(bf.length()-1);
        bf.append(")");
        return bf.toString();
    }

}
