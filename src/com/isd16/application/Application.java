package com.isd16.application;

import com.isd16.controller.ActionEvent;
import com.isd16.controller.KeyEvent;
import com.isd16.controller.MouseEvent;
import com.isd16.controller.WindowEvent;
import com.isd16.view.View;

/**
 *
 * @author vietanh
 */
public class Application {
    
    // Method to config MVC
    public static void configMVC() throws Exception {
        View view = new View();
        ActionEvent actionEvent = new ActionEvent(view);
        KeyEvent keyEvent = new KeyEvent(view);
        MouseEvent mouseEvent = new MouseEvent(view);
        WindowEvent windowEvent = new WindowEvent(view);

        //Add event for view
        view.addEventListener(actionEvent, keyEvent, mouseEvent, windowEvent);
    }

    public static void main(String[] args) throws Exception {
        configMVC();
    }

}
