package com.hnu.entity.cht;

import java.util.Date;

public class Director {
    private Integer tjid;

    private String mobile;

    private Integer agenttjid;

    private String park;

    private Date registtime;

    public Integer getTjid() {
        return tjid;
    }

    public void setTjid(Integer tjid) {
        this.tjid = tjid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getAgenttjid() {
        return agenttjid;
    }

    public void setAgenttjid(Integer agenttjid) {
        this.agenttjid = agenttjid;
    }

    public String getPark() {
        return park;
    }

    public void setPark(String park) {
        this.park = park;
    }

    public Date getRegisttime() {
        return registtime;
    }

    public void setRegisttime(Date registtime) {
        this.registtime = registtime;
    }
}