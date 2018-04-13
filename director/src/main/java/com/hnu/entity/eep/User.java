package com.hnu.entity.eep;

import java.util.Date;

public class User {
    private Integer tjid;

    private String username;

    private String password;

    private String name;

    private String idcard;

    private Integer sex;

    private Integer status;

    private Date regtime;

    private String company;

    private String city;

    private String numcode;

    private String address;

    private String memo;

    private Integer empid;

    private Integer roleid;

    private Integer cardtype;

    public Integer getTjid() {
        return tjid;
    }

    public void setTjid(Integer tjid) {
        this.tjid = tjid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumcode() {
        return numcode;
    }

    public void setNumcode(String numcode) {
        this.numcode = numcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getCardtype() {
        return cardtype;
    }

    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    @Override
    public String toString() {
        return "User{" +
                "tjid=" + tjid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", idcard='" + idcard + '\'' +
                ", sex=" + sex +
                ", status=" + status +
                ", regtime=" + regtime +
                ", company='" + company + '\'' +
                ", city='" + city + '\'' +
                ", numcode='" + numcode + '\'' +
                ", address='" + address + '\'' +
                ", memo='" + memo + '\'' +
                ", empid=" + empid +
                ", roleid=" + roleid +
                ", cardtype=" + cardtype +
                '}';
    }
}