/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.login;

import java.io.IOException;

import fxmlapp311.login.ui.LoginUICntl;
import fxmlapp311.navigation.NavigationCntl;
import fxmlapp311.profile.ProfileCntl;
import fxmlapp311.user.UserCntl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
 
public class LoginCntl {
    LoginUICntl theLoginUICntl;
    UserCntl theUserCntl;
    Stage theStage;

    public LoginCntl(Stage theStage) throws IOException{
        this.theStage = theStage;
        this.show();
    }
    public void goToProfileCntl() throws IOException{
        ProfileCntl profileCntl = new ProfileCntl(theStage, this);
    }
    public boolean authenticate(String username, String password){
        return theUserCntl.validateUser(username, password);
    }
    public void show() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ui/LoginUI.fxml"));
        loader.load();
        this.theLoginUICntl = loader.getController();
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
        theStage.setTitle("Login");
        theStage.setScene(scene);
        theLoginUICntl.theParentController = this;
        theStage.show();
    }
    public UserCntl getUserCntl(){
        if (theUserCntl == null){
            theUserCntl = new UserCntl();
        }
        return theUserCntl;
    }
    public void showNavigationCntl(String username){
        theStage.hide();
        NavigationCntl theNavigationCntl = new NavigationCntl(theStage, this);
    }
}
