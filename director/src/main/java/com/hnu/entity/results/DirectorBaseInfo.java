package com.hnu.entity.results;

/**
 * Created by cqf on 2018/3/25.
 */
public class DirectorBaseInfo {
    private String name;

    private String mobile;

    private String idcard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Override
    public String toString() {
        return "DirectorBaseInfo{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", idcard='" + idcard + '\'' +
                '}';
    }
}
