/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isd16.services;

import com.isd16.model.MatHang;
import com.isd16.model.NguoiNhap;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

;

/**
 *
 * @author vietanh
 */
public class ConnectDatabase {

    private Connection con = null;
    private Statement stm = null;
    private ResultSet rs = null;

    private final String URL = "jdbc:mysql://localhost:3306/csdl";

    private final String USERNAME_ADMIN = "admin";
    private final String PASSWORD_ADMIN = "admin";

    private final String USERNAME_NORMAL = "normal";
    private final String PASSWORD_NORMAL = "normal";

    public ConnectDatabase() {
    }

    /**
     *
     * @param query
     * @return
     */
//    Ket noi CSDL voi quyen ADMIN
    public ResultSet connectionAdmin(String query) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME_ADMIN, PASSWORD_ADMIN);
            stm = con.createStatement();
            rs = stm.executeQuery(query);

            return rs;
        } catch (ClassNotFoundException ex) {
            System.out.println("Loi khoi tao");
            return null;
        } catch (SQLException e) {
            System.out.println("Loi connect");
            return null;
        }
    }

//    Ket noi CSDL voi quyen ADMIN de Insert, Update, Delete
    public int connectionAdminToAccessData(String query) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME_ADMIN, PASSWORD_ADMIN);
            stm = con.createStatement();
            return stm.executeUpdate(query);
        } catch (ClassNotFoundException ex) {
            System.out.println("Loi khoi tao");
            return 0;
        } catch (SQLException e) {
            System.out.println("Loi connect");
            return 0;
        }
    }

//    Ket noi CSDL voi quyen NORMAL
    public ResultSet connectionNormal(String query) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME_NORMAL, PASSWORD_NORMAL);
            stm = con.createStatement();
            rs = stm.executeQuery(query);

            return rs;
        } catch (ClassNotFoundException ex) {
            System.out.println("Loi khoi tao");
            return null;
        } catch (SQLException e) {
            System.out.println("Loi connect");
            return null;
        }
    }

