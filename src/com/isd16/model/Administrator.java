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

// class Adinstrator ke thua tu class User

public class Administrator extends User {

    // bao gom cac thuoc tinh va cac ham cua User
    public Administrator() {
    // no-agrs constructor (ham dung khong tham so)
    }

    // constructor (ham dung co tham so)
    public Administrator(String username, String password) {
        super(username,password);
    }
    
}
