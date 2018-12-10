/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.user;

import fxmlapp311.persistentData.PersistentDataCntl;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.collections.ObservableList;

import static fxmlapp311.persistentData.PersistentDataCntl.*;

/**
 *
 * @author SHaynes
 */
public class UserCntl {
    
    @FXML private Stage stage;
    private static UserCntl theUserCntl;
    private UserList theListOfUsers;
    
    public UserCntl(){
        theListOfUsers = getPersistentDataCntl().getPeristentDataCollection().getuserList();

    }

    public boolean validateUser(String username, String password){
        return theListOfUsers.validateUser(username, password);
    }

    public static UserCntl getUserCntl(){
        if(getTheUserCntl() != null){
            return getTheUserCntl();
        }else{
            setTheUserCntl(new UserCntl());
            return getTheUserCntl();
        }
    }

    public static UserCntl getTheUserCntl() {
        return theUserCntl;
    }

    public static void setTheUserCntl(UserCntl theUserCntl) {
        UserCntl.theUserCntl = theUserCntl;
    }

    @FXML public void setUpUserListScene(){
        Parent root;
        Scene scene;
        try{
            root = FXMLLoader.load(getClass().getResource("fxmlapp311/user/UserUI.fxml"));
            scene = new Scene(root);
            stage.setTitle("Users");
            stage.setScene(scene);

            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void addUserRow(User newUser){
        getPersistentDataCntl().getPeristentDataCollection().getuserList().getUserData().add(newUser);
        getPersistentDataCntl().writeSerializedDataModel();
        getPersistentDataCntl().readSerializedDataModel();
    }
    
    public UserList getListOfUsers(){
        return theListOfUsers;
    }
    
    public Stage getStage(){
        return stage;
    }
    
}
