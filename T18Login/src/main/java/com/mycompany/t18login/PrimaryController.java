package com.mycompany.t18login;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML
    private TextField txtUser;
    @FXML
    private PasswordField txtPassword;
    
    @FXML
    private void login(ActionEvent event) throws IOException {
        String username = txtUser.getText();
        String password = txtPassword.getText();
        if ("admin".equals(username) && "abc123".equals(password)) {
        App.setRoot("secondary");
        }
    }
}
