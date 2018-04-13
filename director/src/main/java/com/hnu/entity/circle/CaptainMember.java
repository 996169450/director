package com.hnu.entity.circle;

public class CaptainMember {
    private String groupid;

    private String mobile;

    private Integer tjid;

    private String name;

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getTjid() {
        return tjid;
    }

    public void setTjid(Integer tjid) {
        this.tjid = tjid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CaptainMember{" +
                "groupid='" + groupid + '\'' +
                ", mobile='" + mobile + '\'' +
                ", tjid=" + tjid +
                ", name='" + name + '\'' +
                '}';
    }
}