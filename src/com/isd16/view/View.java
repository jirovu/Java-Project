package com.isd16.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vietanh
 */
public final class View extends javax.swing.JFrame {

    public final Dimension toolkit = Toolkit.getDefaultToolkit().getScreenSize();

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        exitDialog.setVisible(false);
        login.setEnabled(false);
        subscribePanel.setVisible(false);
        adminPanel.setVisible(false);
        loginPanel.setVisible(true);
        Menu.setVisible(false);
        homeMenu.setEnabled(false);
        aboutMePanel.setVisible(false);
        aboutMePanelNN.setVisible(false);
        subsButton.setEnabled(false);
        nguoiNhapPanel.setVisible(false);
        panelShowItem.setVisible(false);
        buttonChange.setEnabled(false);
        inAndOutPanel.setVisible(false);
        showAllPanel.setVisible(true);
        backItem.setVisible(false);
        aboutMePanel.setVisible(false);
        changeDialog.setVisible(false);
        saveButton.setEnabled(false);
        buttonDelete.setEnabled(false);
        xoaNVButton.setEnabled(false);
        buttonSpendNN.setEnabled(false);
        chinhSuaNVButton.setEnabled(false);
        saveUserChangeButton.setEnabled(false);
        userPanel.setVisible(false);
        lsGiaoDichButton.setEnabled(false);
        buttonSeachInOut.setEnabled(false);
        buttonDeleteNN.setEnabled(false);
        buttonHistoryNN.setEnabled(true);
        addMHButton.setEnabled(false);
        buttonChangeNN.setEnabled(false);
        userXuatNNField.setEditable(false);
        maMHXuatNNField.setEditable(false);
        tenMHXuatNNField.setEditable(false);
        ngayXuatNNField.setEditable(false);
        slNNXuatField.setText("0");
        giamSL.setEnabled(false);
        xuatKhoButtonXuat.setEnabled(false);
        deleteUserDialog.setVisible(false);
        deleteNVButton.setEnabled(false);
        selectDeleteDialog.setVisible(false);
        dayAddField.setEditable(false);

//        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../images/clipboard.png")));
        Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        ngayXuatNNField.setText(format.format(now));
        dayAddField.setText(format.format(now));

        adminPanel.setSize(1200, 750);
        nguoiNhapPanel.setSize(1200, 750);
        deleteUserDialog.setSize(420, 633);
        deleteUserDialog.setLocation((toolkit.width - 420) / 2, (toolkit.height - 633) / 2);
        selectDeleteDialog.setSize(320, 200);
        selectDeleteDialog.setLocation((toolkit.width - 320) / 2, (toolkit.height - 200) / 2);
        deleteDialogYN.setSize(320, 200);
        deleteDialogYN.setLocation((toolkit.width - 320) / 2, (toolkit.height - 200) / 2);

        this.setTitle("Đăng nhập");
        setSize(350, 618);
        setLocation((toolkit.width - 350) / 2, (toolkit.height - 618) / 2);
        setResizable(false);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitDialog = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        yesExit = new javax.swing.JButton();
        cancelExit = new javax.swing.JButton();
        changeDialog = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        titleLable = new javax.swing.JLabel();
        maMh = new javax.swing.JLabel();
        nameLable = new javax.swing.JLabel();
        slLabel = new javax.swing.JLabel();
        dayField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        slField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        dayLable = new javax.swing.JLabel();
        error_message_change_infor = new javax.swing.JLabel();
        resetButtonChange = new javax.swing.JButton();
        chinhSuaUserDialog = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        idUserChange = new javax.swing.JLabel();
        passUserChangeField = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nameUserChangeField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        genderChange = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        errorChinhSuaUser = new javax.swing.JLabel();
        resetButtonChinhSua = new javax.swing.JButton();
        saveUserChangeButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        dateUserChangeField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lichSuGiaoDichDialog = new javax.swing.JDialog();
        lichSuGiaoDichJScrollPanel = new javax.swing.JScrollPane();
        lichSuGiaoDichTable = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        selectLoaiHistoryDialog = new javax.swing.JComboBox<>();
        idLable = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        fullNameLable = new javax.swing.JLabel();
        addMatHangDialog = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        nameTittle = new javax.swing.JLabel();
        nameLable2 = new javax.swing.JLabel();
        maMHAddField = new javax.swing.JTextField();
        nameLable1 = new javax.swing.JLabel();
        nameAddField = new javax.swing.JTextField();
        slLabel1 = new javax.swing.JLabel();
        slAddField = new javax.swing.JTextField();
        dayLable1 = new javax.swing.JLabel();
        dayAddField = new javax.swing.JTextField();
        error_message_add_infor = new javax.swing.JLabel();
        resetButtonAddMatHang = new javax.swing.JButton();
        addMHButton = new javax.swing.JButton();
        xuatKhoDialog = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        giamSL = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        tangSL = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        maMHXuatNNField = new javax.swing.JTextField();
        tenMHXuatNNField = new javax.swing.JTextField();
        slNNXuatField = new javax.swing.JTextField();
        xuatKhoButtonXuat = new javax.swing.JButton();
        error_XuatKhoLabel = new javax.swing.JLabel();
        userXuatNNField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        ngayXuatNNField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        deleteDialogYN = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        yesDeleteYN = new javax.swing.JButton();
        cancelDeleteYN = new javax.swing.JButton();
        testTer = new javax.swing.JLabel();
        deleteUserDialog = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSearch = new javax.swing.JTable();
        hoTenNV = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        maNV = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        searchBy = new javax.swing.JComboBox<>();
        deleteNVButton = new javax.swing.JButton();
        selectDeleteDialog = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        yesDeleteUser = new javax.swing.JButton();
        cancelDeleteUser = new javax.swing.JButton();
        testTer1 = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        subscribe = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        error_message = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adminPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        showAllPanel = new javax.swing.JPanel();
        panelShowItem = new javax.swing.JScrollPane();
        csdlTableShowItem = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        buttonChange = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonUser = new javax.swing.JButton();
        buttonCheck = new javax.swing.JButton();
        inAndOutPanel = new javax.swing.JPanel();
        tableInAndOut = new javax.swing.JScrollPane();
        csdlTableIntAndOut = new javax.swing.JTable();
        timeBegin = new javax.swing.JTextField();
        timeEnd = new javax.swing.JTextField();
        tittleBigin = new javax.swing.JLabel();
        tittleEnd = new javax.swing.JLabel();
        buttonSeachInOut = new javax.swing.JButton();
        selectInOut = new javax.swing.JComboBox<>();
        errorInAndOut = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        tableUser1 = new javax.swing.JScrollPane();
        csdlTableUser = new javax.swing.JTable();
        jLabel47 = new javax.swing.JLabel();
        lsGiaoDichButton = new javax.swing.JButton();
        xoaNVButton = new javax.swing.JButton();
        chinhSuaNVButton = new javax.swing.JButton();
        aboutMePanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        nguoiNhapPanel = new javax.swing.JPanel();
        homePanelNN = new javax.swing.JPanel();
        buttonAddNN = new javax.swing.JButton();
        panelShowItemNN = new javax.swing.JScrollPane();
        csdlTableShowItemNN = new javax.swing.JTable();
        buttonChangeNN = new javax.swing.JButton();
        buttonDeleteNN = new javax.swing.JButton();
        buttonHistoryNN = new javax.swing.JButton();
        buttonSpendNN = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        idView = new javax.swing.JLabel();
        userView = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        comboBoxView = new javax.swing.JComboBox<>();
        aboutMePanelNN = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        subscribePanel = new javax.swing.JPanel();
        genderSubsLabel2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        passwordSubsLabel2 = new javax.swing.JLabel();
        error_messageSubs = new javax.swing.JLabel();
        retypePasswordSubsLabel2 = new javax.swing.JLabel();
        usernameSubs_input = new javax.swing.JTextField();
        fullnameSubsLabel2 = new javax.swing.JLabel();
        subsButton = new javax.swing.JButton();
        birthdaySubsLabel2 = new javax.swing.JLabel();
        fullNameSubs_input = new javax.swing.JTextField();
        backSubs = new javax.swing.JButton();
        genderSubs_input = new javax.swing.JComboBox<>();
        retypePasswordSubs_input = new javax.swing.JPasswordField();
        birthdaySubs_input = new javax.swing.JTextField();
        passwordSubs_input = new javax.swing.JPasswordField();
        usernameSubsLabel2 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        goHome = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        aboutMe = new javax.swing.JMenuItem();
        backItem = new javax.swing.JMenuItem();
        changeInforItem = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();

        exitDialog.setBackground(new java.awt.Color(0, 102, 102));
        exitDialog.setBounds(new java.awt.Rectangle(10, 10, 10, 10));
        exitDialog.setType(java.awt.Window.Type.UTILITY);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Bạn có muốn đăng xuất không?");

        yesExit.setBackground(new java.awt.Color(255, 255, 255));
        yesExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yesExit.setText("ĐỒNG Ý");

