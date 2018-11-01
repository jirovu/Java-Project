/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isd16.controller;

import com.isd16.services.Services;
import com.isd16.view.View;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VuVietAnh
 */
public class MouseEvent implements MouseListener{
    private View view;
    private Services services = null;

    public MouseEvent(View view) {
        this.view = view;
        services = new Services();
    }

    public MouseEvent() {
    }
    
    //    MOUSE EVENT
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) throws UnsupportedOperationException {
        if (e.getSource() == this.view.getCsdlTableShowItem() && this.view.getCsdlTableShowItem().isEnabled()) {
            this.view.getButtonChange().setEnabled(true);
            this.view.getButtonDelete().setEnabled(true);
        }

        if (e.getSource() == this.view.getCsdlTableShowItemNN()) {
            try {
                if (services.checkMatHang(
                        String.valueOf(this.view.getCsdlTableShowItemNN().getValueAt(this.view.getCsdlTableShowItemNN().getSelectedRow(), 0)),
                        this.view.getUsername().getText())) {
                    this.view.getButtonChangeNN().setEnabled(true);
                    this.view.getButtonDeleteNN().setEnabled(true);
                } else {
                    this.view.getButtonChangeNN().setEnabled(false);
                    this.view.getButtonDeleteNN().setEnabled(false);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MouseEvent.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.view.getButtonHistoryNN().setEnabled(true);
            this.view.getButtonSpenndNN().setEnabled(true);
            this.view.getButtonSpenndNN().setEnabled(true);
        }

        if (e.getSource() == this.view.getCsdlTableUser() && this.view.getCsdlTableUser().isEnabled()) {
            this.view.getXoaNVButton().setEnabled(true);
            this.view.getChinhSuaNVButton().setEnabled(true);
            this.view.getLsGiaoDichButton().setEnabled(true);
        }
        
        if(e.getSource() == this.view.getTableSearch()){
            this.view.getDeleteNVButton().setEnabled(true);
        }
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) throws UnsupportedOperationException {
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) throws UnsupportedOperationException {
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) throws UnsupportedOperationException {
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) throws UnsupportedOperationException {
    }
}
