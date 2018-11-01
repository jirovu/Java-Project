/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isd16.services;

import com.isd16.controller.ActionEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VuVietAnh
 */
public class ThreadProcess extends Thread {

    private ActionEvent actionEvent;

    public ThreadProcess() {
    }

    public ThreadProcess(ActionEvent actionEvent) {
        this.actionEvent = actionEvent;
    }

    @Override
    public void run() {
        try {
            actionEvent.runProcess();
        } catch (SQLException ex) {
            Logger.getLogger(ThreadProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
