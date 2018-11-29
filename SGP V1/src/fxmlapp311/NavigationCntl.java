/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311;

import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;

/**
 *
 * @author SHaynes
 */
public class NavigationCntl {
    
    @FXML private Stage stage;
    @FXML private Text actiontarget;
    private static NavigationCntl theNavigationCntl;
    
    private NavigationCntl(Stage theExistingStage){
        stage = theExistingStage;
        this.setUpNavigationScene();
        stage.show();
    }
    
    public static NavigationCntl getNavigationCntl(Stage theStage){
        if(theNavigationCntl != null){
            return theNavigationCntl;
        }else{
            theNavigationCntl = new NavigationCntl(theStage);
            return theNavigationCntl;
        }
    }
    
    @FXML public void setUpNavigationScene(){
        Parent root;
        Scene scene;
        try{
            root = FXMLLoader.load(getClass().getResource("NavigationUI.fxml"));
            scene = new Scene(root);
            stage.setTitle("Navigation");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void getUserCntl(Stage theStage){
        UserCntl.getUserCntl(theStage);
    }
    
    public void getGradeCntl(Stage theStage){
        GradeCntl.getGradeCntl(theStage);
    }
    
    public void getProfileCntl(Stage theStage){
        ProfileCntl.getProfileCntl(theStage);
    }
    
    public void exit(){
        System.exit(0);
    }
    
}
