/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.navigation;

import fxmlapp311.grade.GradeCntl;
import fxmlapp311.login.LoginCntl;
import fxmlapp311.navigation.ui.NavigationUICntl;
import fxmlapp311.user.UserCntl;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;

import java.io.IOException;

/**
 *
 * @author SHaynes
 */
public class NavigationCntl {
    
    @FXML private Stage theStage;
    @FXML private Text actiontarget;
    private static NavigationCntl theNavigationCntl;
    public LoginCntl theParentController;
    
    public NavigationCntl(Stage theStage, LoginCntl theParentController){
        this.theStage = theStage;
        this.theParentController = theParentController;
        try{
            this.setUpNavigationScene();
        } catch (IOException ex){
            System.out.println("Exception on line 36 of NavigationCntl.java");
        }
        theStage.show();
    }


    
    @FXML public void setUpNavigationScene() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ui/NavigationUI.fxml"));
        loader.load();
        NavigationUICntl theNavigationUICntl = loader.getController();
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
        theStage.setTitle("Navigation");
        theStage.setScene(scene);
        theNavigationUICntl.theParentController = this;
        theStage.show();
    }
    
    public void getUserCntl(Stage theStage){
        UserCntl.getUserCntl();
    }
    
    public void getGradeCntl(Stage theStage){
        GradeCntl.getGradeCntl(theStage);
    }
    
    public void getProfileCntl(Stage theStage){
        //ProfileCntl.getProfileCntl(theStage);
    }
    
    public void exit(){
        System.exit(0);
    }
    
}
