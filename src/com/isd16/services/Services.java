/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isd16.services;

import com.isd16.model.MatHang;
import com.isd16.model.NguoiNhap;
import com.isd16.view.View;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author vietanh
 */
public class Services {

    public Services() {
    }

    private final ConnectDatabase connectDatabase = new ConnectDatabase();

//    Check Admin Account
    public boolean checkAdmin(String username, String password) throws SQLException {
        return connectDatabase.getAccountAdmin(username, password);
    }

//    Check Nguoi Nhap Account
    public boolean checkNguoiNhap(String username, String password) throws SQLException {
        return connectDatabase.getAccountNguoiNhap(username, password);
    }

//    Ham Tro Ve Man Hinh Dang Nhap
    public void backToLoginPanel(View view) {
        view.setTitle("Đăng Nhập");
        view.setSize(350, 618);
        view.setLocation((view.toolkit.width - 350) / 2, (view.toolkit.height - 618) / 2);
        view.getExitDialog().setVisible(false);
        view.getMenu().setVisible(false);
        view.getLoginPanel().setVisible(true);
    }

//    Ham kiem tra so nguyen
    public boolean checkNumber(String a) {
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

//    Dang ky tai khoan NORMAL
    public boolean subsAccount(NguoiNhap nn) throws SQLException {
        return connectDatabase.subsAccount(nn) == 1;
    }

//    Lay tat ca du lieu cua Mat hang cho ADMIN
    public List<MatHang> getAllMatHangTon() throws SQLException {
        return connectDatabase.getAllMatHangTon();
    }

//    Lay tat ca Mat Hang cho 1 USER
    public List<MatHang> getAllMatHangNhapForUser(String maNN) throws SQLException {
        return connectDatabase.getAllMatHangNhapForUser(maNN);
    }
    
    public List<MatHang> getAllMatHangTonForUser(String maNN) throws SQLException {
        return connectDatabase.getAllMatHangTonForUser(maNN);
    }

//    Lay tat ca Mat Hang cho 1 USER
    public List<MatHang> getAllMatHangXuatForUser(String maNN) throws SQLException {
        return connectDatabase.getAllMatHangXuatForUser(maNN);
    }

//    Lay tat ca User tu CSDL
    public List<NguoiNhap> getAllUsers() throws SQLException {
        return connectDatabase.getAllUsers();
    }

    public List<NguoiNhap> getAllUsersWithout(String id) throws SQLException {
        return connectDatabase.getAllUsersWithout(id);
    }

//    Lay User tu CSDL
    public String getTen(String maUser) throws SQLException {
        return connectDatabase.getTen(maUser);
    }
    
    public NguoiNhap getUser(String id) throws SQLException{
        return connectDatabase.getUser(id);
    }

//    Chinh sua Mat Hang
    public void changeMatHang(MatHang mh) throws SQLException {
        connectDatabase.changeMatHang(mh);
    }

//    Xoa Mat Hang
    public void xoaMatHang(String ma) throws SQLException {
        connectDatabase.xoaMatHang(ma);
    }

//    Check Mat Hang
    public boolean checkMatHang(String maMh, String maNN) throws SQLException {
        return connectDatabase.checkMatHang(maMh, maNN);
    }

//    Lay ra all mat hang cho admim
    public List<MatHang> getAllMatHangNhapTheoNgay(String ngayNhap1, String ngayNhap2) throws SQLException {
        return connectDatabase.getAllMatHangNhapTheoNgay(ngayNhap1, ngayNhap2);
    }

    public List<MatHang> getAllMatHangXuatTheoNgay(String ngayNhap1, String ngayNhap2) throws SQLException {
        return connectDatabase.getAllMatHangXuatTheoNgay(ngayNhap1, ngayNhap2);
    }

    public List<NguoiNhap> searchNguoiNhapById(String id, String without) throws SQLException {
        return connectDatabase.searchNguoiNhapById(id, without);
    }

    public List<NguoiNhap> searchNguoiNhapByName(String name, String without) throws SQLException {
        return connectDatabase.searchNguoiNhapByName(name, without);
    }

    public void deleteUser(String id) throws SQLException {
        connectDatabase.deleteUser(id);
    }

    public void updateMathangForUser(String idXoa, String idGan) throws SQLException {
        connectDatabase.updateMathangForUser(idXoa, idGan);
    }

    public void updateUser(NguoiNhap n) throws SQLException {
        connectDatabase.updateUser(n);
    }

    public void addMatHang(String maMH, String tenMh, String sl, String ngayNhap, String user) throws SQLException {
        connectDatabase.addMatHang(maMH, tenMh, sl, ngayNhap, user);
    }

    public void insertMatHangXuat(MatHang mh, int slXuat, boolean delete) throws SQLException {
        connectDatabase.insertMatHangXuat(mh, slXuat, delete);
    }
    
    public boolean checkMatHangWithMaMH(String maMh) throws SQLException{
        return connectDatabase.checkMatHangWithMaMH(maMh);
    }
}
