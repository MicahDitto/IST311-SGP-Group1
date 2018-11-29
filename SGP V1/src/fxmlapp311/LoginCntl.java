/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
 
public class LoginCntl {
    @FXML private Text actiontarget;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    
    public LoginCntl(){
        System.out.println("LoginCntl constructor called.");
    }
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
        String un = usernameField.getText();
        String pw = passwordField.getText();
        if(authenticate(un, pw)){
            Stage stage = (Stage) actiontarget.getScene().getWindow();
            stage.hide();
            NavigationCntl theNavigationCntl = NavigationCntl.getNavigationCntl(stage);
        }else{
            usernameField.setText("");
            passwordField.setText("");
            actiontarget.setText("Invalid login");
        }    
    }
    
    @FXML protected void handleCreateProfile(ActionEvent event) {
        actiontarget.setText("Create Profile");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        theStage.hide();
        NavigationCntl.getNavigationCntl(theStage).getProfileCntl(theStage);
    }
    
    
    
    public boolean authenticate(String username, String password){
        boolean authenticated = false;
        if(username.equals("good")&& password.equals("user")){
            authenticated = true;
        }else{
            authenticated = false;
        }
        return authenticated;
    }

}
