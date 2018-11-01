/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isd16.controller;

import com.isd16.model.NguoiNhap;
import com.isd16.services.Services;
import com.isd16.view.View;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VuVietAnh
 */
public class KeyEvent implements KeyListener {

    private View view;
    private Services services = null;

    public static boolean checkTableReload = false;
    public static boolean checkPress = false;

    public KeyEvent(View view) {
        this.view = view;
        services = new Services();
    }

    public KeyEvent() {
    }

    /*
   
    
    KEY EVENT
    
 
     */
    @Override
    public void keyReleased(java.awt.event.KeyEvent e) throws UnsupportedOperationException {
//        ========= Hien thi nut Dang Nhap =========
        if (!this.view.getUsername().getText().trim().equals("") && !String.valueOf(this.view.getPassword().getPassword()).equals("")) {
            this.view.getLogin().setEnabled(true);
        }
//        ========= End =========

//       ========= Hien thi nut Dang Ky =========
        if (!this.view.getUsernameSubs_input().getText().equals("")
                && !String.valueOf(this.view.getPasswordSubs_input().getPassword()).equals("")
                && !String.valueOf(this.view.getRetypePasswordSubs_input().getPassword()).equals("")
                && !this.view.getFullNameSubs_input().getText().equals("")
                && !this.view.getBirthdaySubs_input().getText().equals("")) {
            if (!this.view.getUsernameSubs_input().getText().contains(" ")) {

                if (String.valueOf(this.view.getPasswordSubs_input().getPassword()).equals(String.valueOf(this.view.getRetypePasswordSubs_input().getPassword()))) {
                    if (this.view.getBirthdaySubs_input().getText().matches("([0-9])([0-9])([0-9])([0-9])-([0-9])([0-9])-([0-9])([0-9])")) {
                        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                        try {
                            if (format.parse(String.valueOf(this.view.getBirthdaySubs_input().getText())).compareTo(new Date()) > 0
                                    && format.parse(String.valueOf(this.view.getBirthdaySubs_input().getText())).compareTo(format.parse("1980-01-01")) > 0) {
                                this.view.getError_messageSubs().setText("Ngày Quá Lớn");
                                this.view.getSubsButton().setEnabled(false);
                            } else {
                                this.view.getError_messageSubs().setText("");
                                this.view.getSubsButton().setEnabled(true);
                            }
                        } catch (ParseException ex) {
                            Logger.getLogger(KeyEvent.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } else {
                        this.view.getError_messageSubs().setText("Ngày sinh sai định dạng");
                        this.view.getSubsButton().setEnabled(false);
                    }
                } else {
                    this.view.getError_messageSubs().setText("Mật khẩu không khớp!");
                    this.view.getSubsButton().setEnabled(false);
                }

            } else {
                this.view.getSubsButton().setEnabled(false);
                this.view.getError_messageSubs().setText("Tài khoản không được chứa khoảng trắng");
            }
        }
//        ========= End =========

//        ========= Disable nut Dang Nhap =========
        if (this.view.getUsername().getText().trim().equals("") || String.valueOf(this.view.getPassword().getPassword()).equals("")) {
            this.view.getLogin().setEnabled(false);
        }

        if (e.getSource() == this.view.getNameField() || e.getSource() == this.view.getSlField() || e.getSource() == this.view.getDayField()) {
            checkTableReload = true;
        }

        if (e.getSource() == this.view.getNameField() && this.view.getNameField().getText().trim().equals("")) {
            this.view.getError_message_change_infor().setText("Tên không được để trống");
        } else {
            this.view.getError_message_change_infor().setText("");
        }
//        ========= end =========

//        =========Enable nut Luu=========
        if (!this.view.getNameField().getText().trim().equals("")
                && !this.view.getSlField().getText().trim().equals("")
                && !this.view.getDayField().getText().trim().equals("")) {

//            Kiem tra so luong la so nguyen
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            if (!services.checkNumber(this.view.getSlField().getText())) {
                this.view.getError_message_change_infor().setText("Nhập chưa đúng số lượng");
                this.view.getSaveButton().setEnabled(false);
            } else if (!this.view.getDayField().getText().matches("([0-9])([0-9])([0-9])([0-9])-([0-9])([0-9])-([0-9])([0-9])")) {
                this.view.getError_message_change_infor().setText("Ngày nhập sai định dạng");
                this.view.getSaveButton().setEnabled(false);
            } else {
                try {
                    if (format.parse(this.view.getDayField().getText()).compareTo(new Date()) > 0) {
                        this.view.getError_message_change_infor().setText("Ngày Quá Lớn");
                        this.view.getSaveButton().setEnabled(false);
                    } else {
                        this.view.getError_message_change_infor().setText("");
                        this.view.getSaveButton().setEnabled(true);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(KeyEvent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            this.view.getSaveButton().setEnabled(false);
        }

        if (e.getSource()
                == this.view.getPassUserChangeField() && String.valueOf(this.view.getPassUserChangeField().getPassword()).trim().equals("")) {
            this.view.getErrorChinhSuaUser().setText("Mật khẩu không được để trống");
        } else {
            this.view.getErrorChinhSuaUser().setText("");
        }
//        =========end=========

//        ========= Enable nut Them =========
        if (!this.view.getMaMHAddField()
                .getText().trim().equals("")
                && !this.view.getNameAddField().getText().trim().equals("")
                && !this.view.getSlAddField().getText().trim().equals("")) {

//            Kiem tra so luong la so nguyen
            if (!services.checkNumber(this.view.getSlAddField().getText())) {
                this.view.getError_message_add_infor().setText("Chưa nhập đúng số");
                this.view.getAddMHButton().setEnabled(false);
            } else if (Integer.parseInt(this.view.getSlAddField().getText()) > 0) {
                this.view.getError_message_add_infor().setText("");
                this.view.getAddMHButton().setEnabled(true);
            }
        } else {
            this.view.getAddMHButton().setEnabled(false);
        }

        if (e.getSource() == this.view.getMaMHAddField()) {
            if (this.view.getMaMHAddField().getText().equals("")) {
                this.view.getError_message_add_infor().setText("Mã MH không được để trống");
                this.view.getAddMHButton().setEnabled(false);
            } else {
                try {
                    System.out.println("Run");
                    if (services.checkMatHangWithMaMH(this.view.getMaMHAddField().getText())) {
                        this.view.getError_message_add_infor().setText("Mã MH đã tồn tại");
                        this.view.getAddMHButton().setEnabled(false);
                    } else {
                        this.view.getError_message_add_infor().setText("");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(KeyEvent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

//        ========= end =========
//          ========= Kiem tra ngay sinh DialogchinhsuaUser =========
        if (!this.view.getDateUserChangeField()
                .getText().trim().equals("")
                && !String.valueOf(this.view.getPassUserChangeField().getPassword()).trim().equals("")
                && !this.view.getNameUserChangeField().getText().trim().equals("")) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            if (!this.view.getDateUserChangeField().getText().trim().matches("([0-9])([0-9])([0-9])([0-9])-([0-9])([0-9])-([0-9])([0-9])")) {
                this.view.getErrorChinhSuaUser().setText("Ngày nhập sai định dạng");
                this.view.getSaveUserChangeButton().setEnabled(false);
            } else {
                try {
                    if (format.parse(this.view.getDateUserChangeField().getText()).compareTo(new Date()) > 0) {
                        this.view.getErrorChinhSuaUser().setText("Ngày quá lớn");
                        this.view.getSaveUserChangeButton().setEnabled(false);
                    } else {
                        this.view.getErrorChinhSuaUser().setText("");
                        this.view.getSaveUserChangeButton().setEnabled(true);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(KeyEvent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            this.view.getSaveUserChangeButton().setEnabled(false);
        }
//        ========= end =========

//          ========= Kiem tra ngay nhap NhapXuat(inAndOutPanel) =========
        if (this.view.getTimeBegin()
                == e.getSource() || this.view.getTimeEnd() == e.getSource()) {
            checkPress = true;
        }

        if (!this.view.getTimeBegin()
                .getText().trim().equals("")
                && !this.view.getTimeEnd().getText().trim().equals("")) {
            if (!this.view.getTimeBegin().getText().trim().matches("([0-9])([0-9])([0-9])([0-9])-([0-9])([0-9])-([0-9])([0-9])")
                    || !this.view.getTimeEnd().getText().trim().matches("([0-9])([0-9])([0-9])([0-9])-([0-9])([0-9])-([0-9])([0-9])")) {
                this.view.getErrorInAndOut().setText("Ngày nhập sai định dạng");
                this.view.getButtonSeachInOut().setEnabled(false);
            } else {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    if (format.parse(this.view.getTimeBegin().getText()).compareTo(new Date()) > 0
                            || format.parse(this.view.getTimeEnd().getText()).compareTo(new Date()) > 0) {
                        this.view.getErrorInAndOut().setText("Ngày quá lớn");
                        this.view.getButtonSeachInOut().setEnabled(false);
                    } else if (format.parse(this.view.getTimeBegin().getText()).compareTo(format.parse(this.view.getTimeEnd().getText())) > 0) {
                        this.view.getErrorInAndOut().setText("Lỗi xung đột ngày");
                        this.view.getButtonSeachInOut().setEnabled(false);
                    } else {
                        this.view.getErrorInAndOut().setText("");
                        this.view.getButtonSeachInOut().setEnabled(true);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(KeyEvent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
//        ========= end =========

//        ========= Disable nut Dang Ki =========
        if (this.view.getUsernameSubs_input()
                .getText().trim().equals("")
                || String.valueOf(this.view.getPasswordSubs_input().getPassword()).trim().equals("")
                || String.valueOf(this.view.getRetypePasswordSubs_input().getPassword()).trim().equals("")
                || !String.valueOf(this.view.getPasswordSubs_input().getPassword()).equals(String.valueOf(this.view.getRetypePasswordSubs_input().getPassword()))
                || this.view.getFullNameSubs_input().getText().equals("")
                || this.view.getBirthdaySubs_input().getText().equals("")) {
            this.view.getSubsButton().setEnabled(false);
        }
//        ========= end =========

        if (services.checkNumber(
                this.view.getSlNNXuatField().getText())) {
            if (Integer.parseInt(this.view.getSlNNXuatField().getText()) > 0) {
                if (Integer.parseInt(this.view.getSlNNXuatField().getText()) == Integer.parseInt(String.valueOf(this.view.getCsdlTableShowItemNN().getValueAt(this.view.getCsdlTableShowItemNN().getSelectedRow(), 2)))) {
                    this.view.getError_XuatKhoLabel().setText("");
                    this.view.getXuatKhoButtonXuat().setEnabled(true);
                    this.view.getGiamSL().setEnabled(true);
                    this.view.getTangSL().setEnabled(false);
                } else if (Integer.parseInt(this.view.getSlNNXuatField().getText()) > Integer.parseInt(String.valueOf(this.view.getCsdlTableShowItemNN().getValueAt(this.view.getCsdlTableShowItemNN().getSelectedRow(), 2)))) {
                    this.view.getError_XuatKhoLabel().setText("Số lượng hàng không đủ");
                    this.view.getXuatKhoButtonXuat().setEnabled(false);
                    this.view.getGiamSL().setEnabled(true);
                    this.view.getTangSL().setEnabled(false);
                } else {
                    this.view.getError_XuatKhoLabel().setText("");
                    this.view.getXuatKhoButtonXuat().setEnabled(true);
                    this.view.getGiamSL().setEnabled(true);
                    this.view.getTangSL().setEnabled(true);
                }

            } else if (Integer.parseInt(this.view.getSlNNXuatField().getText()) == 0) {
                this.view.getError_XuatKhoLabel().setText("");
                this.view.getXuatKhoButtonXuat().setEnabled(false);
                this.view.getGiamSL().setEnabled(false);
                this.view.getTangSL().setEnabled(true);
            } else if (Integer.parseInt(this.view.getSlNNXuatField().getText()) > Integer.parseInt(String.valueOf(this.view.getDtmCsdlShowItemNN().getValueAt(this.view.getCsdlTableShowItemNN().getSelectedRow(), 2)))) {
                this.view.getError_XuatKhoLabel().setText("Chưa nhập đúng số");
                this.view.getXuatKhoButtonXuat().setEnabled(false);
                this.view.getGiamSL().setEnabled(false);
                this.view.getTangSL().setEnabled(true);
            }
        } else {
            this.view.getError_XuatKhoLabel().setText("Chưa nhập đúng số");
            this.view.getXuatKhoButtonXuat().setEnabled(false);
            this.view.getGiamSL().setEnabled(false);
            this.view.getTangSL().setEnabled(false);
        }

        if (e.getSource()
                == this.view.getMaNV()) {
            if (this.view.getSearchBy().getSelectedItem().equals("Mã NV")) {
                try {
                    List<NguoiNhap> arr = services.searchNguoiNhapById(String.valueOf(this.view.getMaNV().getText()),
                            String.valueOf(this.view.getCsdlTableUser().getValueAt(this.view.getCsdlTableUser().getSelectedRow(), 0)));
                    for (int i = this.view.getDtmTableSearch().getRowCount() - 1; i >= 0; i--) {
                        this.view.getDtmTableSearch().removeRow(i);
                    }

                    if (arr != null) {
                        arr.forEach(user -> {
                            this.view.getDtmTableSearch().addRow(new Object[]{
                                user.getUsername(),
                                user.getName()
                            });
                        });
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(KeyEvent.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (this.view.getSearchBy().getSelectedItem().equals("Tên NV")) {
                try {
                    List<NguoiNhap> arr = services.searchNguoiNhapByName(String.valueOf(this.view.getMaNV().getText()),
                            String.valueOf(this.view.getCsdlTableUser().getValueAt(this.view.getCsdlTableUser().getSelectedRow(), 0)));
                    for (int i = this.view.getDtmTableSearch().getRowCount() - 1; i >= 0; i--) {
                        this.view.getDtmTableSearch().removeRow(i);
                    }

                    if (arr != null) {
                        arr.forEach(user -> {
                            this.view.getDtmTableSearch().addRow(new Object[]{
                                user.getUsername(),
                                user.getName()
                            });
                        });
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(KeyEvent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    @Override
    public void keyTyped(java.awt.event.KeyEvent e) throws UnsupportedOperationException {
    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent e) throws UnsupportedOperationException {
    }
}
