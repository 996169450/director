package com.hnu.entity.results;

/**
 * Created by cqf on 2018/3/25.
 */
public class DirectorBaseInfoMore {
    private String name;

    private String idcard;

    private String username;


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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "DirectorBaseInfoMore{" +
                "name='" + name + '\'' +
                ", idcard='" + idcard + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
