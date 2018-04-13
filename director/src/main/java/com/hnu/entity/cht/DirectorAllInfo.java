package com.hnu.entity.cht;

import java.util.Date;

public class DirectorAllInfo {
    private Integer tjid;

    private String mobile;

    private Date registtime;

    private String name;

    private String idcard;

    private Byte status;

    private String captaincircleid;

    private String factorycircleid;

    private Integer agenttjid;

    private String agentmobile;

    private String agentname;

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

    public Date getRegisttime() {
        return registtime;
    }

    public void setRegisttime(Date registtime) {
        this.registtime = registtime;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getCaptaincircleid() {
        return captaincircleid;
    }

    public void setCaptaincircleid(String captaincircleid) {
        this.captaincircleid = captaincircleid;
    }

    public String getFactorycircleid() {
        return factorycircleid;
    }

    public void setFactorycircleid(String factorycircleid) {
        this.factorycircleid = factorycircleid;
    }

    public Integer getAgenttjid() {
        return agenttjid;
    }

    public void setAgenttjid(Integer agenttjid) {
        this.agenttjid = agenttjid;
    }

    public String getAgentmobile() {
        return agentmobile;
    }

    public void setAgentmobile(String agentmobile) {
        this.agentmobile = agentmobile;
    }

    public String getAgentname() {
        return agentname;
    }

    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }
}