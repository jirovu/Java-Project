/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isd16.controller;

import com.isd16.model.MatHang;
import com.isd16.model.NguoiNhap;
import com.isd16.services.Services;
import com.isd16.services.ThreadProcess;
import com.isd16.view.View;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VuVietAnh
 */
public class ActionEvent implements ActionListener {

    private View view;
    private Services services = null;

    public int index = 0;
    public int index1 = 0;
    public int counter = 0;
    public String typeProcess;
    public boolean delete = false;

    public ActionEvent(View view) {
        this.view = view;
        services = new Services();
    }

    public ActionEvent() {
    }

    public void runProcess() throws SQLException {
        switch (typeProcess) {
            case "showListMatHangAdmin":
                services.getAllMatHangTon().forEach(mh -> {
                    try {
                        sleep(80);
                        this.view.getDtmCsdlShowItem().addRow(new Object[]{
                            ++counter,
                            mh.getMaMH(),
                            services.getTen(mh.getMaUser()),
                            mh.getTenMH(),
                            Integer.parseInt(mh.getSoLuong()),
                            mh.getNgayNhapXuat()
                        });
                    } catch (SQLException | InterruptedException ex) {
                        Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });

                this.view.getLogout().setEnabled(true);
                this.view.getCsdlTableShowItem().setEnabled(true);
                this.view.getCsdlTableUser().setEnabled(true);
                counter = 0;
                break;
            case "showHistoryInOutNhap":
                this.services.getAllMatHangNhapTheoNgay(this.view.getTimeBegin().getText(), this.view.getTimeEnd().getText()).forEach(mh -> {
                    try {
                        sleep(100);
                        this.view.getDtmCsdlTableIntAndOut().addRow(new Object[]{
                            ++counter,
                            mh.getMaMH(),
                            this.services.getTen(mh.getMaUser()),
                            mh.getTenMH(),
                            Integer.parseInt(mh.getSoLuong()),
                            mh.getNgayNhapXuat()
                        });
                    } catch (SQLException | InterruptedException ex) {
                        Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
                this.view.getTimeBegin().setEditable(true);
                this.view.getTimeEnd().setEditable(true);
                this.view.getSelectInOut().setEnabled(true);
                this.view.getButtonSeachInOut().setEnabled(true);
                counter = 0;
                break;
            case "showHistoryInOutXuat":
                services.getAllMatHangXuatTheoNgay(this.view.getTimeBegin().getText(), this.view.getTimeEnd().getText()).forEach(mh -> {
                    try {
                        sleep(100);
                        this.view.getDtmCsdlTableIntAndOut().addRow(new Object[]{
                            ++counter,
                            mh.getMaUser(),
                            services.getTen(mh.getMaUser()),
                            mh.getTenMH(),
                            Integer.parseInt(mh.getSoLuong()),
                            mh.getNgayNhapXuat()
                        });
                    } catch (SQLException | InterruptedException ex) {
                        Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
                this.view.getTimeBegin().setEditable(true);
                this.view.getTimeEnd().setEditable(true);
                this.view.getSelectInOut().setEnabled(true);
                this.view.getButtonSeachInOut().setEnabled(true);
                counter = 0;
                break;
            default:
                break;
        }
    }

    // Action Event
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) throws UnsupportedOperationException {

//        =======================================PHAN ADMINISTRATOR=======================================
//        Dang nhap
        if (e.getSource() == this.view.getLogin() || (e.getSource() == this.view.getPassword()
                && !String.valueOf(this.view.getPassword().getPassword()).trim().equals("")
                && !this.view.getUsername().getText().trim().equals(""))) {
            try {
                System.out.println(this.view.getPassword().getPassword());

                // Dang nhap cho Admin
                if (this.view.getUsername().getText().trim().equals("admin")
                        && services.checkAdmin(this.view.getUsername().getText(), String.valueOf(this.view.getPassword().getPassword()))) {

                    typeProcess = "showListMatHangAdmin";

                    this.view.setTitle("Quản Lý Kho Hàng");
                    this.view.getUserPanel().setVisible(false);
                    this.view.getPassword().setText("");

                    this.view.getLogout().setEnabled(false);
                    this.view.getCsdlTableShowItem().setEnabled(false);
                    this.view.getCsdlTableUser().setEnabled(false);

                    ThreadProcess process = new ThreadProcess(this);
                    process.setPriority(Thread.MAX_PRIORITY);
                    process.start();

                    //Login
                    this.view.setSize(1200, 750);
                    this.view.setLocation((this.view.toolkit.width - 1200) / 2, (this.view.toolkit.height - 750) / 2);
                    this.view.getLichSuGiaoDichTable().setVisible(true);
                    this.view.getMenu().setVisible(true);
                    this.view.getLoginPanel().setVisible(false);
                    this.view.getAdminPanel().setVisible(true);
                    this.view.getLogin().setEnabled(false);
                    this.view.getError_message().setText("");
                    this.view.getHomeMenu().setEnabled(false);
                    this.view.getPanelShowItem().setVisible(true);
                    this.view.getShowAllPanel().setVisible(true);
                    this.view.getSaveButton().setEnabled(false);
                    this.view.getChangeDialog().setVisible(false);
                    this.view.getInAndOutPanel().setVisible(false);
                    this.view.getHomePanelNN().setVisible(false);

                } //                Dang nhap cho Nguoi Nhap
                else if (!this.view.getUsername().getText().trim().equals("admin")
                        && services.checkNguoiNhap(this.view.getUsername().getText(), String.valueOf(this.view.getPassword().getPassword()))) {

                    this.view.getIdView().setText(this.view.getUsername().getText());
                    this.view.getUserView().setText(services.getTen(this.view.getUsername().getText()));
                    this.view.setTitle("Quản Lý Kho Hàng");
                    this.view.getPassword().setText("");
                    this.view.getCsdlTableShowItemNN().setVisible(true);
                    this.view.getLichSuGiaoDichTable().setVisible(true);

                    services.getAllMatHangTon().forEach(mh -> {
                        this.view.getDtmCsdlShowItemNN().addRow(new Object[]{
                            mh.getMaMH(),
                            mh.getTenMH(),
                            Integer.valueOf(mh.getSoLuong()),
                            mh.getNgayNhapXuat()
                        });
                    });

                    //Login
                    this.view.setSize(1200, 750);
                    this.view.setLocation((this.view.toolkit.width - 1200) / 2, (this.view.toolkit.height - 750) / 2);
                    this.view.getMenu().setVisible(true);
                    this.view.getLoginPanel().setVisible(false);
                    this.view.getNguoiNhapPanel().setVisible(true);
                    this.view.getLogin().setEnabled(false);
                    this.view.getError_message().setText("");
                    this.view.getHomeMenu().setEnabled(false);
                    this.view.getHomePanelNN().setVisible(true);

                } else {
                    this.view.getError_message().setText("Đăng nhập thất bại!!");
                    this.view.getError_message().setVisible(true);
                    this.view.getPassword().setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

//        Dang ky
        if (e.getSource() == this.view.getSubscribe()) {
            this.view.setTitle("Đăng Ký");
            this.view.setSize(372, 660);
            this.view.setLocation((this.view.toolkit.width - 372) / 2, (this.view.toolkit.height - 660) / 2);
            this.view.getLoginPanel().setVisible(false);
            this.view.getSubscribePanel().setVisible(true);
        }

//        Back
        if (e.getSource() == this.view.getBackSubs()) {
            this.view.getSubscribePanel().setVisible(false);
            services.backToLoginPanel(this.view);
        }

//        About me
        if (e.getSource() == this.view.getAboutMe()) {
            if (this.view.getUsername().getText().equals("admin")) {
                this.view.getHomeMenu().setEnabled(true);
                this.view.getHomePanel().setVisible(false);
                this.view.getAboutMePanel().setVisible(true);
                this.view.getHomePanelNN().setVisible(false);
            } else if (!this.view.getUsername().getText().equals("admin")) {
                this.view.getHomeMenu().setEnabled(true);
                this.view.getHomePanelNN().setVisible(false);
                this.view.getAboutMePanelNN().setVisible(true);
                this.view.getHomePanelNN().setVisible(false);
            }
        }

//        Home click
        if (e.getSource() == this.view.getGoHome()) {
            if (this.view.getUsername().getText().equals("admin")) {
                System.out.println("HOme");
                this.view.getShowAllPanel().setVisible(true);
                this.view.getHomeMenu().setEnabled(false);
                this.view.getHelpMenu().setEnabled(true);
                this.view.getHomePanel().setVisible(true);
                this.view.getAboutMePanel().setVisible(false);
                this.view.getInAndOutPanel().setVisible(false);
            } else {
                this.view.getHomeMenu().setEnabled(false);
                this.view.getHelpMenu().setEnabled(true);
                this.view.getHomePanelNN().setVisible(true);
                this.view.getAboutMePanelNN().setVisible(false);
            }
        }

//          Button Thay doi
        if (e.getSource() == this.view.getButtonChange()) {
            this.view.setEnabled(false);
            this.view.getShowAllPanel().setVisible(true);
            this.view.getChangeDialog().setVisible(true);
            this.view.getChangeDialog().setSize(334, 555);
            this.view.getChangeDialog().setLocation((this.view.toolkit.width - 334) / 2, (this.view.toolkit.height - 555) / 2);
            this.view.getSaveButton().setVisible(true);
            this.view.getSaveButton().setEnabled(false);

            this.view.getMaMh().setText(String.valueOf(this.view.getCsdlTableShowItem().getValueAt(this.view.getCsdlTableShowItem().getSelectedRow(), 1)));
            this.view.getNameField().setText(String.valueOf(this.view.getCsdlTableShowItem().getValueAt(this.view.getCsdlTableShowItem().getSelectedRow(), 3)));
            this.view.getSlField().setText(String.valueOf(this.view.getCsdlTableShowItem().getValueAt(this.view.getCsdlTableShowItem().getSelectedRow(), 4)));
            this.view.getDayField().setText(String.valueOf(this.view.getCsdlTableShowItem().getValueAt(this.view.getCsdlTableShowItem().getSelectedRow(), 5)));
        }

//         Button Xoa       
        if (e.getSource() == this.view.getButtonDelete()) {
            this.view.setEnabled(false);
            this.view.getDeleteDialogYN().setVisible(true);
            this.view.getTestTer().setText(String.valueOf(this.view.getCsdlTableShowItem().getValueAt(this.view.getCsdlTableShowItem().getSelectedRow(), 1)) + " : " + this.view.getCsdlTableShowItem().getValueAt(this.view.getCsdlTableShowItem().getSelectedRow(), 3));
        }

        if (e.getSource() == this.view.getCancelDeleteYN()) {
            this.view.setEnabled(true);
            this.view.getDeleteDialogYN().setVisible(false);
        } else if (e.getSource() == this.view.getYesDeleteYN()) {

            if (this.view.getUsername().getText().equals("admin")) {
                try {
                    this.view.setEnabled(true);
                    this.view.getDeleteDialogYN().setVisible(false);
                    services.xoaMatHang(String.valueOf(this.view.getCsdlTableShowItem().getValueAt(this.view.getCsdlTableShowItem().getSelectedRow(), 1)));
                    this.view.getButtonChange().setEnabled(false);
                    this.view.getButtonDelete().setEnabled(false);

                    for (int i = this.view.getDtmCsdlShowItem().getRowCount() - 1; i >= 0; i--) {
                        this.view.getDtmCsdlShowItem().removeRow(i);
                    }

                    services.getAllMatHangTon().forEach(mh -> {
                        try {
                            this.view.getDtmCsdlShowItem().addRow(new Object[]{
                                ++counter,
                                mh.getMaMH(),
                                services.getTen(mh.getMaUser()),
                                mh.getTenMH(),
                                Integer.parseInt(mh.getSoLuong()),
                                mh.getNgayNhapXuat()
                            });
                        } catch (SQLException ex) {
                            Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    });
                    counter = 0;
                } catch (SQLException ex) {
                    Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    this.view.setEnabled(true);
                    this.view.getDeleteDialogYN().setVisible(false);
                    services.xoaMatHang(String.valueOf(this.view.getCsdlTableShowItemNN().getValueAt(this.view.getCsdlTableShowItemNN().getSelectedRow(), 0)));
                    this.view.getButtonChangeNN().setEnabled(false);
                    this.view.getButtonDeleteNN().setEnabled(false);
                    this.view.getButtonSpenndNN().setEnabled(false);

                    for (int i = this.view.getDtmCsdlShowItemNN().getRowCount() - 1; i >= 0; i--) {
                        this.view.getDtmCsdlShowItemNN().removeRow(i);
                    }

                    if (this.view.getComboBoxView().getSelectedItem().equals("Tất Cả")) {
                        services.getAllMatHangTon().forEach(mh -> {

                            this.view.getDtmCsdlShowItemNN().addRow(new Object[]{
                                mh.getMaMH(),
                                mh.getTenMH(),
                                Integer.parseInt(mh.getSoLuong()),
                                mh.getNgayNhapXuat()
                            });
                        });
                    } else {
                        services.getAllMatHangTonForUser(this.view.getUsername().getText()).forEach(mh -> {

                            this.view.getDtmCsdlShowItemNN().addRow(new Object[]{
                                mh.getMaMH(),
                                mh.getTenMH(),
                                Integer.parseInt(mh.getSoLuong()),
                                mh.getNgayNhapXuat()
                            });
                        });
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

//        ========= Xuat kho user =========
        if (e.getSource() == this.view.getButtonSpenndNN()) {
            this.view.getSlNNXuatField().setText("0");
            this.view.getGiamSL().setEnabled(false);
            this.view.getTangSL().setEnabled(true);
            this.view.getXuatKhoButtonXuat().setEnabled(false);
            this.view.setEnabled(false);
            this.view.getXuatKhoDialog().setVisible(true);

            this.view.getUserXuatNNField().setText(String.valueOf(this.view.getUsername().getText()));
            this.view.getMaMHXuatNNField().setText(String.valueOf(this.view.getCsdlTableShowItemNN().getValueAt(this.view.getCsdlTableShowItemNN().getSelectedRow(), 0)));
            this.view.getTenMHXuatNNField().setText(String.valueOf(this.view.getCsdlTableShowItemNN().getValueAt(this.view.getCsdlTableShowItemNN().getSelectedRow(), 1)));
            this.view.getXuatKhoDialog().setSize(300, 520);
            this.view.getXuatKhoDialog().setLocation((this.view.toolkit.width - 300) / 2, (this.view.toolkit.height - 520) / 2);
        }

//        ========= end =========
//          Button luu thong tin thay doi
        if (e.getSource() == this.view.getSaveButton()) {

            if (KeyEvent.checkTableReload) {
                KeyEvent.checkTableReload = false;
                try {
                    services.changeMatHang(new MatHang(this.view.getMaMh().getText(),
                            this.view.getNameField().getText(),
                            this.view.getSlField().getText(),
                            this.view.getDayField().getText(), null));

                    if (this.view.getUsername().getText().equals("admin")) {
                        for (int i = this.view.getDtmCsdlShowItem().getRowCount() - 1; i >= 0; i--) {
                            this.view.getDtmCsdlShowItem().removeRow(i);
                        }

                        services.getAllMatHangTon().forEach(mh -> {
                            try {
                                this.view.getDtmCsdlShowItem().addRow(new Object[]{
                                    ++counter,
                                    mh.getMaMH(),
                                    services.getTen(mh.getMaUser()),
                                    mh.getTenMH(),
                                    Integer.parseInt(mh.getSoLuong()),
                                    mh.getNgayNhapXuat()
                                });
                            } catch (SQLException ex) {
                                Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        });
                        counter = 0;
                    } else if (this.view.getComboBoxView().getSelectedItem().equals("Tất Cả")) {
                        for (int i = this.view.getDtmCsdlShowItemNN().getRowCount() - 1; i >= 0; i--) {
                            this.view.getDtmCsdlShowItemNN().removeRow(i);
                        }
                        services.getAllMatHangTon().forEach(mh -> {

                            this.view.getDtmCsdlShowItemNN().addRow(new Object[]{
                                mh.getMaMH(),
                                mh.getTenMH(),
                                Integer.parseInt(mh.getSoLuong()),
                                mh.getNgayNhapXuat()
                            });
                        });
                    } else {
                        for (int i = this.view.getDtmCsdlShowItemNN().getRowCount() - 1; i >= 0; i--) {
                            this.view.getDtmCsdlShowItemNN().removeRow(i);
                        }
                        services.getAllMatHangTonForUser(this.view.getUsername().getText()).forEach(mh -> {

                            this.view.getDtmCsdlShowItemNN().addRow(new Object[]{
                                mh.getMaMH(),
                                mh.getTenMH(),
                                Integer.parseInt(mh.getSoLuong()),
                                mh.getNgayNhapXuat()
                            });
                        });
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
                }

                this.view.getButtonChange().setEnabled(false);
                this.view.getButtonDelete().setEnabled(false);
                this.view.getButtonChangeNN().setEnabled(false);
                this.view.getButtonDeleteNN().setEnabled(false);
                this.view.getButtonSpenndNN().setEnabled(false);
            } else {
                System.out.println("============KHONG LOAD LAI BANG");
            }

            this.view.setEnabled(true);
            this.view.getChangeDialog().setVisible(false);
            this.view.getError_message_change_infor().setText("");
            this.view.getSaveButton().setEnabled(false);
        }

//          Button Xem Nhap-Xuat kho
        if (e.getSource() == this.view.getButtonCheck()) {
            this.view.setTitle("Lịch Sử Nhập Xuất");
            this.view.getInAndOutPanel().setSize(900, 700);
            this.view.getBackItem().setVisible(true);
            this.view.getShowAllPanel().setVisible(false);
            this.view.getInAndOutPanel().setVisible(true);

        }

        if (e.getSource() == this.view.getSelectInOut()) {
            KeyEvent.checkPress = true;
        }

        if (e.getSource() == this.view.getButtonSeachInOut()) {
            if (KeyEvent.checkPress) {
                KeyEvent.checkPress = false;
                for (int i = this.view.getDtmCsdlTableIntAndOut().getRowCount() - 1; i >= 0; i--) {
                    this.view.getDtmCsdlTableIntAndOut().removeRow(i);
                }

                if (this.view.getSelectInOut().getSelectedItem().equals("Nhập")) {
                    typeProcess = "showHistoryInOutNhap";

                    this.view.getTimeBegin().setEditable(false);
                    this.view.getTimeEnd().setEditable(false);
                    this.view.getSelectInOut().setEnabled(false);
                    this.view.getButtonSeachInOut().setEnabled(false);

                    ThreadProcess process = new ThreadProcess(this);
                    process.setPriority(Thread.MAX_PRIORITY);
                    process.start();

                    this.view.getCsdlTableInAndOut().getColumnModel().getColumn(1).setHeaderValue("TÊN NGƯỜI NHẬP");
                    this.view.getCsdlTableInAndOut().getColumnModel().getColumn(5).setHeaderValue("NGÀY NHẬP");
                    this.view.getCsdlTableInAndOut().repaint();
                } else {
                    typeProcess = "showHistoryInOutXuat";

                    this.view.getTimeBegin().setEditable(false);
                    this.view.getTimeEnd().setEditable(false);
                    this.view.getSelectInOut().setEnabled(false);
                    this.view.getButtonSeachInOut().setEnabled(false);

                    ThreadProcess process = new ThreadProcess(this);
                    process.setPriority(Thread.MAX_PRIORITY);
                    process.start();

                    this.view.getCsdlTableInAndOut().getColumnModel().getColumn(1).setHeaderValue("TÊN NGƯỜI XUẤT");
                    this.view.getCsdlTableInAndOut().getColumnModel().getColumn(5).setHeaderValue("NGÀY XUẤT");
                    this.view.getCsdlTableInAndOut().repaint();
                }
            } else {
                System.out.println("-----------KHONG LOAD");
            }

        }

//          Button User
        if (e.getSource() == this.view.getButtonUser()) {

            for (int i = this.view.getDtmCsdlTableUser().getRowCount() - 1; i >= 0; i--) {
                this.view.getDtmCsdlTableUser().removeRow(i);
            }

            try {
                services.getAllUsersWithout("admin").forEach(nn -> {
                    this.view.getDtmCsdlTableUser().addRow(new Object[]{
                        nn.getUsername(),
                        nn.getPassword(),
                        nn.getName(),
                        nn.getGender(),
                        nn.getBirthday()
                    });
                });

                this.view.getShowAllPanel().setVisible(false);
                this.view.getUserPanel().setVisible(true);
                this.view.getBackItem().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

//          Button thay doi thong tin User
        if (e.getSource() == this.view.getChinhSuaNVButton()) {

            this.view.getIdUserChange().setText(String.valueOf(this.view.getCsdlTableUser().getValueAt(this.view.getCsdlTableUser().getSelectedRow(), 0)));
            this.view.getNameUserChangeField().setText(String.valueOf(this.view.getCsdlTableUser().getValueAt(this.view.getCsdlTableUser().getSelectedRow(), 2)));
            this.view.getPassUserChangeField().setText(String.valueOf(this.view.getCsdlTableUser().getValueAt(this.view.getCsdlTableUser().getSelectedRow(), 1)));
            this.view.getDateUserChangeField().setText(String.valueOf(this.view.getCsdlTableUser().getValueAt(this.view.getCsdlTableUser().getSelectedRow(), 4)));
            this.view.getGenderChange().setSelectedItem(String.valueOf(this.view.getCsdlTableUser().getValueAt(this.view.getCsdlTableUser().getSelectedRow(), 3)));

            this.view.getSaveUserChangeButton().setEnabled(true);
            this.view.getChinhSuaUserDialog().setVisible(true);
            this.view.getChinhSuaUserDialog().setSize(302, 540);
            this.view.getChinhSuaUserDialog().setLocation((this.view.toolkit.width - 302) / 2, (this.view.toolkit.height - 540) / 2);
            this.view.getNameUserChangeField().setVisible(true);
            this.view.setEnabled(false);
        }

//          Button Lich Su Giao dich
        if (e.getSource() == this.view.getLsGiaoDichButton()) {
            try {
                this.view.getSelectLoaiHistoryDialog().setSelectedItem("Nhập");
                for (int i = this.view.getDtmLichSuGiaoDichTable().getRowCount() - 1; i >= 0; i--) {
                    this.view.getDtmLichSuGiaoDichTable().removeRow(i);
                }

                this.view.getIdLable().setText(String.valueOf(this.view.getCsdlTableUser().getValueAt(this.view.getCsdlTableUser().getSelectedRow(), 0)));
                this.view.getFullNameLable().setText(String.valueOf(this.view.getCsdlTableUser().getValueAt(this.view.getCsdlTableUser().getSelectedRow(), 2)));

                services.getAllMatHangNhapForUser(this.view.getIdLable().getText()).forEach(mh -> {
                    this.view.getDtmLichSuGiaoDichTable().addRow(new Object[]{
                        mh.getMaMH(),
                        mh.getTenMH(),
                        Integer.valueOf(mh.getSoLuong()),
                        mh.getNgayNhapXuat()
                    });
                });

                this.view.setEnabled(false);
                this.view.getLichSuGiaoDichDialog().setTitle("Lịch Sử Nhập");
                this.view.getLichSuGiaoDichDialog().setSize(900, 666);
                this.view.getLichSuGiaoDichDialog().setLocation((this.view.toolkit.width - 900) / 2, (this.view.toolkit.height - 666) / 2);
                this.view.getLichSuGiaoDichDialog().setVisible(true);
                this.view.getLichSuGiaoDichTable().setEnabled(false);
            } catch (SQLException ex) {
                Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

//          Button luu thay doi User(saveUserChangeButton)
        if (e.getSource() == this.view.getSaveUserChangeButton()) {
            try {
                services.updateUser(new NguoiNhap(this.view.getIdUserChange().getText(), String.valueOf(this.view.getPassUserChangeField().getPassword()),
                        this.view.getNameUserChangeField().getText(), String.valueOf(this.view.getGenderChange().getSelectedItem()),
                        this.view.getDateUserChangeField().getText()));
                this.view.getUserView().setText(services.getTen(this.view.getUsername().getText()));

                for (int i = this.view.getDtmCsdlTableUser().getRowCount() - 1; i >= 0; i--) {
                    this.view.getDtmCsdlTableUser().removeRow(i);
                }
                delete = true;
                
                services.getAllUsersWithout("admin").forEach(nn -> {
                    this.view.getDtmCsdlTableUser().addRow(new Object[]{
                        nn.getUsername(),
                        nn.getPassword(),
                        nn.getName(),
                        nn.getGender(),
                        nn.getBirthday()
                    });
                });
            } catch (SQLException ex) {
                Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.view.setEnabled(true);
            this.view.getLsGiaoDichButton().setEnabled(false);
            this.view.getXoaNVButton().setEnabled(false);
            this.view.getChinhSuaNVButton().setEnabled(false);
            this.view.getChinhSuaUserDialog().setVisible(false);
        }

//        Tro lai
        if (e.getSource() == this.view.getBackItem()) {
            this.view.getShowAllPanel().setVisible(true);
            this.view.getLsGiaoDichButton().setEnabled(false);
            this.view.getXoaNVButton().setEnabled(false);
            this.view.getChinhSuaNVButton().setEnabled(false);

            this.view.getBackItem().setVisible(false);
            this.view.getInAndOutPanel().setVisible(false);
            this.view.setTitle("Quản Lý Kho Hàng");
            this.view.getUserPanel().setVisible(false);

            if (this.view.getUsername().getText().equals("admin")) {
                if (delete) {
                    delete = false;
                    for (int i = this.view.getDtmCsdlShowItem().getRowCount() - 1; i >= 0; i--) {
                        this.view.getDtmCsdlShowItem().removeRow(i);
                    }

                    typeProcess = "showListMatHangAdmin";

                    ThreadProcess process = new ThreadProcess(this);
                    process.setPriority(Thread.MAX_PRIORITY);
                    process.start();
                }
                this.view.getHomeMenu().setEnabled(false);
                this.view.getHelpMenu().setEnabled(true);
                this.view.getHomePanel().setVisible(true);
                this.view.getAboutMePanel().setVisible(false);
            } else {
                this.view.getHomeMenu().setEnabled(false);
                this.view.getHelpMenu().setEnabled(true);
                this.view.getHomePanelNN().setVisible(true);
                this.view.getAboutMePanelNN().setVisible(false);
            }
        }

//        Hien thi Dialog for Logout
        if (e.getSource() == this.view.getLogout()) {
            this.view.getExitDialog().setVisible(true);
            this.view.getChangeDialog().setVisible(false);
            this.view.getExitDialog().setSize(300, 200);
            this.view.getExitDialog().setLocation((this.view.toolkit.width - 300) / 2, (this.view.toolkit.height - 200) / 2);
            this.view.setEnabled(false);
        }

//        Logout
        if (this.view.getYesExit() == e.getSource()) {
//            Hien thi man hinh Dang Nhap
            this.view.getBackItem().setVisible(false);
            this.view.setEnabled(true);
            this.view.getAdminPanel().setVisible(false);
            services.backToLoginPanel(this.view);
            this.view.getComboBoxView().setSelectedItem("Tất Cả");

            if (this.view.getUsername().getText().equals("admin")) {
                for (int i = this.view.getDtmCsdlShowItem().getRowCount() - 1; i >= 0; i--) {
                    this.view.getDtmCsdlShowItem().removeRow(i);
                }
                this.view.getAdminPanel().setVisible(false);
                this.view.getButtonChange().setEnabled(false);
                this.view.getButtonDelete().setEnabled(false);
                this.view.getHomePanel().setVisible(true);
                this.view.getAboutMePanel().setVisible(false);
            } else {
                for (int i = this.view.getDtmCsdlShowItemNN().getRowCount() - 1; i >= 0; i--) {
                    this.view.getDtmCsdlShowItemNN().removeRow(i);
                }
                this.view.getNguoiNhapPanel().setVisible(false);
                this.view.getButtonChangeNN().setEnabled(false);
                this.view.getButtonDeleteNN().setEnabled(false);
                this.view.getHomePanelNN().setVisible(false);
                this.view.getAboutMePanelNN().setVisible(false);
                this.view.getCsdlTableShowItemNN().setVisible(false);
                this.view.getLichSuGiaoDichTable().setVisible(false);
            }

        } else if (this.view.getCancelExit() == e.getSource()) {
            this.view.setEnabled(true);
            this.view.getExitDialog().setVisible(false);
        }

//        Dang Ky Button
        if (this.view.getSubsButton() == e.getSource()) {
            try {
                boolean result = services.subsAccount(new NguoiNhap(this.view.getUsernameSubs_input().getText(),
                        String.valueOf(this.view.getPasswordSubs_input().getPassword()),
                        this.view.getFullNameSubs_input().getText(),
                        String.valueOf(this.view.getGenderSubs_input().getSelectedItem()),
                        this.view.getBirthdaySubs_input().getText()));

                this.view.getUsername().setText(this.view.getUsernameSubs_input().getText());
                this.view.getPassword().setText("");
                this.view.getUsernameSubs_input().setText("");
                this.view.getPasswordSubs_input().setText("");
                this.view.getRetypePasswordSubs_input().setText("");
                this.view.getFullNameSubs_input().setText("");
                this.view.getBirthdaySubs_input().setText("");

                if (result) {
                    this.view.setTitle("Đăng Nhập");
                    this.view.setSize(350, 618);
                    this.view.setLocation((this.view.toolkit.width - 350) / 2, (this.view.toolkit.height - 618) / 2);
                    this.view.getError_message().setText("Đăng ký thành công!");
                    this.view.getSubscribePanel().setVisible(false);
                    this.view.getLoginPanel().setVisible(true);
                } else {
                    this.view.getError_messageSubs().setText("Tài khoản đã tồn tại!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

//        Hủy button trong ChangeDialog
        if (this.view.getResetButtonChange() == e.getSource()) {
            this.view.getNameField().setText("");
            this.view.getSlField().setText("");
            this.view.getDayField().setText("");
            this.view.getError_message_change_infor().setText("");
            this.view.getSaveButton().setEnabled(false);
        }

//        Huy Button trong ChinhSuaUserDialog
        if (this.view.getResetButtonChinhSua() == e.getSource()) {
            this.view.getPassUserChangeField().setText("");
            this.view.getNameUserChangeField().setText("");
            this.view.getDateUserChangeField().setText("");
            this.view.getErrorChinhSuaUser().setText("");
            this.view.getSaveUserChangeButton().setEnabled(false);
        }

//        Huy Button trong addMatHang
        if (this.view.getResetButtonAddMatHang() == e.getSource()) {
            this.view.getMaMHAddField().setText("");
            this.view.getNameAddField().setText("");
            this.view.getSlAddField().setText("");
            this.view.getDayAddField().setText("");
            this.view.getError_message_add_infor().setText("");
            this.view.getAddMHButton().setEnabled(false);
        }

//        =======================================PHAN NGUOI NHAP=======================================
//        Button Thay doi thong tin mat hang
        if (e.getSource() == this.view.getButtonChangeNN()) {
            this.view.setEnabled(false);
            this.view.getChangeDialog().setVisible(true);
            this.view.getChangeDialog().setSize(334, 555);
            this.view.getChangeDialog().setLocation((this.view.toolkit.width - 334) / 2, (this.view.toolkit.height - 555) / 2);
            this.view.getSaveButton().setVisible(true);
            this.view.getSaveButton().setEnabled(false);

            this.view.getMaMh().setText(String.valueOf(this.view.getCsdlTableShowItemNN().getValueAt(this.view.getCsdlTableShowItemNN().getSelectedRow(), 0)));
            this.view.getNameField().setText(String.valueOf(this.view.getCsdlTableShowItemNN().getValueAt(this.view.getCsdlTableShowItemNN().getSelectedRow(), 1)));
            this.view.getSlField().setText(String.valueOf(this.view.getCsdlTableShowItemNN().getValueAt(this.view.getCsdlTableShowItemNN().getSelectedRow(), 2)));
            this.view.getDayField().setText(String.valueOf(this.view.getCsdlTableShowItemNN().getValueAt(this.view.getCsdlTableShowItemNN().getSelectedRow(), 3)));
        }

//          Button add mat hang
        if (e.getSource() == this.view.getButtonAddNN()) {
            this.view.setEnabled(false);
            this.view.getAddMatHangDialog().setVisible(true);
            this.view.getAddMatHangDialog().setSize(320, 525);
            this.view.getAddMatHangDialog().setTitle("Thêm Mặt Hàng Mới");
            this.view.getAddMatHangDialog().setLocation((this.view.toolkit.width - 320) / 2, (this.view.toolkit.height - 525) / 2);

        }
//          Button xem lich su
        if (e.getSource() == this.view.getButtonHistoryNN()) {
            try {
                this.view.getSelectLoaiHistoryDialog().setSelectedItem("Nhập");
                for (int i = this.view.getDtmLichSuGiaoDichTable().getRowCount() - 1; i >= 0; i--) {
                    this.view.getDtmLichSuGiaoDichTable().removeRow(i);
                }

                this.view.getIdLable().setText(String.valueOf(this.view.getUsername().getText()));
                this.view.getFullNameLable().setText(services.getTen(this.view.getUsername().getText()));

                services.getAllMatHangNhapForUser(this.view.getIdLable().getText()).forEach(mh -> {
                    this.view.getDtmLichSuGiaoDichTable().addRow(new Object[]{
                        mh.getMaMH(),
                        mh.getTenMH(),
                        Integer.valueOf(mh.getSoLuong()),
                        mh.getNgayNhapXuat()
                    });
                });

                this.view.setEnabled(false);
                this.view.getLichSuGiaoDichDialog().setTitle("Lịch Sử Nhập");
                this.view.getLichSuGiaoDichDialog().setSize(900, 666);
                this.view.getLichSuGiaoDichDialog().setLocation((this.view.toolkit.width - 900) / 2, (this.view.toolkit.height - 666) / 2);
                this.view.getLichSuGiaoDichDialog().setVisible(true);
                this.view.getLichSuGiaoDichTable().setEnabled(false);
            } catch (SQLException ex) {
                Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.view.setEnabled(false);
            this.view.getLichSuGiaoDichDialog().setTitle("Lịch Sử Nhập");
            this.view.getLichSuGiaoDichDialog().setSize(900, 666);
            this.view.getLichSuGiaoDichDialog().setLocation((this.view.toolkit.width - 900) / 2, (this.view.toolkit.height - 666) / 2);
            this.view.getLichSuGiaoDichDialog().setVisible(true);
            this.view.getLichSuGiaoDichTable().setEnabled(false);
        }

        if (e.getSource() == this.view.getAddMHButton()) {

            try {
                this.view.getButtonChangeNN().setEnabled(false);
                this.view.getButtonDeleteNN().setEnabled(false);
                this.view.getButtonSpenndNN().setEnabled(false);
                this.view.setEnabled(true);
                this.view.getAddMatHangDialog().setVisible(false);
                this.view.getAddMHButton().setEnabled(false);

                this.view.getDtmCsdlShowItemNN().addRow(new Object[]{
                    this.view.getMaMHAddField().getText(),
                    this.view.getNameAddField().getText(),
                    this.view.getSlAddField().getText(),
                    this.view.getDayAddField().getText()
                });
                services.addMatHang(this.view.getMaMHAddField().getText(), this.view.getNameAddField().getText(),
                        this.view.getSlAddField().getText(), this.view.getDayAddField().getText(),
                        this.view.getUsername().getText());

                for (int i = this.view.getDtmCsdlShowItemNN().getRowCount() - 1; i >= 0; i--) {
                    this.view.getDtmCsdlShowItemNN().removeRow(i);
                }

                if (this.view.getComboBoxView().getSelectedItem().equals("Cá Nhân")) {
                    try {
                        services.getAllMatHangTonForUser(this.view.getUsername().getText()).forEach(mh -> {
                            this.view.getDtmCsdlShowItemNN().addRow(new Object[]{
                                mh.getMaMH(),
                                mh.getTenMH(),
                                Integer.valueOf(mh.getSoLuong()),
                                mh.getNgayNhapXuat()
                            });
                        });
                    } catch (SQLException ex) {
                        Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (this.view.getComboBoxView().getSelectedItem().equals("Tất Cả")) {
                    try {
                        services.getAllMatHangTon().forEach(mh -> {
                            this.view.getDtmCsdlShowItemNN().addRow(new Object[]{
                                mh.getMaMH(),
                                mh.getTenMH(),
                                Integer.valueOf(mh.getSoLuong()),
                                mh.getNgayNhapXuat()
                            });
                        });
                    } catch (SQLException ex) {
                        Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                this.view.getMaMHAddField().setText("");
                this.view.getNameAddField().setText("");
                this.view.getSlAddField().setText("");
            } catch (SQLException ex) {
                Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
//        Button Xuat Kho Hang cho User
        if (e.getSource() == this.view.getXuatKhoButtonXuat()) {
            try {

                boolean temp = Integer.parseInt(this.view.getSlNNXuatField().getText()) == Integer.parseInt(String.valueOf(this.view.getCsdlTableShowItemNN().getValueAt(this.view.getCsdlTableShowItemNN().getSelectedRow(), 2)));
                services.insertMatHangXuat(new MatHang(this.view.getMaMHXuatNNField().getText(), this.view.getTenMHXuatNNField().getText(),
                        String.valueOf(Integer.parseInt(String.valueOf(this.view.getCsdlTableShowItemNN().getValueAt(this.view.getCsdlTableShowItemNN().getSelectedRow(), 2)))
                                - Integer.parseInt(this.view.getSlNNXuatField().getText())), this.view.getNgayXuatNNField().getText(),
                        this.view.getUserXuatNNField().getText()),
                        Integer.parseInt(this.view.getSlNNXuatField().getText()), temp);

                for (int i = this.view.getDtmCsdlShowItemNN().getRowCount() - 1; i >= 0; i--) {
                    this.view.getDtmCsdlShowItemNN().removeRow(i);
                }

                if (this.view.getComboBoxView().getSelectedItem().equals("Cá Nhân")) {
                    try {
                        services.getAllMatHangTonForUser(this.view.getUsername().getText()).forEach(mh -> {
                            this.view.getDtmCsdlShowItemNN().addRow(new Object[]{
                                mh.getMaMH(),
                                mh.getTenMH(),
                                Integer.valueOf(mh.getSoLuong()),
                                mh.getNgayNhapXuat()
                            });
                        });
                    } catch (SQLException ex) {
                        Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (this.view.getComboBoxView().getSelectedItem().equals("Tất Cả")) {
                    try {
                        services.getAllMatHangTon().forEach(mh -> {
                            this.view.getDtmCsdlShowItemNN().addRow(new Object[]{
                                mh.getMaMH(),
                                mh.getTenMH(),
                                Integer.valueOf(mh.getSoLuong()),
                                mh.getNgayNhapXuat()
                            });
                        });
                    } catch (SQLException ex) {
                        Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                this.view.setEnabled(true);
                this.view.getXuatKhoDialog().setVisible(false);
                this.view.getSlNNXuatField().setText("0");
                this.view.getGiamSL().setEnabled(false);
                this.view.getTangSL().setEnabled(true);
                this.view.getButtonSpenndNN().setEnabled(false);
                this.view.getButtonChangeNN().setEnabled(false);
                this.view.getButtonDeleteNN().setEnabled(false);

            } catch (SQLException ex) {
                Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (e.getSource() == this.view.getTangSL()) {
            int temp = Integer.parseInt(this.view.getSlNNXuatField().getText());

            if (temp < Integer.parseInt(String.valueOf(this.view.getCsdlTableShowItemNN().getValueAt(this.view.getCsdlTableShowItemNN().getSelectedRow(), 2)))) {
                this.view.getSlNNXuatField().setText(String.valueOf(++temp));
                this.view.getXuatKhoButtonXuat().setEnabled(true);
                this.view.getGiamSL().setEnabled(true);
            } else {
                this.view.getXuatKhoButtonXuat().setEnabled(true);
                this.view.getGiamSL().setEnabled(true);
                this.view.getTangSL().setEnabled(false);
            }

        }

        if (e.getSource() == this.view.getGiamSL()) {
            int temp = Integer.parseInt(this.view.getSlNNXuatField().getText());
            this.view.getSlNNXuatField().setText(String.valueOf(--temp));
            this.view.getTangSL().setEnabled(true);
            this.view.getXuatKhoButtonXuat().setEnabled(true);

            if (temp <= 0) {
                this.view.getXuatKhoButtonXuat().setEnabled(false);
                this.view.getGiamSL().setEnabled(false);
                this.view.getTangSL().setEnabled(true);
            }
        }

        if (e.getSource() == this.view.getSelectLoaiHistoryDialog()) {
            if (this.view.getSelectLoaiHistoryDialog().getSelectedIndex() != index1) {
                index1 = this.view.getSelectLoaiHistoryDialog().getSelectedIndex();
                if (String.valueOf(this.view.getSelectLoaiHistoryDialog().getSelectedItem()).equals("Nhập")) {
                    for (int i = this.view.getDtmLichSuGiaoDichTable().getRowCount() - 1; i >= 0; i--) {
                        this.view.getDtmLichSuGiaoDichTable().removeRow(i);
                    }

                    try {
                        services.getAllMatHangNhapForUser(this.view.getIdLable().getText()).forEach(mh -> {
                            this.view.getDtmLichSuGiaoDichTable().addRow(new Object[]{
                                mh.getMaMH(),
                                mh.getTenMH(),
                                Integer.valueOf(mh.getSoLuong()),
                                mh.getNgayNhapXuat()
                            });
                        });
                    } catch (SQLException ex) {
                        Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    this.view.getLichSuGiaoDichDialog().setTitle("Lịch Sử Nhập");
                    this.view.getLichSuGiaoDichTable().getColumnModel().getColumn(3).setHeaderValue("Ngày Nhập");
                    this.view.getLichSuGiaoDichTable().getColumnModel().getColumn(2).setHeaderValue("Số Lượng Nhập");
                    this.view.getLichSuGiaoDichTable().repaint();
                } else if (String.valueOf(this.view.getSelectLoaiHistoryDialog().getSelectedItem()).equals("Xuất")) {
                    System.out.println("Vao");
                    for (int i = this.view.getDtmLichSuGiaoDichTable().getRowCount() - 1; i >= 0; i--) {
                        this.view.getDtmLichSuGiaoDichTable().removeRow(i);
                    }

                    try {
                        services.getAllMatHangXuatForUser(this.view.getIdLable().getText()).forEach(mh -> {
                            this.view.getDtmLichSuGiaoDichTable().addRow(new Object[]{
                                mh.getMaMH(),
                                mh.getTenMH(),
                                Integer.valueOf(mh.getSoLuong()),
                                mh.getNgayNhapXuat()
                            });
                        });
                    } catch (SQLException ex) {
                        Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    if (this.view.getUsername().getText().equals("admin")) {
                        this.view.getIdLable().setText(String.valueOf(this.view.getCsdlTableUser().getValueAt(this.view.getCsdlTableUser().getSelectedRow(), 0)));
                        this.view.getFullNameLable().setText(String.valueOf(this.view.getCsdlTableUser().getValueAt(this.view.getCsdlTableUser().getSelectedRow(), 2)));
                    }

                    this.view.getLichSuGiaoDichDialog().setTitle("Lịch Sử Xuất");
                    this.view.getLichSuGiaoDichTable().getColumnModel().getColumn(3).setHeaderValue("Ngày Xuất");
                    this.view.getLichSuGiaoDichTable().getColumnModel().getColumn(2).setHeaderValue("Số Lượng Xuất");
                    this.view.getLichSuGiaoDichTable().repaint();
                }
            } else {
                System.out.println("KHONG LOAD LICH SU GIAO DICH");
            }

        }

        if (this.view.getComboBoxView() == e.getSource()) {
            if (this.view.getComboBoxView().getSelectedIndex() != index) {
                index = this.view.getComboBoxView().getSelectedIndex();

                this.view.getButtonChangeNN().setEnabled(false);
                this.view.getButtonDeleteNN().setEnabled(false);
                this.view.getButtonSpenndNN().setEnabled(false);
                for (int i = this.view.getDtmCsdlShowItemNN().getRowCount() - 1; i >= 0; i--) {
                    this.view.getDtmCsdlShowItemNN().removeRow(i);
                }

                if (this.view.getComboBoxView().getSelectedItem().equals("Cá Nhân")) {
                    try {
                        services.getAllMatHangTonForUser(this.view.getUsername().getText()).forEach(mh -> {
                            this.view.getDtmCsdlShowItemNN().addRow(new Object[]{
                                mh.getMaMH(),
                                mh.getTenMH(),
                                Integer.valueOf(mh.getSoLuong()),
                                mh.getNgayNhapXuat()
                            });
                        });
                    } catch (SQLException ex) {
                        Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (this.view.getComboBoxView().getSelectedItem().equals("Tất Cả")) {
                    try {
                        services.getAllMatHangTon().forEach(mh -> {
                            this.view.getDtmCsdlShowItemNN().addRow(new Object[]{
                                mh.getMaMH(),
                                mh.getTenMH(),
                                Integer.valueOf(mh.getSoLuong()),
                                mh.getNgayNhapXuat()
                            });
                        });
                    } catch (SQLException ex) {
                        Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                System.out.println("Khong load combobox");
            }

        }

        if (e.getSource() == this.view.getXoaNVButton()) {
            try {
                if (services.getAllMatHangNhapForUser(String.valueOf(this.view.getCsdlTableUser().getValueAt(this.view.getCsdlTableUser().getSelectedRow(), 0))).isEmpty()
                        && services.getAllMatHangTonForUser(String.valueOf(this.view.getCsdlTableUser().getValueAt(this.view.getCsdlTableUser().getSelectedRow(), 0))).isEmpty()
                        && services.getAllMatHangXuatForUser(String.valueOf(this.view.getCsdlTableUser().getValueAt(this.view.getCsdlTableUser().getSelectedRow(), 0))).isEmpty()) {
                    this.view.setEnabled(false);
                    this.view.getSelectDeleteDialog().setVisible(true);
                } else {
                    try {
                        for (int i = this.view.getDtmTableSearch().getRowCount() - 1; i >= 0; i--) {
                            this.view.getDtmTableSearch().removeRow(i);
                        }

                        services.getAllUsersWithout(String.valueOf(this.view.getCsdlTableUser().getValueAt(this.view.getCsdlTableUser().getSelectedRow(), 0))).forEach(user -> {
                            this.view.getDtmTableSearch().addRow(new Object[]{
                                user.getUsername(),
                                user.getName()
                            });
                        });
                    } catch (SQLException ex) {
                        Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    this.view.getDeleteNVButton().setEnabled(false);
                    this.view.getMaNV().setText("");
                    this.view.getSearchBy().setSelectedIndex(0);
                    this.view.getHoTenNV().setText(String.valueOf(this.view.getCsdlTableUser().getValueAt(this.view.getCsdlTableUser().getSelectedRow(), 2)));
                    this.view.getDeleteUserDialog().setVisible(true);
                    this.view.setEnabled(false);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (e.getSource() == this.view.getDeleteNVButton()) {
            try {
                services.updateMathangForUser(String.valueOf(this.view.getCsdlTableUser().getValueAt(this.view.getCsdlTableUser().getSelectedRow(), 0)),
                        String.valueOf(this.view.getTableSearch().getValueAt(this.view.getTableSearch().getSelectedRow(), 0)));
            } catch (SQLException ex) {
                Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
            }

            for (int i = this.view.getDtmCsdlTableUser().getRowCount() - 1; i >= 0; i--) {
                this.view.getDtmCsdlTableUser().removeRow(i);
            }

            delete = true;

            try {
                services.getAllUsersWithout("admin").forEach(nn -> {
                    this.view.getDtmCsdlTableUser().addRow(new Object[]{
                        nn.getUsername(),
                        nn.getPassword(),
                        nn.getName(),
                        nn.getGender(),
                        nn.getBirthday()
                    });
                });
            } catch (SQLException ex) {
                Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.view.setEnabled(true);
            this.view.getDeleteUserDialog().setVisible(false);
            this.view.getButtonDelete().setEnabled(false);
            this.view.getButtonChange().setEnabled(false);
        }

        if (e.getSource() == this.view.getCancelDeleteUser()) {
            this.view.setEnabled(true);
            this.view.getSelectDeleteDialog().setVisible(false);
        }

        if (e.getSource() == this.view.getYesDeleteUser()) {
            try {
                services.deleteUser(String.valueOf(this.view.getCsdlTableUser().getValueAt(this.view.getCsdlTableUser().getSelectedRow(), 0)));
            } catch (SQLException ex) {
                Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
            }

            for (int i = this.view.getDtmCsdlTableUser().getRowCount() - 1; i >= 0; i--) {
                this.view.getDtmCsdlTableUser().removeRow(i);
            }

            try {
                services.getAllUsersWithout("admin").forEach(nn -> {
                    this.view.getDtmCsdlTableUser().addRow(new Object[]{
                        nn.getUsername(),
                        nn.getPassword(),
                        nn.getName(),
                        nn.getGender(),
                        nn.getBirthday()
                    });
                });
            } catch (SQLException ex) {
                Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.view.setEnabled(true);
            this.view.getSelectDeleteDialog().setVisible(false);
        }

        if (e.getSource() == this.view.getChangeInforItem()) {
            this.view.getChinhSuaUserDialog().setVisible(true);
            this.view.getChinhSuaUserDialog().setSize(302, 540);
            this.view.getChinhSuaUserDialog().setLocation((this.view.toolkit.width - 302) / 2, (this.view.toolkit.height - 540) / 2);
            this.view.getNameUserChangeField().setVisible(true);
            this.view.setEnabled(false);
        }

        if (e.getSource() == this.view.getButtonDeleteNN()) {
            this.view.setEnabled(false);
            this.view.getDeleteDialogYN().setVisible(true);
        }

        if (e.getSource() == this.view.getChangeInforItem()) {
            try {
                NguoiNhap nn = services.getUser(this.view.getUsername().getText());
                this.view.getSaveUserChangeButton().setEnabled(true);
                this.view.getIdUserChange().setText(this.view.getUsername().getText());
                this.view.getNameUserChangeField().setText(nn.getName());
                this.view.getPassUserChangeField().setText(nn.getPassword());
                this.view.getDateUserChangeField().setText(nn.getBirthday());
                this.view.getGenderChange().setSelectedItem(nn.getGender());
            } catch (SQLException ex) {
                Logger.getLogger(ActionEvent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
