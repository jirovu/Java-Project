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
public class MatHang {

    private String maMH;
    private String tenMH;
    private String soLuong;
    private String ngayNhapXuat;
    private String maUser;

    // no-agrs constructor (ham dung khong tham so)
    public MatHang() {
    }

    // constructor (ham dung co tham so)
    public MatHang(String maMH, String tenMH, String soLuong, String ngayNhapXuat, String maUser) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.ngayNhapXuat = ngayNhapXuat;
        this.maUser = maUser;
    }
    
    

    // cac ham getter - setter
    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgayNhapXuat() {
        return ngayNhapXuat;
    }

    public String getMaUser() {
        return maUser;
    }

    public void setNgayNhapXuat(String ngayNhapXuat) {
        this.ngayNhapXuat = ngayNhapXuat;
    }

    public void setMaUser(String maUser) {
        this.maUser = maUser;
    }
    
}