//    Kiem tra tai khoan cho ADMIN
    public boolean getAccountAdmin(String username, String password) throws SQLException {
        rs = this.connectionAdmin("SELECT * from USER");
        if (rs != null) {
            while (rs.next()) {
                if (rs.getString("username").equals(username) && rs.getString("password").equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }

//    Kiem tra tai khoan cho NORMAL
    public boolean getAccountNguoiNhap(String username, String password) throws SQLException {
        rs = this.connectionAdmin("SELECT * from user");
        if (rs != null) {
            while (rs.next()) {
                if (rs.getString("username").equals(username) && rs.getString("password").equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }

//    Lay tat ca Mat hang cho ADMIN
    public ArrayList<MatHang> getAllMatHangTon() throws SQLException {
        rs = this.connectionAdmin("SELECT * FROM MATHANGTON");
        ArrayList<MatHang> listMH;
        if (rs != null) {
            listMH = new ArrayList<MatHang>() {
                {
                    while (rs.next()) {
                        add(new MatHang(rs.getString("MAMH"), rs.getString("TENMH"), rs.getString("SOLUONG"), rs.getString("NGAYNHAP"), rs.getString("MANN")));
                    }
                }
            };

            return listMH;
        }
        return null;
    }

//    Lay tat ca mat hang cho 1 User duy nhat
    public List<MatHang> getAllMatHangNhapForUser(String maNN) throws SQLException {
        rs = this.connectionNormal("SELECT * FROM MATHANGNHAP AS MHN WHERE MHN.MANN = '" + maNN + "'");
        ArrayList<MatHang> listMh;
        if (rs != null) {
            listMh = new ArrayList<MatHang>() {
                {
                    while (rs.next()) {
                        add(new MatHang(rs.getString("MAMH"), rs.getString("TENMH"), rs.getString("SOLUONG"), rs.getString("NGAYNHAP"), rs.getString("MANN")));
                    }
                }
            };

            return listMh;
        }

        return null;
    }

    //    Lay tat ca mat hang cho 1 User duy nhat
    public List<MatHang> getAllMatHangTonForUser(String maNN) throws SQLException {
        rs = this.connectionNormal("SELECT * FROM MATHANGTON AS MHT WHERE MHT.MANN = '" + maNN + "'");
        ArrayList<MatHang> listMh;
        if (rs != null) {
            listMh = new ArrayList<MatHang>() {
                {
                    while (rs.next()) {
                        System.out.println(rs.getString("MAMH"));
                        add(new MatHang(rs.getString("MAMH"), rs.getString("TENMH"), rs.getString("SOLUONG"), rs.getString("NGAYNHAP"), rs.getString("MANN")));
                    }
                }
            };

            return listMh;
        }

        return null;
    }

//    Dang ky tai khoan NORMAL
    public int subsAccount(NguoiNhap nn) throws SQLException {
        System.out.println(nn.getUsername() + nn.getPassword() + nn.getName() + nn.getGender() + nn.getBirthday());
        return this.connectionAdminToAccessData(
                "INSERT INTO USER() VALUES('"
                + nn.getUsername() + "','"
                + nn.getPassword() + "','"
                + nn.getName() + "','"
                + nn.getGender() + "','"
                + nn.getBirthday() + "')");
    }

//    Lay User tu CSDL based-on Ma User
    public String getTen(String maUser) throws SQLException {
        rs = connectionAdmin("SELECT USER.TEN FROM USER WHERE USER.username = '" + maUser + "'");
        if (rs != null) {
            while (rs.next()) {
                return rs.getString("ten");
            }
            rs.close();
            stm.close();
            con.close();
        }
        return "";
    }

    public NguoiNhap getUser(String maUser) throws SQLException {
        rs = connectionAdmin("SELECT * FROM USER WHERE USER.username = '" + maUser + "'");
        if (rs != null) {
            while (rs.next()) {
                return new NguoiNhap(rs.getString("username"), rs.getString("password"), rs.getString("ten"), rs.getString("gioitinh"), rs.getString("ngaysinh"));
            }
            rs.close();
            stm.close();
            con.close();
        }
        return null;
    }

//    Lay tat ca User tu CSDL
    public List<NguoiNhap> getAllUsers() throws SQLException {
        rs = connectionAdmin("SELECT * FROM USER");
        List<NguoiNhap> listUsers;
        if (rs != null) {

            listUsers = new ArrayList<NguoiNhap>() {
                {
                    while (rs.next()) {
                        add(new NguoiNhap(rs.getString("username"), rs.getString("password"), rs.getString("ten"), rs.getString("gioitinh"), rs.getString("ngaysinh")));
                    }
                    rs.close();
                    stm.close();
                    con.close();
                }
            };

            return listUsers;
        }

        return null;
    }

    public List<NguoiNhap> getAllUsersWithout(String id) throws SQLException {
        rs = connectionAdmin("SELECT * FROM USER WHERE USER.USERNAME != '" + id + "' and user.username != 'admin'");
        List<NguoiNhap> listUsers;
        if (rs != null) {

            listUsers = new ArrayList<NguoiNhap>() {
                {
                    while (rs.next()) {
                        add(new NguoiNhap(rs.getString("username"), rs.getString("password"), rs.getString("ten"), rs.getString("gioitinh"), rs.getString("ngaysinh")));
                    }
                    rs.close();
                    stm.close();
                    con.close();
                }
            };

            return listUsers;
        }

        return null;
    }

//    Chinh sua Mat Hang
    public void changeMatHang(MatHang mh) throws SQLException {
        connectionAdminToAccessData("update mathangton set mathangton.tenmh = '"
                + mh.getTenMH() + "', mathangton.soluong = "
                + mh.getSoLuong() + ", mathangton.ngaynhap = '"
                + mh.getNgayNhapXuat() + "' where mathangton.mamh = '" + mh.getMaMH() + "'");
        rs.close();
        stm.close();
        con.close();
    }

    public List<MatHang> getAllMatHangXuatForUser(String maNN) throws SQLException {
        rs = connectionNormal("SELECT * FROM MATHANGXUAT AS MHX WHERE MHX.MANX = '" + maNN + "'");
        ArrayList<MatHang> listMh;
        if (rs != null) {
            listMh = new ArrayList<MatHang>() {
                {
                    while (rs.next()) {
                        add(new MatHang(rs.getString("MAMH"), rs.getString("TENMH"), rs.getString("SOLUONG"), rs.getString("NGAYXUAT"), rs.getString("MANX")));
                    }
                    rs.close();
                    stm.close();
                    con.close();
                }
            };

            return listMh;
        }

        return null;
    }

//    Them 1 mat hang cho user
    public void addMatHang(String maMH, String tenMh, String sl, String ngayNhap, String user) throws SQLException {
        connectionAdminToAccessData("insert into mathangnhap values ('" + maMH + "','" + tenMh + "','" + sl + "','" + ngayNhap + "','" + user + "')");
        connectionAdminToAccessData("insert into mathangton values ('" + maMH + "','" + tenMh + "','" + sl + "','" + ngayNhap + "','" + user + "')");
        rs.close();
        stm.close();
        con.close();
    }

//    Lay ra tat ca mat hang tu ngay - den ngay
    public List<MatHang> getAllMatHangNhapTheoNgay(String timeBegin, String timeEnd) throws SQLException {
        rs = connectionNormal("select * from mathangnhap as mhn where mhn.ngaynhap between '" + timeBegin + "' and '" + timeEnd + "'");
        ArrayList<MatHang> listMh;
        if (rs != null) {
            listMh = new ArrayList<MatHang>() {
                {
                    while (rs.next()) {
                        add(new MatHang(rs.getString("MAMH"), rs.getString("TENMH"), rs.getString("SOLUONG"), rs.getString("NGAYNHAP"), rs.getString("MANN")));
                    }
                    rs.close();
                    stm.close();
                    con.close();
                }
            };
            return listMh;
        }
        return null;
    }

    //    Lay ra tat ca mat hang tu ngay - den ngay
    public List<MatHang> getAllMatHangXuatTheoNgay(String timeBegin, String timeEnd) throws SQLException {
        rs = connectionNormal("select * from mathangxuat as mhx where mhx.ngayxuat between '" + timeBegin + "' and '" + timeEnd + "'");
        ArrayList<MatHang> listMh;
        if (rs != null) {
            listMh = new ArrayList<MatHang>() {
                {
                    while (rs.next()) {
                        add(new MatHang(rs.getString("MAMH"), rs.getString("TENMH"), rs.getString("SOLUONG"), rs.getString("NGAYXUAT"), rs.getString("MANX")));
                    }
                    rs.close();
                    stm.close();
                    con.close();
                }
            };
            return listMh;
        }
        return null;
    }

//    Check mat hang cho User
    public boolean checkMatHang(String maMh, String maNN) throws SQLException {
        rs = connectionNormal("SELECT * FROM MATHANGTON AS MH WHERE MH.MAMH = '" + maMh + "' AND MH.MANN = '" + maNN + "'");

        return rs != null && rs.next();
    }

    public boolean checkMatHangWithMaMH(String maMh) throws SQLException {
        if (checkMatHangNhap(maMh)) {
            return true;
        }
        rs = connectionNormal("SELECT * FROM MATHANGTON AS MH WHERE MH.MAMH = '" + maMh + "'");

        return (rs != null && rs.next());
    }

    public boolean checkMatHangNhap(String maMh) throws SQLException {
        rs = connectionNormal("SELECT * FROM MATHANGNHAP AS MH WHERE MH.MAMH = '" + maMh + "'");

        return rs != null && rs.next();
    }

//    Xoa mat hang
    public void xoaMatHang(String ma) throws SQLException {
        connectionAdminToAccessData("delete from MATHANGTON where MATHANGTON.MAMH = '" + ma + "'");
    }

    public List<NguoiNhap> searchNguoiNhapById(String maNN, String without) throws SQLException {
        rs = connectionAdmin("select * from user where user.username like '%" + maNN + "%' and user.username != '" + without + "'");
        if (rs != null) {

            return new ArrayList<NguoiNhap>() {
                {
                    while (rs.next()) {
                        add(new NguoiNhap(rs.getString("USERNAME"), "", rs.getString("TEN"), "", ""));
                    }
                    rs.close();
                    stm.close();
                    con.close();
                }
            };
        }
        return null;
    }

    public List<NguoiNhap> searchNguoiNhapByName(String name, String without) throws SQLException {
        rs = connectionAdmin("select * from user where user.ten like '%" + name + "%' and user.username != '" + without + "'");
        if (rs != null) {

            return new ArrayList<NguoiNhap>() {
                {
                    while (rs.next()) {
                        add(new NguoiNhap(rs.getString("USERNAME"), "", rs.getString("TEN"), "", ""));
                    }
                    rs.close();
                    stm.close();
                    con.close();
                }
            };
        }
        return null;
    }

    public void deleteUser(String id) throws SQLException {
        System.out.println(id);
        connectionAdminToAccessData("DELETE FROM USER WHERE USER.USERNAME = '" + id + "'");
        rs.close();
        stm.close();
        con.close();
    }

//    Update MATHANGNHAP cho User va MATHANGXUAT cho User
    public void updateMathangForUser(String idXoa, String idGan) throws SQLException {
        connectionAdminToAccessData("update mathangnhap as n set n.mann = '" + idGan + "' where n.mann = '" + idXoa + "'");
        connectionAdminToAccessData("update mathangton as n set n.mann = '" + idGan + "' where n.mann = '" + idXoa + "'");
        connectionAdminToAccessData("update mathangxuat as x set x.manx = '" + idGan + "' where x.manx = '" + idXoa + "'");

        connectionAdminToAccessData("DELETE FROM USER WHERE USER.USERNAME = '" + idXoa + "'");
        rs.close();
        stm.close();
        con.close();
    }

    public void updateUser(NguoiNhap n) throws SQLException {
        connectionAdminToAccessData("UPDATE USER SET USER.PASSWORD = '" + n.getPassword() + "', USER.TEN = '" + n.getName() + "', USER.GIOITINH = '" + n.getGender() + "', USER.NGAYSINH = '" + n.getBirthday() + "' WHERE USER.USERNAME = '" + n.getUsername() + "'");
        rs.close();
        stm.close();
        con.close();
    }

    public void insertMatHangXuat(MatHang mh, int slXuat, boolean delete) throws SQLException {
        connectionAdminToAccessData("INSERT INTO MATHANGXUAT() VALUES('" + mh.getMaMH() + "','" + mh.getTenMH() + "'," + slXuat + ",'" + mh.getNgayNhapXuat() + "','" + mh.getMaUser() + "')");
        if (delete) {
            connectionAdminToAccessData("DELETE FROM MATHANGTON WHERE MATHANGTON.MAMH = '" + mh.getMaMH() + "'");
        } else {
            connectionAdminToAccessData("UPDATE MATHANGTON AS T SET T.SOLUONG = " + mh.getSoLuong() + " WHERE T.MAMH = '" + mh.getMaMH() + "'");
        }
        rs.close();
        stm.close();
        con.close();
    }
}
