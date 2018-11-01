/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isd16.controller;

import com.isd16.services.Services;
import com.isd16.view.View;
import java.awt.event.WindowListener;

/**
 *
 * @author VuVietAnh
 */
public class WindowEvent implements WindowListener{
    private View view;
    private Services services = null;

    public WindowEvent(View view) {
        this.view = view;
        services = new Services();
    }

    public WindowEvent() {
    }




//    WINDOW EVENT
    @Override
    public void windowOpened(java.awt.event.WindowEvent e) throws UnsupportedOperationException {

    }

    @Override
    public void windowClosing(java.awt.event.WindowEvent e) throws UnsupportedOperationException {
        if (e.getSource() == this.view.getExitDialog()
                || e.getSource() == this.view.getChangeDialog()
                || e.getSource() == this.view.getChinhSuaUserDialog()
                || e.getSource() == this.view.getLichSuGiaoDichDialog()
                || e.getSource() == this.view.getAddMatHangDialog()
                || e.getSource() == this.view.getDeleteDialogYN()
                || e.getSource() == this.view.getDeleteUserDialog()
                || e.getSource() == this.view.getSelectDeleteDialog()) {
            this.view.setEnabled(true);
        }

        if (e.getSource() == this.view.getXuatKhoDialog()) {
            this.view.setEnabled(true);
        }
    }

    @Override
    public void windowClosed(java.awt.event.WindowEvent e) throws UnsupportedOperationException {
    }

    @Override
    public void windowIconified(java.awt.event.WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(java.awt.event.WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(java.awt.event.WindowEvent e) throws UnsupportedOperationException {
        if (!this.view.getNameField().getText().trim().equals("")
                && !this.view.getSlField().getText().trim().equals("")
                && !this.view.getDayField().getText().trim().equals("")) {
            this.view.getError_message_change_infor().setText("");
            this.view.getSaveButton().setEnabled(true);
        }
    }

    @Override
    public void windowDeactivated(java.awt.event.WindowEvent e) throws UnsupportedOperationException {
    }
}
