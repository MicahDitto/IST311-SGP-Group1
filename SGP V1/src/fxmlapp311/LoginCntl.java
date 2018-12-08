/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
 
public class LoginCntl {
    @FXML private Text actiontarget;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    //@FXML private Button actiontargetButton;

    
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
    
    @FXML protected void handleCreateProfileButton(ActionEvent event) throws IOException {
       
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("ProfileUI.fxml"));
        Scene scene = new Scene (root, 600, 500);
        theStage.setTitle("Profile");
        theStage.setScene(scene);
        theStage.show();
        
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
