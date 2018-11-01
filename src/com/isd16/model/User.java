/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isd16.model;

/**
 *
 * @author VuVietAnh
 */
public class User {
    // lop truu tuong User de Admin va NguoiNhap ke thua
    private String username;
    private String password;

    public User() {
        // no-agrs constructor (ham khoi tao khong tham so)
    }

    public User(String username, String password) {
        // constructor (ham khoi tao co tham so)
        this.username = username;
        this.password = password;
    }

    // cac ham getter, setter cho cac thuoc tinh
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
    
    
}
