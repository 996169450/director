package com.hnu.entity.results;

/**
 * Created by cqf on 2018/3/17.
 */
public class DirectorAndUser {

    private Integer tjid;

    private String park;

    private String mobile;

    private String name;

    private Integer agenttjid;

    private String idcard;

    public Integer getAgenttjid() {
        return agenttjid;
    }

    public void setAgenttjid(Integer agenttjid) {
        this.agenttjid = agenttjid;
    }

    public Integer getTjid() {
        return tjid;
    }

    public void setTjid(Integer tjid) {
        this.tjid = tjid;
    }

    public String getPark() {
        return park;
    }

    public void setPark(String park) {
        this.park = park;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }
}
