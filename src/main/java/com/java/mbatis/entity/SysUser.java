package com.java.mbatis.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SysUser {

    //id
    private long id;

    //姓名
    private String name;

    //身份证
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String idCard;

    //电话
    private String phone;

    //地址
    private String address;

    //性别（11：男；10：女）
    private Integer sex;

    //登录用户名
    private String userName;

    //邮箱
    private String eMail;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