        cancelExit.setBackground(new java.awt.Color(255, 51, 0));
        cancelExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelExit.setForeground(new java.awt.Color(255, 255, 255));
        cancelExit.setText("HỦY");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(yesExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesExit)
                    .addComponent(cancelExit))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout exitDialogLayout = new javax.swing.GroupLayout(exitDialog.getContentPane());
        exitDialog.getContentPane().setLayout(exitDialogLayout);
        exitDialogLayout.setHorizontalGroup(
            exitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        exitDialogLayout.setVerticalGroup(
            exitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        changeDialog.setBackground(new java.awt.Color(0, 102, 102));
        changeDialog.setType(java.awt.Window.Type.UTILITY);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Mã Mặt Hàng :");

        titleLable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLable.setForeground(new java.awt.Color(255, 255, 255));
        titleLable.setText("SỬA THÔNG TIN");

        maMh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maMh.setForeground(new java.awt.Color(255, 255, 255));

        nameLable.setForeground(new java.awt.Color(255, 255, 255));
        nameLable.setText("Tên Mặt Hàng");

        slLabel.setForeground(new java.awt.Color(255, 255, 255));
        slLabel.setText("Số Lượng");

        dayField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dayField.setBorder(null);

        nameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameField.setBorder(null);

        slField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        slField.setBorder(null);

        saveButton.setBackground(new java.awt.Color(255, 255, 255));
        saveButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveButton.setText("LƯU");
        saveButton.setBorder(null);

        dayLable.setForeground(new java.awt.Color(255, 255, 255));
        dayLable.setText("Ngày Nhập (YYYY-MM-DD)");

        error_message_change_infor.setForeground(new java.awt.Color(204, 0, 0));
        error_message_change_infor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        resetButtonChange.setBackground(new java.awt.Color(255, 255, 255));
        resetButtonChange.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetButtonChange.setText("RESET");
        resetButtonChange.setBorder(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(titleLable))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(error_message_change_infor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maMh, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(nameLable)
                                    .addGap(183, 183, 183))))
                        .addComponent(resetButtonChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(dayField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(slField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(slLabel)
                    .addComponent(dayLable))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(titleLable)
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(maMh, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(nameLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(slLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dayLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(error_message_change_infor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(resetButtonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout changeDialogLayout = new javax.swing.GroupLayout(changeDialog.getContentPane());
        changeDialog.getContentPane().setLayout(changeDialogLayout);
        changeDialogLayout.setHorizontalGroup(
            changeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        changeDialogLayout.setVerticalGroup(
            changeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        chinhSuaUserDialog.setType(java.awt.Window.Type.UTILITY);

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));

        idUserChange.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idUserChange.setForeground(new java.awt.Color(255, 255, 255));

        passUserChangeField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passUserChangeField.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Mật Khẩu");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Họ và Tên");

        nameUserChangeField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameUserChangeField.setBorder(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Ngày Sinh (YYYY-MM-DD )");

        genderChange.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        genderChange.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Giới tính");

        errorChinhSuaUser.setBackground(new java.awt.Color(255, 255, 255));
        errorChinhSuaUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorChinhSuaUser.setForeground(new java.awt.Color(255, 255, 255));
        errorChinhSuaUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        resetButtonChinhSua.setBackground(new java.awt.Color(255, 255, 255));
        resetButtonChinhSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetButtonChinhSua.setText("RESET");
        resetButtonChinhSua.setBorder(null);

        saveUserChangeButton.setBackground(new java.awt.Color(255, 255, 255));
        saveUserChangeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveUserChangeButton.setText("LƯU");
        saveUserChangeButton.setToolTipText("");
        saveUserChangeButton.setBorder(null);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CHỈNH SỬA USER");

        dateUserChangeField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateUserChangeField.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(62, 62, 62))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(dateUserChangeField)
                                .addGap(18, 18, 18)
                                .addComponent(genderChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errorChinhSuaUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(resetButtonChinhSua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel12))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameUserChangeField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passUserChangeField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveUserChangeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addComponent(idUserChange, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel14)
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idUserChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameUserChangeField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passUserChangeField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateUserChangeField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(errorChinhSuaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetButtonChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveUserChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout chinhSuaUserDialogLayout = new javax.swing.GroupLayout(chinhSuaUserDialog.getContentPane());
        chinhSuaUserDialog.getContentPane().setLayout(chinhSuaUserDialogLayout);
        chinhSuaUserDialogLayout.setHorizontalGroup(
            chinhSuaUserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        chinhSuaUserDialogLayout.setVerticalGroup(
            chinhSuaUserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lichSuGiaoDichDialog.setType(java.awt.Window.Type.UTILITY);

        lichSuGiaoDichTable.setAutoCreateRowSorter(true);
        lichSuGiaoDichTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lichSuGiaoDichTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Mặt Hàng", "Tên Mặt Hàng", "Số Lượng", "Ngày Nhập"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lichSuGiaoDichJScrollPanel.setViewportView(lichSuGiaoDichTable);
        if (lichSuGiaoDichTable.getColumnModel().getColumnCount() > 0) {
            lichSuGiaoDichTable.getColumnModel().getColumn(0).setMinWidth(110);
            lichSuGiaoDichTable.getColumnModel().getColumn(0).setPreferredWidth(120);
            lichSuGiaoDichTable.getColumnModel().getColumn(0).setMaxWidth(130);
            lichSuGiaoDichTable.getColumnModel().getColumn(1).setMinWidth(260);
            lichSuGiaoDichTable.getColumnModel().getColumn(1).setPreferredWidth(280);
            lichSuGiaoDichTable.getColumnModel().getColumn(1).setMaxWidth(300);
        }

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("ID :");

        selectLoaiHistoryDialog.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        selectLoaiHistoryDialog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhập", "Xuất" }));

        idLable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idLable.setForeground(new java.awt.Color(0, 0, 204));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Họ Tên : ");

        fullNameLable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fullNameLable.setForeground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout lichSuGiaoDichDialogLayout = new javax.swing.GroupLayout(lichSuGiaoDichDialog.getContentPane());
        lichSuGiaoDichDialog.getContentPane().setLayout(lichSuGiaoDichDialogLayout);
        lichSuGiaoDichDialogLayout.setHorizontalGroup(
            lichSuGiaoDichDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lichSuGiaoDichDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lichSuGiaoDichDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lichSuGiaoDichJScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                    .addGroup(lichSuGiaoDichDialogLayout.createSequentialGroup()
                        .addGroup(lichSuGiaoDichDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(lichSuGiaoDichDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fullNameLable, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectLoaiHistoryDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        lichSuGiaoDichDialogLayout.setVerticalGroup(
            lichSuGiaoDichDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lichSuGiaoDichDialogLayout.createSequentialGroup()
                .addGroup(lichSuGiaoDichDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lichSuGiaoDichDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(selectLoaiHistoryDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lichSuGiaoDichDialogLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(lichSuGiaoDichDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLable, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))))
                .addGap(23, 23, 23)
                .addGroup(lichSuGiaoDichDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(fullNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(lichSuGiaoDichJScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        addMatHangDialog.setType(java.awt.Window.Type.UTILITY);

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));

        nameTittle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameTittle.setForeground(new java.awt.Color(255, 255, 255));
        nameTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameTittle.setText("THÊM MẶT HÀNG");

        nameLable2.setForeground(new java.awt.Color(255, 255, 255));
        nameLable2.setText("Mã Mặt Hàng");

        maMHAddField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maMHAddField.setBorder(null);
        maMHAddField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maMHAddFieldActionPerformed(evt);
            }
        });

        nameLable1.setForeground(new java.awt.Color(255, 255, 255));
        nameLable1.setText("Tên Mặt Hàng");

        nameAddField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameAddField.setBorder(null);
        nameAddField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameAddFieldActionPerformed(evt);
            }
        });

        slLabel1.setForeground(new java.awt.Color(255, 255, 255));
        slLabel1.setText("Số Lượng");

        slAddField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        slAddField.setBorder(null);

        dayLable1.setForeground(new java.awt.Color(255, 255, 255));
        dayLable1.setText("Ngày Nhập (YYYY-MM-DD)");

        dayAddField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dayAddField.setBorder(null);
        dayAddField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayAddFieldActionPerformed(evt);
            }
        });

        error_message_add_infor.setForeground(new java.awt.Color(255, 255, 255));
        error_message_add_infor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        resetButtonAddMatHang.setBackground(new java.awt.Color(255, 255, 255));
        resetButtonAddMatHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetButtonAddMatHang.setText("RESET");
        resetButtonAddMatHang.setBorder(null);

        addMHButton.setBackground(new java.awt.Color(255, 255, 255));
        addMHButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addMHButton.setText("THÊM");
        addMHButton.setBorder(null);
        addMHButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMHButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dayLable1)
                    .addComponent(slLabel1)
                    .addComponent(nameLable1)
                    .addComponent(error_message_add_infor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMHButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resetButtonAddMatHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLable2)
                    .addComponent(maMHAddField)
                    .addComponent(nameTittle, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(nameAddField)
                    .addComponent(slAddField)
                    .addComponent(dayAddField))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nameLable2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maMHAddField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nameLable1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameAddField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(slLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slAddField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dayLable1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dayAddField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(error_message_add_infor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resetButtonAddMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addMHButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout addMatHangDialogLayout = new javax.swing.GroupLayout(addMatHangDialog.getContentPane());
        addMatHangDialog.getContentPane().setLayout(addMatHangDialogLayout);
        addMatHangDialogLayout.setHorizontalGroup(
            addMatHangDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addMatHangDialogLayout.setVerticalGroup(
            addMatHangDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        xuatKhoDialog.setType(java.awt.Window.Type.UTILITY);

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));

        giamSL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        giamSL.setText("-");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Tên Mặt Hàng");

        tangSL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tangSL.setText("+");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Số Lượng");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Ngày Xuất");

        maMHXuatNNField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maMHXuatNNField.setBorder(null);

        tenMHXuatNNField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tenMHXuatNNField.setBorder(null);

        slNNXuatField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        slNNXuatField.setBorder(null);

        xuatKhoButtonXuat.setBackground(new java.awt.Color(255, 255, 255));
        xuatKhoButtonXuat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        xuatKhoButtonXuat.setText("XUẤT KHO");

        error_XuatKhoLabel.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        error_XuatKhoLabel.setForeground(new java.awt.Color(255, 255, 255));
        error_XuatKhoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        userXuatNNField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userXuatNNField.setBorder(null);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Người Xuất");

        ngayXuatNNField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ngayXuatNNField.setBorder(null);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Mã Mặt Hàng");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maMHXuatNNField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userXuatNNField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xuatKhoButtonXuat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(error_XuatKhoLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ngayXuatNNField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tenMHXuatNNField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(giamSL, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(slNNXuatField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tangSL, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userXuatNNField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(maMHXuatNNField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tenMHXuatNNField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel18)
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slNNXuatField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tangSL)
                    .addComponent(giamSL))
                .addGap(20, 20, 20)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ngayXuatNNField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(error_XuatKhoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(xuatKhoButtonXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout xuatKhoDialogLayout = new javax.swing.GroupLayout(xuatKhoDialog.getContentPane());
        xuatKhoDialog.getContentPane().setLayout(xuatKhoDialogLayout);
        xuatKhoDialogLayout.setHorizontalGroup(
            xuatKhoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        xuatKhoDialogLayout.setVerticalGroup(
            xuatKhoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        deleteDialogYN.setBackground(new java.awt.Color(255, 0, 0));
        deleteDialogYN.setType(java.awt.Window.Type.UTILITY);

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Bạn có chắc muốn xóa ?");

        yesDeleteYN.setBackground(new java.awt.Color(255, 255, 255));
        yesDeleteYN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yesDeleteYN.setText("ĐỒNG Ý");

        cancelDeleteYN.setBackground(new java.awt.Color(255, 255, 255));
        cancelDeleteYN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelDeleteYN.setText("HỦY");

        testTer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        testTer.setForeground(new java.awt.Color(255, 255, 255));
        testTer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(testTer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(yesDeleteYN, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelDeleteYN, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(testTer, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addGap(43, 43, 43)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelDeleteYN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yesDeleteYN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout deleteDialogYNLayout = new javax.swing.GroupLayout(deleteDialogYN.getContentPane());
        deleteDialogYN.getContentPane().setLayout(deleteDialogYNLayout);
        deleteDialogYNLayout.setHorizontalGroup(
            deleteDialogYNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        deleteDialogYNLayout.setVerticalGroup(
            deleteDialogYNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        deleteUserDialog.setType(java.awt.Window.Type.UTILITY);

        jPanel10.setBackground(new java.awt.Color(0, 102, 102));

        tableSearch.setAutoCreateRowSorter(true);
        tableSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Họ tên nhân viên"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableSearch);
        if (tableSearch.getColumnModel().getColumnCount() > 0) {
            tableSearch.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        hoTenNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hoTenNV.setForeground(new java.awt.Color(255, 204, 204));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("đang quản lý một vài mặt hàng");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Cần phải chuyển số mặt hàng đó cho nhân viên khác quản lý");

        maNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maNV.setBorder(null);
        maNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maNVActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Mã NV Bạn Muốn Gán");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Tìm Theo");

        searchBy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã NV", "Tên NV" }));
        searchBy.setBorder(null);

        deleteNVButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteNVButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteNVButton.setText("XÓA");
        deleteNVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNVButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(maNV)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(searchBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(deleteNVButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(hoTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchBy)
                    .addComponent(maNV))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteNVButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout deleteUserDialogLayout = new javax.swing.GroupLayout(deleteUserDialog.getContentPane());
        deleteUserDialog.getContentPane().setLayout(deleteUserDialogLayout);
        deleteUserDialogLayout.setHorizontalGroup(
            deleteUserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteUserDialogLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        deleteUserDialogLayout.setVerticalGroup(
            deleteUserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        selectDeleteDialog.setBackground(new java.awt.Color(255, 0, 0));
        selectDeleteDialog.setType(java.awt.Window.Type.UTILITY);

        jPanel11.setBackground(new java.awt.Color(0, 102, 102));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Bạn có chắc muốn xóa người này ?");

        yesDeleteUser.setBackground(new java.awt.Color(255, 255, 255));
        yesDeleteUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yesDeleteUser.setText("ĐỒNG Ý");

        cancelDeleteUser.setBackground(new java.awt.Color(255, 255, 255));
        cancelDeleteUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelDeleteUser.setText("HỦY");

        testTer1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        testTer1.setForeground(new java.awt.Color(255, 255, 255));
        testTer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(testTer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(yesDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(testTer1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addGap(43, 43, 43)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yesDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout selectDeleteDialogLayout = new javax.swing.GroupLayout(selectDeleteDialog.getContentPane());
        selectDeleteDialog.getContentPane().setLayout(selectDeleteDialogLayout);
        selectDeleteDialogLayout.setHorizontalGroup(
            selectDeleteDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        selectDeleteDialogLayout.setVerticalGroup(
            selectDeleteDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPanel.setBackground(new java.awt.Color(0, 102, 102));

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        login.setText("ĐĂNG NHẬP");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        subscribe.setBackground(new java.awt.Color(255, 255, 255));
        subscribe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subscribe.setText("ĐĂNG KÝ");
        subscribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subscribeActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password.setBorder(null);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mật khẩu");

        username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username.setBorder(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tài khoản");

        error_message.setForeground(new java.awt.Color(255, 51, 51));
        error_message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/3.png"))); // NOI18N

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(error_message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(password)
                    .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subscribe, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 37, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(error_message, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subscribe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        csdlTableShowItem.setAutoCreateRowSorter(true);
        csdlTableShowItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        csdlTableShowItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Mặt Hàng", "Tên Người Nhập", "Tên Mặt Hàng", "Số Lượng", "Ngày Nhập"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        csdlTableShowItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                csdlTableShowItemMouseClicked(evt);
            }
        });
        panelShowItem.setViewportView(csdlTableShowItem);
        if (csdlTableShowItem.getColumnModel().getColumnCount() > 0) {
            csdlTableShowItem.getColumnModel().getColumn(0).setMinWidth(50);
            csdlTableShowItem.getColumnModel().getColumn(0).setPreferredWidth(50);
            csdlTableShowItem.getColumnModel().getColumn(0).setMaxWidth(50);
            csdlTableShowItem.getColumnModel().getColumn(1).setMinWidth(90);
            csdlTableShowItem.getColumnModel().getColumn(1).setPreferredWidth(100);
            csdlTableShowItem.getColumnModel().getColumn(1).setMaxWidth(110);
            csdlTableShowItem.getColumnModel().getColumn(3).setMinWidth(190);
            csdlTableShowItem.getColumnModel().getColumn(3).setPreferredWidth(200);
            csdlTableShowItem.getColumnModel().getColumn(3).setMaxWidth(210);
        }

        jLabel37.setBackground(new java.awt.Color(0, 102, 102));
        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("DANH SÁCH CÁC MẶT HÀNG HIỆN CÓ TRONG KHO");
        jLabel37.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel37.setOpaque(true);

        jLabel24.setForeground(new java.awt.Color(0, 0, 204));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/admin-with-cogwheels(1).png"))); // NOI18N

        buttonChange.setBackground(new java.awt.Color(0, 102, 102));
        buttonChange.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonChange.setForeground(new java.awt.Color(255, 255, 255));
        buttonChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/shuffle.png"))); // NOI18N
        buttonChange.setText("   CHỈNH SỬA");
        buttonChange.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        buttonDelete.setBackground(new java.awt.Color(0, 102, 102));
        buttonDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonDelete.setForeground(new java.awt.Color(255, 255, 255));
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/delete.png"))); // NOI18N
        buttonDelete.setText("   XÓA");
        buttonDelete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        buttonUser.setBackground(new java.awt.Color(0, 102, 102));
        buttonUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonUser.setForeground(new java.awt.Color(255, 255, 255));
        buttonUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/clipboard.png"))); // NOI18N
        buttonUser.setText("   DANH SÁCH NV");
        buttonUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonUser.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        buttonCheck.setBackground(new java.awt.Color(0, 102, 102));
        buttonCheck.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonCheck.setForeground(new java.awt.Color(255, 255, 255));
        buttonCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/history-clock-button.png"))); // NOI18N
        buttonCheck.setText("   LỊCH SỬ");
        buttonCheck.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCheck, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonChange, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonUser, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout showAllPanelLayout = new javax.swing.GroupLayout(showAllPanel);
        showAllPanel.setLayout(showAllPanelLayout);
        showAllPanelLayout.setHorizontalGroup(
            showAllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showAllPanelLayout.createSequentialGroup()
                .addGroup(showAllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, showAllPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(panelShowItem, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(showAllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(showAllPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20)
                                .addGap(9, 9, 9))
                            .addGroup(showAllPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );
        showAllPanelLayout.setVerticalGroup(
            showAllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showAllPanelLayout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showAllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelShowItem)
                    .addGroup(showAllPanelLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        csdlTableIntAndOut.setAutoCreateRowSorter(true);
        csdlTableIntAndOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        csdlTableIntAndOut.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MÃ MẶT HÀNG", "TÊN NGƯỜI NHẬP", "TÊN MẶT HÀNG", "SỐ LƯỢNG", "NGÀY NHẬP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        csdlTableIntAndOut.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        csdlTableIntAndOut.setRowSelectionAllowed(false);
        csdlTableIntAndOut.setUpdateSelectionOnSort(false);
        tableInAndOut.setViewportView(csdlTableIntAndOut);
        if (csdlTableIntAndOut.getColumnModel().getColumnCount() > 0) {
            csdlTableIntAndOut.getColumnModel().getColumn(0).setPreferredWidth(10);
            csdlTableIntAndOut.getColumnModel().getColumn(1).setPreferredWidth(150);
            csdlTableIntAndOut.getColumnModel().getColumn(2).setPreferredWidth(260);
            csdlTableIntAndOut.getColumnModel().getColumn(3).setMinWidth(250);
            csdlTableIntAndOut.getColumnModel().getColumn(3).setPreferredWidth(260);
            csdlTableIntAndOut.getColumnModel().getColumn(3).setMaxWidth(270);
        }

        timeBegin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        timeEnd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        timeEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeEndActionPerformed(evt);
            }
        });

        tittleBigin.setText("Thời Gian Từ");

        tittleEnd.setText("Đến");

        buttonSeachInOut.setBackground(new java.awt.Color(204, 204, 204));
        buttonSeachInOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonSeachInOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/search.png"))); // NOI18N
        buttonSeachInOut.setText("Tìm");

        selectInOut.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        selectInOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhập", "Xuất" }));

        errorInAndOut.setBackground(new java.awt.Color(255, 255, 255));
        errorInAndOut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorInAndOut.setForeground(new java.awt.Color(255, 0, 0));

        jLabel38.setBackground(new java.awt.Color(0, 102, 102));
        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("LỊCH SỬ NHẬP XUẤT THEO NGÀY");
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel38.setOpaque(true);

        javax.swing.GroupLayout inAndOutPanelLayout = new javax.swing.GroupLayout(inAndOutPanel);
        inAndOutPanel.setLayout(inAndOutPanelLayout);
        inAndOutPanelLayout.setHorizontalGroup(
            inAndOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inAndOutPanelLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel22)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(inAndOutPanelLayout.createSequentialGroup()
                .addGroup(inAndOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inAndOutPanelLayout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addGroup(inAndOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorInAndOut, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(inAndOutPanelLayout.createSequentialGroup()
                                .addGap(468, 468, 468)
                                .addComponent(buttonSeachInOut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(inAndOutPanelLayout.createSequentialGroup()
                                .addGroup(inAndOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timeBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tittleBigin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(inAndOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tittleEnd)
                                    .addGroup(inAndOutPanelLayout.createSequentialGroup()
                                        .addComponent(timeEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selectInOut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(inAndOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tableInAndOut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1195, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inAndOutPanelLayout.setVerticalGroup(
            inAndOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inAndOutPanelLayout.createSequentialGroup()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(inAndOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tittleBigin)
                    .addComponent(tittleEnd))
                .addGap(4, 4, 4)
                .addGroup(inAndOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectInOut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSeachInOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorInAndOut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tableInAndOut, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        csdlTableUser.setAutoCreateRowSorter(true);
        csdlTableUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        csdlTableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mật Khẩu", "Họ và Tên", "Giới Tính", "Ngày Sinh"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUser1.setViewportView(csdlTableUser);
        if (csdlTableUser.getColumnModel().getColumnCount() > 0) {
            csdlTableUser.getColumnModel().getColumn(0).setMinWidth(100);
            csdlTableUser.getColumnModel().getColumn(0).setPreferredWidth(100);
            csdlTableUser.getColumnModel().getColumn(0).setMaxWidth(100);
            csdlTableUser.getColumnModel().getColumn(2).setMinWidth(250);
            csdlTableUser.getColumnModel().getColumn(2).setPreferredWidth(250);
            csdlTableUser.getColumnModel().getColumn(2).setMaxWidth(250);
        }

        jLabel47.setBackground(new java.awt.Color(0, 102, 102));
        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("DANH SÁCH NHÂN VIÊN");
        jLabel47.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel47.setOpaque(true);

        lsGiaoDichButton.setBackground(new java.awt.Color(0, 102, 102));
        lsGiaoDichButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lsGiaoDichButton.setForeground(new java.awt.Color(255, 255, 255));
        lsGiaoDichButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/message.png"))); // NOI18N
        lsGiaoDichButton.setText("   CHI TIẾT");
        lsGiaoDichButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        xoaNVButton.setBackground(new java.awt.Color(0, 102, 102));
        xoaNVButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        xoaNVButton.setForeground(new java.awt.Color(255, 255, 255));
        xoaNVButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/delete.png"))); // NOI18N
        xoaNVButton.setText("   XÓA");
        xoaNVButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        chinhSuaNVButton.setBackground(new java.awt.Color(0, 102, 102));
        chinhSuaNVButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chinhSuaNVButton.setForeground(new java.awt.Color(255, 255, 255));
        chinhSuaNVButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/shuffle.png"))); // NOI18N
        chinhSuaNVButton.setText("   CHỈNH SỬA");
        chinhSuaNVButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chinhSuaNVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chinhSuaNVButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(userPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableUser1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lsGiaoDichButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xoaNVButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chinhSuaNVButton, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addContainerGap())
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanelLayout.createSequentialGroup()
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableUser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanelLayout.createSequentialGroup()
                        .addComponent(lsGiaoDichButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xoaNVButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chinhSuaNVButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inAndOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showAllPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addComponent(showAllPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inAndOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tại sao bạn thích phần mềm quản lý kho hàng JavTeam?");
        jLabel7.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/network (1).png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Đơn giản & Dễ dùng");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Nhân viên bán hàng chỉ mất 15 phút làm quen để bắt");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("đầu bán hàng với JavTeam. Giao diện đơn giản, thân thiện,");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("mình thật dễ dàng, nhanh chóng và tiện lợi hơn.");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText(" thông minh giúp bạn triển khai quản lý kho hàng của");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/shop.png"))); // NOI18N

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Phù hợp cho từng ngành hàng");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Cùng với các chuyên gia lập trình dày dặn kinh nghiệm, ");

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("chúng tôi nghiên cứu thiết kế phần mềm phù hợp với");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("hơn 15 loại mặt hàng dành cho cả buôn bán sỉ và lẻ.");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Tiện lợi trong việc quản lý các mặt hàng");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel53)
                .addGap(5, 5, 5))
        );

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/credit-card.png"))); // NOI18N

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Tiết kiệm chi phí nhất ");

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Miễn phí cài đặt, phí triển khai, nâng cấp và hỗ trợ. ");

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Bạn đã có thể áp dụng công nghệ vào quản lý cửa hàng.");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Chi phí thấp cho việc bảo trì và quản lý kho hàng");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Hiệu suốt cao, phù hợp với mọi mô hình kinh doanh quản lý");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54)
                .addGap(18, 18, 18)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel59)
                .addGap(5, 5, 5))
        );

        jPanel18.setBackground(new java.awt.Color(0, 102, 102));

        jLabel40.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText("JavTeam");

        jLabel77.setBackground(new java.awt.Color(255, 255, 255));
        jLabel77.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel77.setOpaque(true);

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("Lập trình hướng đối tượng     |     Phần mềm quản lý kho hàng     |     Mô hình MVC");

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("© 2018 JavTeam");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 1135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel79)
                .addContainerGap())
        );

        javax.swing.GroupLayout aboutMePanelLayout = new javax.swing.GroupLayout(aboutMePanel);
        aboutMePanel.setLayout(aboutMePanelLayout);
        aboutMePanelLayout.setHorizontalGroup(
            aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutMePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        aboutMePanelLayout.setVerticalGroup(
            aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutMePanelLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aboutMePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3192, Short.MAX_VALUE))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aboutMePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonAddNN.setBackground(new java.awt.Color(0, 102, 102));
        buttonAddNN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonAddNN.setForeground(new java.awt.Color(255, 255, 255));
        buttonAddNN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/add.png"))); // NOI18N
        buttonAddNN.setText("   THÊM MẶT HÀNG");
        buttonAddNN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonAddNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddNNActionPerformed(evt);
            }
        });

        csdlTableShowItemNN.setAutoCreateRowSorter(true);
        csdlTableShowItemNN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        csdlTableShowItemNN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Mặt Hàng", "Tên Mặt Hàng", "Số Lượng", "Ngày Nhập"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        csdlTableShowItemNN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                csdlTableShowItemNNMouseClicked(evt);
            }
        });
        panelShowItemNN.setViewportView(csdlTableShowItemNN);
        if (csdlTableShowItemNN.getColumnModel().getColumnCount() > 0) {
            csdlTableShowItemNN.getColumnModel().getColumn(0).setMinWidth(100);
            csdlTableShowItemNN.getColumnModel().getColumn(0).setPreferredWidth(120);
            csdlTableShowItemNN.getColumnModel().getColumn(0).setMaxWidth(150);
            csdlTableShowItemNN.getColumnModel().getColumn(1).setPreferredWidth(350);
        }

        buttonChangeNN.setBackground(new java.awt.Color(0, 102, 102));
        buttonChangeNN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonChangeNN.setForeground(new java.awt.Color(255, 255, 255));
        buttonChangeNN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/shuffle.png"))); // NOI18N
        buttonChangeNN.setText("   THAY ĐỔI");
        buttonChangeNN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        buttonDeleteNN.setBackground(new java.awt.Color(0, 102, 102));
        buttonDeleteNN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonDeleteNN.setForeground(new java.awt.Color(255, 255, 255));
        buttonDeleteNN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/delete.png"))); // NOI18N
        buttonDeleteNN.setText("   XÓA");
        buttonDeleteNN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonDeleteNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteNNActionPerformed(evt);
            }
        });

        buttonHistoryNN.setBackground(new java.awt.Color(0, 102, 102));
        buttonHistoryNN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonHistoryNN.setForeground(new java.awt.Color(255, 255, 255));
        buttonHistoryNN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/history-clock-button.png"))); // NOI18N
        buttonHistoryNN.setText("   LỊCH SỬ N/XUẤT");
        buttonHistoryNN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonHistoryNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHistoryNNActionPerformed(evt);
            }
        });

        buttonSpendNN.setBackground(new java.awt.Color(0, 102, 102));
        buttonSpendNN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonSpendNN.setForeground(new java.awt.Color(255, 255, 255));
        buttonSpendNN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/bag.png"))); // NOI18N
        buttonSpendNN.setText("   XUẤT MẶT HÀNG");
        buttonSpendNN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonSpendNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSpendNNActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Danh Sách Các Mặt Hàng Hiện Có Trong Kho");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("ID :");

        idView.setBackground(new java.awt.Color(255, 255, 255));
        idView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idView.setForeground(new java.awt.Color(255, 255, 255));

        userView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userView.setForeground(new java.awt.Color(255, 255, 255));

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("User :");

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Chế Độ Xem : ");

        comboBoxView.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Cá Nhân" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idView, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userView, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idView, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userView, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout homePanelNNLayout = new javax.swing.GroupLayout(homePanelNN);
        homePanelNN.setLayout(homePanelNNLayout);
        homePanelNNLayout.setHorizontalGroup(
            homePanelNNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelNNLayout.createSequentialGroup()
                .addGroup(homePanelNNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelNNLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panelShowItemNN, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(homePanelNNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonHistoryNN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAddNN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonChangeNN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonDeleteNN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonSpendNN, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(homePanelNNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanelNNLayout.createSequentialGroup()
                    .addGap(1743, 1743, 1743)
                    .addComponent(jLabel21)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        homePanelNNLayout.setVerticalGroup(
            homePanelNNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelNNLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homePanelNNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelShowItemNN, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(homePanelNNLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonChangeNN, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDeleteNN, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSpendNN, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAddNN, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonHistoryNN, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(homePanelNNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homePanelNNLayout.createSequentialGroup()
                    .addContainerGap(698, Short.MAX_VALUE)
                    .addComponent(jLabel21)
                    .addGap(40, 40, 40)))
        );

        jLabel87.setBackground(new java.awt.Color(0, 102, 102));
        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("Tại sao bạn thích phần mềm quản lý kho hàng JavTeam?");
        jLabel87.setOpaque(true);

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/network (1).png"))); // NOI18N

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("Đơn giản & Dễ dùng");

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("Nhân viên bán hàng chỉ mất 15 phút làm quen để bắt");

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("đầu bán hàng với JavTeam. Giao diện đơn giản, thân thiện,");

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("mình thật dễ dàng, nhanh chóng và tiện lợi hơn.");

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText(" thông minh giúp bạn triển khai quản lý kho hàng của");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/shop.png"))); // NOI18N

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("Phù hợp cho từng ngành hàng");

        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("Cùng với các chuyên gia lập trình dày dặn kinh nghiệm, ");

        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("chúng tôi nghiên cứu thiết kế phần mềm phù hợp với");

        jLabel98.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("hơn 15 loại mặt hàng dành cho cả buôn bán sỉ và lẻ.");

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("Tiện lợi trong việc quản lý các mặt hàng");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel94)
                .addGap(18, 18, 18)
                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel99)
                .addGap(5, 5, 5))
        );

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/credit-card.png"))); // NOI18N

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("Tiết kiệm chi phí nhất ");

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("Miễn phí cài đặt, phí triển khai, nâng cấp và hỗ trợ. ");

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setText("Bạn đã có thể áp dụng công nghệ vào quản lý cửa hàng.");

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("Chi phí thấp cho việc bảo trì và quản lý kho hàng");

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("Hiệu suốt cao, phù hợp với mọi mô hình kinh doanh quản lý");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel103, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel102, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel101, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel107, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel101)
                .addGap(18, 18, 18)
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel104)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel107)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel105)
                .addGap(5, 5, 5))
        );

        jPanel23.setBackground(new java.awt.Color(0, 102, 102));

        jLabel108.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel108.setText("JavTeam");

        jLabel109.setBackground(new java.awt.Color(255, 255, 255));
        jLabel109.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel109.setOpaque(true);

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("Lập trình hướng đối tượng     |     Phần mềm quản lý kho hàng     |     Mô hình MVC");

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("© 2018 JavTeam");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 1135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel110)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel111)
                .addContainerGap())
        );

        javax.swing.GroupLayout aboutMePanelNNLayout = new javax.swing.GroupLayout(aboutMePanelNN);
        aboutMePanelNN.setLayout(aboutMePanelNNLayout);
        aboutMePanelNNLayout.setHorizontalGroup(
            aboutMePanelNNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutMePanelNNLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        aboutMePanelNNLayout.setVerticalGroup(
            aboutMePanelNNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutMePanelNNLayout.createSequentialGroup()
                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(aboutMePanelNNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout nguoiNhapPanelLayout = new javax.swing.GroupLayout(nguoiNhapPanel);
        nguoiNhapPanel.setLayout(nguoiNhapPanelLayout);
        nguoiNhapPanelLayout.setHorizontalGroup(
            nguoiNhapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nguoiNhapPanelLayout.createSequentialGroup()
                .addGroup(nguoiNhapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homePanelNN, javax.swing.GroupLayout.PREFERRED_SIZE, 1208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aboutMePanelNN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(2698, Short.MAX_VALUE))
        );
        nguoiNhapPanelLayout.setVerticalGroup(
            nguoiNhapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nguoiNhapPanelLayout.createSequentialGroup()
                .addComponent(homePanelNN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aboutMePanelNN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        subscribePanel.setBackground(new java.awt.Color(0, 102, 102));

        genderSubsLabel2.setForeground(new java.awt.Color(255, 255, 255));
        genderSubsLabel2.setText("Giới tính");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("ĐĂNG KÝ");

        passwordSubsLabel2.setForeground(new java.awt.Color(255, 255, 255));
        passwordSubsLabel2.setText("Mật khẩu");

        error_messageSubs.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        error_messageSubs.setForeground(new java.awt.Color(255, 51, 0));
        error_messageSubs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        retypePasswordSubsLabel2.setForeground(new java.awt.Color(255, 255, 255));
        retypePasswordSubsLabel2.setText("Nhập lại mật khẩu");

        usernameSubs_input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameSubs_input.setBorder(null);
        usernameSubs_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameSubs_inputActionPerformed(evt);
            }
        });

        fullnameSubsLabel2.setForeground(new java.awt.Color(255, 255, 255));
        fullnameSubsLabel2.setText("Họ & Tên");

        subsButton.setBackground(new java.awt.Color(255, 255, 255));
        subsButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subsButton.setText("ĐĂNG KÝ");

        birthdaySubsLabel2.setForeground(new java.awt.Color(255, 255, 255));
        birthdaySubsLabel2.setText("Ngày Sinh (YYYY-MM-DD)");

        fullNameSubs_input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fullNameSubs_input.setBorder(null);

        backSubs.setBackground(new java.awt.Color(255, 255, 255));
        backSubs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backSubs.setText("TRỞ VỀ");

        genderSubs_input.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        genderSubs_input.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        genderSubs_input.setBorder(null);

        retypePasswordSubs_input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        retypePasswordSubs_input.setBorder(null);

        birthdaySubs_input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        birthdaySubs_input.setBorder(null);

        passwordSubs_input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordSubs_input.setBorder(null);

        usernameSubsLabel2.setForeground(new java.awt.Color(255, 255, 255));
        usernameSubsLabel2.setText("Tài khoản");

        javax.swing.GroupLayout subscribePanelLayout = new javax.swing.GroupLayout(subscribePanel);
        subscribePanel.setLayout(subscribePanelLayout);
        subscribePanelLayout.setHorizontalGroup(
            subscribePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subscribePanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(subscribePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(error_messageSubs, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(subscribePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usernameSubsLabel2)
                        .addComponent(passwordSubsLabel2)
                        .addComponent(retypePasswordSubsLabel2)
                        .addComponent(fullnameSubsLabel2)
                        .addComponent(usernameSubs_input)
                        .addComponent(subsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backSubs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(subscribePanelLayout.createSequentialGroup()
                            .addGroup(subscribePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(birthdaySubs_input, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(birthdaySubsLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(subscribePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(genderSubsLabel2)
                                .addComponent(genderSubs_input, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(passwordSubs_input)
                        .addComponent(retypePasswordSubs_input)
                        .addComponent(fullNameSubs_input, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        subscribePanelLayout.setVerticalGroup(
            subscribePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subscribePanelLayout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameSubsLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameSubs_input, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(passwordSubsLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordSubs_input, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(retypePasswordSubsLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retypePasswordSubs_input, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fullnameSubsLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fullNameSubs_input, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(subscribePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdaySubsLabel2)
                    .addComponent(genderSubsLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subscribePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdaySubs_input, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderSubs_input, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(error_messageSubs, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backSubs, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );

        Menu.setBackground(new java.awt.Color(0, 102, 102));
        Menu.setForeground(new java.awt.Color(255, 255, 255));

        homeMenu.setBackground(new java.awt.Color(0, 102, 102));
        homeMenu.setBorder(null);
        homeMenu.setForeground(new java.awt.Color(255, 255, 255));
        homeMenu.setText("Trang chủ");

        goHome.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        goHome.setBackground(new java.awt.Color(255, 255, 255));
        goHome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        goHome.setForeground(new java.awt.Color(0, 102, 102));
        goHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/home.png"))); // NOI18N
        goHome.setText("Trở lại trang chủ");
        goHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goHomeActionPerformed(evt);
            }
        });
        homeMenu.add(goHome);

        Menu.add(homeMenu);

        viewMenu.setBackground(new java.awt.Color(0, 102, 102));
        viewMenu.setBorder(null);
        viewMenu.setForeground(new java.awt.Color(255, 255, 255));
        viewMenu.setText("Tùy chọn");

        aboutMe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        aboutMe.setBackground(new java.awt.Color(255, 255, 255));
        aboutMe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        aboutMe.setForeground(new java.awt.Color(0, 102, 102));
        aboutMe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/about.png"))); // NOI18N
        aboutMe.setText("Thông tin sản phẩm");
        aboutMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMeActionPerformed(evt);
            }
        });
        viewMenu.add(aboutMe);

        backItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        backItem.setBackground(new java.awt.Color(255, 255, 255));
        backItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backItem.setForeground(new java.awt.Color(0, 102, 102));
        backItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/back-arrow.png"))); // NOI18N
        backItem.setText("Quay lại");
        backItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backItemActionPerformed(evt);
            }
        });
        viewMenu.add(backItem);

        changeInforItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        changeInforItem.setBackground(new java.awt.Color(255, 255, 255));
        changeInforItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        changeInforItem.setForeground(new java.awt.Color(0, 102, 102));
        changeInforItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/exchange-arrows.png"))); // NOI18N
        changeInforItem.setText("Chỉnh sửa thông tin");
        changeInforItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeInforItemActionPerformed(evt);
            }
        });
        viewMenu.add(changeInforItem);

        logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(0, 102, 102));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/isd16/images/logout.png"))); // NOI18N
        logout.setText("Đăng xuất");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        viewMenu.add(logout);

        Menu.add(viewMenu);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(5256, Short.MAX_VALUE))
            .addComponent(nguoiNhapPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(subscribePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(adminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1878, Short.MAX_VALUE)
                .addComponent(nguoiNhapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subscribePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(adminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1712, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutMeActionPerformed

    private void goHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goHomeActionPerformed

    }//GEN-LAST:event_goHomeActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void subscribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subscribeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subscribeActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void backItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backItemActionPerformed

    private void csdlTableShowItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csdlTableShowItemMouseClicked

    }//GEN-LAST:event_csdlTableShowItemMouseClicked

    private void timeEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeEndActionPerformed

    private void buttonAddNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddNNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAddNNActionPerformed

    private void csdlTableShowItemNNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csdlTableShowItemNNMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_csdlTableShowItemNNMouseClicked

    private void buttonHistoryNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHistoryNNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHistoryNNActionPerformed

    private void dayAddFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayAddFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayAddFieldActionPerformed

    private void nameAddFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameAddFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameAddFieldActionPerformed

    private void maMHAddFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maMHAddFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maMHAddFieldActionPerformed

    private void chinhSuaNVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chinhSuaNVButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chinhSuaNVButtonActionPerformed

    private void usernameSubs_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameSubs_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameSubs_inputActionPerformed

    private void buttonDeleteNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteNNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDeleteNNActionPerformed

    private void maNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maNVActionPerformed

    private void deleteNVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNVButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteNVButtonActionPerformed

    private void changeInforItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeInforItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeInforItemActionPerformed

    private void buttonSpendNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSpendNNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSpendNNActionPerformed

    private void addMHButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMHButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addMHButtonActionPerformed

    // Add Event for Button and TextField
    public void addEventListener(ActionListener actionListener, KeyListener keyListener, MouseListener listener, WindowListener windowListener) {
//        ACTION LISTENER
        password.addActionListener(actionListener);
        subscribe.addActionListener(actionListener);
        login.addActionListener(actionListener);
        homeMenu.addActionListener(actionListener);
        aboutMe.addActionListener(actionListener);
        goHome.addActionListener(actionListener);
        logout.addActionListener(actionListener);
        backSubs.addActionListener(actionListener);
        yesExit.addActionListener(actionListener);
        cancelExit.addActionListener(actionListener);
        subsButton.addActionListener(actionListener);
        genderSubs_input.addActionListener(actionListener);
        buttonChange.addActionListener(actionListener);
        buttonCheck.addActionListener(actionListener);
        buttonUser.addActionListener(actionListener);
        backItem.addActionListener(actionListener);
        saveButton.addActionListener(actionListener);
        chinhSuaNVButton.addActionListener(actionListener);
        lsGiaoDichButton.addActionListener(actionListener);
        saveUserChangeButton.addActionListener(actionListener);
        buttonChangeNN.addActionListener(actionListener);
        buttonAddNN.addActionListener(actionListener);
        buttonHistoryNN.addActionListener(actionListener);
        resetButtonChange.addActionListener(actionListener);
        resetButtonChinhSua.addActionListener(actionListener);
        resetButtonAddMatHang.addActionListener(actionListener);
        addMHButton.addActionListener(actionListener);
        buttonSpendNN.addActionListener(actionListener);
        giamSL.addActionListener(actionListener);
        tangSL.addActionListener(actionListener);
        xuatKhoButtonXuat.addActionListener(actionListener);
        selectLoaiHistoryDialog.addActionListener(actionListener);
        comboBoxView.addActionListener(actionListener);
        buttonDelete.addActionListener(actionListener);
        yesDeleteYN.addActionListener(actionListener);
        changeInforItem.addActionListener(actionListener);
        cancelDeleteYN.addActionListener(actionListener);
        buttonSeachInOut.addActionListener(actionListener);
        selectInOut.addActionListener(actionListener);
        searchBy.addActionListener(actionListener);
        xoaNVButton.addActionListener(actionListener);
        deleteNVButton.addActionListener(actionListener);
        yesDeleteUser.addActionListener(actionListener);
        cancelDeleteUser.addActionListener(actionListener);
        genderChange.addActionListener(actionListener);
        changeInforItem.addActionListener(actionListener);
        buttonDeleteNN.addActionListener(actionListener);

//        KEY LISTENER
        username.addKeyListener(keyListener);
        password.addKeyListener(keyListener);
        birthdaySubs_input.addKeyListener(keyListener);
        usernameSubs_input.addKeyListener(keyListener);
        passwordSubs_input.addKeyListener(keyListener);
        retypePasswordSubs_input.addKeyListener(keyListener);
        fullNameSubs_input.addKeyListener(keyListener);
        nameField.addKeyListener(keyListener);
        slField.addKeyListener(keyListener);
        dayField.addKeyListener(keyListener);
        dateUserChangeField.addKeyListener(keyListener);
        timeBegin.addKeyListener(keyListener);
        timeEnd.addKeyListener(keyListener);
        passUserChangeField.addKeyListener(keyListener);
        maMHAddField.addKeyListener(keyListener);
        nameAddField.addKeyListener(keyListener);
        slAddField.addKeyListener(keyListener);
        dayAddField.addKeyListener(keyListener);
        slNNXuatField.addKeyListener(keyListener);
        maNV.addKeyListener(keyListener);

//        MOUSE LISTENER
        csdlTableUser.addMouseListener(listener);
        csdlTableShowItem.addMouseListener(listener);
        csdlTableShowItemNN.addMouseListener(listener);
        tableSearch.addMouseListener(listener);

//        WINDOW LISTENER
        exitDialog.addWindowListener(windowListener);
        changeDialog.addWindowListener(windowListener);
        chinhSuaUserDialog.addWindowListener(windowListener);
        lichSuGiaoDichDialog.addWindowListener(windowListener);
        addMatHangDialog.addWindowListener(windowListener);
        xuatKhoDialog.addWindowListener(windowListener);
        deleteDialogYN.addWindowListener(windowListener);
        deleteUserDialog.addWindowListener(windowListener);
        selectDeleteDialog.addWindowListener(windowListener);

        dtmCsdlShowItemNN = (DefaultTableModel) csdlTableShowItemNN.getModel();
        dtmCsdlShowItem = (DefaultTableModel) csdlTableShowItem.getModel();
        dtmCsdlTableUser = (DefaultTableModel) csdlTableUser.getModel();
        dtmLichSuGiaoDichTable = (DefaultTableModel) lichSuGiaoDichTable.getModel();
        dtmCsdlTableIntAndOut = (DefaultTableModel) csdlTableIntAndOut.getModel();
        dtmTableSearch = (DefaultTableModel) tableSearch.getModel();
    }

    // Getter
    public DefaultTableModel getDtmCsdlTableIntAndOut() {
        return dtmCsdlTableIntAndOut;
    }

    public DefaultTableModel getDtmTableSearch() {
        return dtmTableSearch;
    }

    public JComboBox<String> getGenderChange() {
        return genderChange;
    }

    public JButton getDeleteNVButton() {
        return deleteNVButton;
    }

    public JTable getTableSearch() {
        return tableSearch;
    }

    public JTextField getMaNV() {
        return maNV;
    }

    public JButton getCancelDeleteUser() {
        return cancelDeleteUser;
    }

    public JDialog getSelectDeleteDialog() {
        return selectDeleteDialog;
    }

    public JButton getYesDeleteUser() {
        return yesDeleteUser;
    }

    public JComboBox<String> getSearchBy() {
        return searchBy;
    }

    public JDialog getDeleteUserDialog() {
        return deleteUserDialog;
    }

    public JLabel getHoTenNV() {
        return hoTenNV;
    }

    public JComboBox<String> getSelectLoaiHistoryDialog() {
        return selectLoaiHistoryDialog;
    }

    public JButton getCancelDeleteYN() {
        return cancelDeleteYN;
    }

    public JButton getYesDeleteYN() {
        return yesDeleteYN;
    }

    public JComboBox<String> getComboBoxView() {
        return comboBoxView;
    }

    public JLabel getTestTer() {
        return testTer;
    }

    public JDialog getDeleteDialogYN() {
        return deleteDialogYN;
    }

    public JLabel getIdView() {
        return idView;
    }

    public JLabel getUserView() {
        return userView;
    }

    public JLabel getMaMh() {
        return maMh;
    }

    public JLabel getFullNameLable() {
        return fullNameLable;
    }

    public JLabel getIdLable() {
        return idLable;
    }

    public JButton getGiamSL() {
        return giamSL;
    }

    public JButton getTangSL() {
        return tangSL;
    }

    public JButton getXuatKhoButtonXuat() {
        return xuatKhoButtonXuat;
    }

    public JLabel getError_message() {
        return error_message;
    }

    public JButton getLogin() {
        return login;
    }

    public JPasswordField getPassword() {
        return password;
    }

    public JTextField getUsername() {
        return username;
    }

    public JButton getSubscribe() {
        return subscribe;
    }

    public JPanel getAdminPanel() {
        return adminPanel;
    }

    public JPanel getLoginPanel() {
        return loginPanel;
    }

    public JMenuBar getMenu() {
        return Menu;
    }

    public JMenuItem getAboutMe() {
        return aboutMe;
    }

    public JMenu getHelpMenu() {
        return viewMenu;
    }

    public JMenu getHomeMenu() {
        return homeMenu;
    }

    public JLabel getError_message_add_infor() {
        return error_message_add_infor;
    }

    public JMenuItem getGoHome() {
        return goHome;
    }

    public JPanel getAboutMePanel() {
        return aboutMePanel;
    }

    public JPanel getHomePanel() {
        return homePanel;
    }

    public JMenuItem getLogout() {
        return logout;
    }

    public JPanel getSubscribePanel() {
        return subscribePanel;
    }

    public JTextField getBirthdaySubs_input() {
        return birthdaySubs_input;
    }

    public JLabel getError_messageSubs() {
        return error_messageSubs;
    }

    public JTextField getFullNameSubs_input() {
        return fullNameSubs_input;
    }

    public JComboBox<String> getSelectInOut() {
        return selectInOut;
    }

    public JComboBox<String> getGenderSubs_input() {
        return genderSubs_input;
    }

    public JPasswordField getPasswordSubs_input() {
        return passwordSubs_input;
    }

    public JPasswordField getRetypePasswordSubs_input() {
        return retypePasswordSubs_input;
    }

    public JButton getSubsButton() {
        return subsButton;
    }

    public JTextField getUsernameSubs_input() {
        return usernameSubs_input;
    }

    public JButton getBackSubs() {
        return backSubs;
    }

    public JDialog getExitDialog() {
        return exitDialog;
    }

    public JButton getCancelExit() {
        return cancelExit;
    }

    public JButton getYesExit() {
        return yesExit;
    }

    public JPanel getAboutMePanelNN() {
        return aboutMePanelNN;
    }

    public JMenuItem getChangeInforItem() {
        return changeInforItem;
    }

    public JPanel getHomePanelNN() {
        return homePanelNN;
    }

    public JButton getResetButtonAddMatHang() {
        return resetButtonAddMatHang;
    }

    public JButton getResetButtonChange() {
        return resetButtonChange;
    }

    public JButton getResetButtonChinhSua() {
        return resetButtonChinhSua;
    }

    public JPanel getNguoiNhapPanel() {
        return nguoiNhapPanel;
    }

    public JButton getButtonChange() {
        return buttonChange;
    }

    public JButton getButtonCheck() {
        return buttonCheck;
    }

    public JButton getButtonUser() {
        return buttonUser;
    }

    public JPanel getCheckInAndOut() {
        return inAndOutPanel;
    }

    public JTable getCsdlTableInAndOut() {
        return csdlTableIntAndOut;
    }

    public JTable getCsdlTableShowItem() {
        return csdlTableShowItem;
    }

    public JButton getLsGiaoDichButton() {
        return lsGiaoDichButton;
    }

    public JScrollPane getPanelShowItem() {
        return panelShowItem;
    }

    public JPanel getShowAllPanel() {
        return showAllPanel;
    }

    public JScrollPane getTableInAndOut() {
        return tableInAndOut;
    }

    public JMenuItem getBackItem() {
        return backItem;
    }

    public JDialog getChangeDialog() {
        return changeDialog;
    }

    public JTextField getDayField() {
        return dayField;
    }

    public JLabel getDayLable() {
        return dayLable;
    }

    public JTextField getNameField() {
        return nameField;
    }

    public JLabel getNameLable() {
        return nameLable;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public JTextField getSlField() {
        return slField;
    }

    public JLabel getSlLabel() {
        return slLabel;
    }

    public JLabel getTitleLable() {
        return titleLable;
    }

    public JLabel getError_message_change_infor() {
        return error_message_change_infor;
    }

    public JButton getButtonDelete() {
        return buttonDelete;
    }

    public JButton getChinhSuaNVButton() {
        return chinhSuaNVButton;
    }

    public JTable getCsdlTableUser() {
        return csdlTableUser;
    }

    public JButton getXoaNVButton() {
        return xoaNVButton;
    }

    public JPanel getInAndOutPanel() {
        return inAndOutPanel;
    }

    public JTextField getDateUserChangeField() {
        return dateUserChangeField;
    }

    public JTextField getNameUserChangeField() {
        return nameUserChangeField;
    }

    public JPasswordField getPassUserChangeField() {
        return passUserChangeField;
    }

    public JButton getSaveUserChangeButton() {
        return saveUserChangeButton;
    }

    public JLabel getIdUserChange() {
        return idUserChange;
    }

    public JDialog getChinhSuaUserDialog() {
        return chinhSuaUserDialog;
    }

    public JPanel getUserPanel() {
        return userPanel;
    }

    public JLabel getErrorChinhSuaUser() {
        return errorChinhSuaUser;
    }

    public JTextField getTimeBegin() {
        return timeBegin;
    }

    public JTextField getTimeEnd() {
        return timeEnd;
    }

    public JLabel getErrorInAndOut() {
        return errorInAndOut;
    }

    public JButton getButtonSeachInOut() {
        return buttonSeachInOut;
    }

    public JDialog getLichSuGiaoDichDialog() {
        return lichSuGiaoDichDialog;
    }

    public JScrollPane getLichSuGiaoDichJScrollPanel() {
        return lichSuGiaoDichJScrollPanel;
    }

    public JTable getLichSuGiaoDichTable() {
        return lichSuGiaoDichTable;
    }

    public JButton getButtonChangeNN() {
        return buttonChangeNN;
    }

    public JButton getButtonAddNN() {
        return buttonAddNN;
    }

    public JButton getButtonDeleteNN() {
        return buttonDeleteNN;
    }

    public JScrollPane getPanelShowItemNN() {
        return panelShowItemNN;
    }

    public JButton getButtonHistoryNN() {
        return buttonHistoryNN;
    }

    public JTable getCsdlTableShowItemNN() {
        return csdlTableShowItemNN;
    }

    public JButton getAddMHButton() {
        return addMHButton;
    }

    public JDialog getAddMatHangDialog() {
        return addMatHangDialog;
    }

    public JTextField getDayAddField() {
        return dayAddField;
    }

    public JTextField getMaMHAddField() {
        return maMHAddField;
    }

    public JTextField getNameAddField() {
        return nameAddField;
    }

    public JTextField getSlAddField() {
        return slAddField;
    }

    public JButton getButtonSpenndNN() {
        return buttonSpendNN;
    }

    public JLabel getError_XuatKhoLabel() {
        return error_XuatKhoLabel;
    }

    public JTextField getMaMHXuatNNField() {
        return maMHXuatNNField;
    }

    public JTextField getNgayXuatNNField() {
        return ngayXuatNNField;
    }

    public JTextField getSlNNXuatField() {
        return slNNXuatField;
    }

    public JTextField getTenMHXuatNNField() {
        return tenMHXuatNNField;
    }

    public JTextField getUserXuatNNField() {
        return userXuatNNField;
    }

    public JDialog getXuatKhoDialog() {
        return xuatKhoDialog;
    }

    public JButton getYesButtonXuat() {
        return xuatKhoButtonXuat;
    }

    public DefaultTableModel getDtmCsdlShowItemNN() {
        return dtmCsdlShowItemNN;
    }

    public DefaultTableModel getDtmCsdlShowItem() {
        return dtmCsdlShowItem;
    }

    public DefaultTableModel getDtmCsdlTableUser() {
        return dtmCsdlTableUser;
    }

    public DefaultTableModel getDtmLichSuGiaoDichTable() {
        return dtmLichSuGiaoDichTable;
    }

    private DefaultTableModel dtmCsdlShowItemNN = new DefaultTableModel();
    private DefaultTableModel dtmCsdlShowItem = new DefaultTableModel();
    private DefaultTableModel dtmCsdlTableUser = new DefaultTableModel();
    private DefaultTableModel dtmLichSuGiaoDichTable = new DefaultTableModel();
    private DefaultTableModel dtmCsdlTableIntAndOut = new DefaultTableModel();
    private DefaultTableModel dtmTableSearch = new DefaultTableModel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem aboutMe;
    private javax.swing.JPanel aboutMePanel;
    private javax.swing.JPanel aboutMePanelNN;
    private javax.swing.JButton addMHButton;
    private javax.swing.JDialog addMatHangDialog;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JMenuItem backItem;
    private javax.swing.JButton backSubs;
    private javax.swing.JLabel birthdaySubsLabel2;
    private javax.swing.JTextField birthdaySubs_input;
    private javax.swing.JButton buttonAddNN;
    private javax.swing.JButton buttonChange;
    private javax.swing.JButton buttonChangeNN;
    private javax.swing.JButton buttonCheck;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonDeleteNN;
    private javax.swing.JButton buttonHistoryNN;
    private javax.swing.JButton buttonSeachInOut;
    private javax.swing.JButton buttonSpendNN;
    private javax.swing.JButton buttonUser;
    private javax.swing.JButton cancelDeleteUser;
    private javax.swing.JButton cancelDeleteYN;
    private javax.swing.JButton cancelExit;
    private javax.swing.JDialog changeDialog;
    private javax.swing.JMenuItem changeInforItem;
    private javax.swing.JButton chinhSuaNVButton;
    private javax.swing.JDialog chinhSuaUserDialog;
    private javax.swing.JComboBox<String> comboBoxView;
    private javax.swing.JTable csdlTableIntAndOut;
    private javax.swing.JTable csdlTableShowItem;
    private javax.swing.JTable csdlTableShowItemNN;
    private javax.swing.JTable csdlTableUser;
    private javax.swing.JTextField dateUserChangeField;
    private javax.swing.JTextField dayAddField;
    private javax.swing.JTextField dayField;
    private javax.swing.JLabel dayLable;
    private javax.swing.JLabel dayLable1;
    private javax.swing.JDialog deleteDialogYN;
    private javax.swing.JButton deleteNVButton;
    private javax.swing.JDialog deleteUserDialog;
    private javax.swing.JLabel errorChinhSuaUser;
    private javax.swing.JLabel errorInAndOut;
    private javax.swing.JLabel error_XuatKhoLabel;
    private javax.swing.JLabel error_message;
    private javax.swing.JLabel error_messageSubs;
    private javax.swing.JLabel error_message_add_infor;
    private javax.swing.JLabel error_message_change_infor;
    private javax.swing.JDialog exitDialog;
    private javax.swing.JLabel fullNameLable;
    private javax.swing.JTextField fullNameSubs_input;
    private javax.swing.JLabel fullnameSubsLabel2;
    private javax.swing.JComboBox<String> genderChange;
    private javax.swing.JLabel genderSubsLabel2;
    private javax.swing.JComboBox<String> genderSubs_input;
    private javax.swing.JButton giamSL;
    private javax.swing.JMenuItem goHome;
    private javax.swing.JLabel hoTenNV;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel homePanelNN;
    private javax.swing.JLabel idLable;
    private javax.swing.JLabel idUserChange;
    private javax.swing.JLabel idView;
    private javax.swing.JPanel inAndOutPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog lichSuGiaoDichDialog;
    private javax.swing.JScrollPane lichSuGiaoDichJScrollPanel;
    private javax.swing.JTable lichSuGiaoDichTable;
    private javax.swing.JButton login;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JMenuItem logout;
    private javax.swing.JButton lsGiaoDichButton;
    private javax.swing.JTextField maMHAddField;
    private javax.swing.JTextField maMHXuatNNField;
    private javax.swing.JLabel maMh;
    private javax.swing.JTextField maNV;
    private javax.swing.JTextField nameAddField;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLable;
    private javax.swing.JLabel nameLable1;
    private javax.swing.JLabel nameLable2;
    private javax.swing.JLabel nameTittle;
    private javax.swing.JTextField nameUserChangeField;
    private javax.swing.JTextField ngayXuatNNField;
    private javax.swing.JPanel nguoiNhapPanel;
    private javax.swing.JScrollPane panelShowItem;
    private javax.swing.JScrollPane panelShowItemNN;
    private javax.swing.JPasswordField passUserChangeField;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordSubsLabel2;
    private javax.swing.JPasswordField passwordSubs_input;
    private javax.swing.JButton resetButtonAddMatHang;
    private javax.swing.JButton resetButtonChange;
    private javax.swing.JButton resetButtonChinhSua;
    private javax.swing.JLabel retypePasswordSubsLabel2;
    private javax.swing.JPasswordField retypePasswordSubs_input;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton saveUserChangeButton;
    private javax.swing.JComboBox<String> searchBy;
    private javax.swing.JDialog selectDeleteDialog;
    private javax.swing.JComboBox<String> selectInOut;
    private javax.swing.JComboBox<String> selectLoaiHistoryDialog;
    private javax.swing.JPanel showAllPanel;
    private javax.swing.JTextField slAddField;
    private javax.swing.JTextField slField;
    private javax.swing.JLabel slLabel;
    private javax.swing.JLabel slLabel1;
    private javax.swing.JTextField slNNXuatField;
    private javax.swing.JButton subsButton;
    private javax.swing.JButton subscribe;
    private javax.swing.JPanel subscribePanel;
    private javax.swing.JScrollPane tableInAndOut;
    private javax.swing.JTable tableSearch;
    private javax.swing.JScrollPane tableUser1;
    private javax.swing.JButton tangSL;
    private javax.swing.JTextField tenMHXuatNNField;
    private javax.swing.JLabel testTer;
    private javax.swing.JLabel testTer1;
    private javax.swing.JTextField timeBegin;
    private javax.swing.JTextField timeEnd;
    private javax.swing.JLabel titleLable;
    private javax.swing.JLabel tittleBigin;
    private javax.swing.JLabel tittleEnd;
    private javax.swing.JPanel userPanel;
    private javax.swing.JLabel userView;
    private javax.swing.JTextField userXuatNNField;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameSubsLabel2;
    private javax.swing.JTextField usernameSubs_input;
    private javax.swing.JMenu viewMenu;
    private javax.swing.JButton xoaNVButton;
    private javax.swing.JButton xuatKhoButtonXuat;
    private javax.swing.JDialog xuatKhoDialog;
    private javax.swing.JButton yesDeleteUser;
    private javax.swing.JButton yesDeleteYN;
    private javax.swing.JButton yesExit;
    // End of variables declaration//GEN-END:variables
}
