/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isd16.model;

/**
 *
 * @author kingb
 */
// class NguoiNhap ke thua tu class User
public class NguoiNhap extends User {

    // bao gom cac thuoc tinh, ham trong User va co them mot so thuoc tinh
    private String name;
    private String birthday;
    private String gender;

    // no-agrs constructor (ham dung khong tham so)
    public NguoiNhap() {
    }

    // constructor (ham dung co tham so
    public NguoiNhap(String username, String password, String name, String gender, String birthday) {
        super(username, password);
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    // cac ham getter - setter cho cac thuoc tinh
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
