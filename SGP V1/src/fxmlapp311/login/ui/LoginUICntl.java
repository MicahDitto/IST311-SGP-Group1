/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.login.ui;

import fxmlapp311.login.LoginCntl;
import fxmlapp311.navigation.NavigationCntl;
import fxmlapp311.user.UserList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginUICntl {
    @FXML private Text actiontarget;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;


    public LoginCntl theParentController;

    public LoginUICntl(){
        System.out.println("LoginCntl constructor called.");

    }

    public void setParentController(LoginCntl theParentController){
        this.theParentController = theParentController;
    }


    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
        String un = usernameField.getText();
        String pw = passwordField.getText();

        if(theParentController.authenticate(un, pw)){
            UserList.getInstance().setAuthedUser(UserList.getInstance().getUser(un));
            theParentController.showNavigationCntl(un);
        } else {
            usernameField.setText("");
            passwordField.setText("");
            actiontarget.setText("Invalid login");
        }
    }
    
    @FXML protected void handleCreateProfileButton(ActionEvent event) throws IOException {
        theParentController.goToProfileCntl();

        
    }
    
    public boolean authenticate(String username, String password){
        return theParentController.authenticate(username,password);
    }

}
