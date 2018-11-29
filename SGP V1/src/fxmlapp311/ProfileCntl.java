
package fxmlapp311;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ProfileCntl {
    @FXML private Stage stage;
    @FXML private Text actiontarget;
    private static ProfileCntl theProfileCntl;
    @FXML
    private Button addRowButton;
    
    private ProfileCntl(Stage theExistingStage){
       stage = theExistingStage;
       this.setUpCreateProfileScene();
       stage.show();
    }
    
     public static ProfileCntl getProfileCntl(Stage theStage){
        if(theProfileCntl != null){
            return theProfileCntl;
        }else{
            theProfileCntl = new ProfileCntl(theStage);
            return theProfileCntl;
        }
    }
    
    @FXML public void setUpCreateProfileScene(){
        Parent root;
        Scene scene;
        try{
            root = FXMLLoader.load(getClass().getResource("ProfileUI.fxml"));
            scene = new Scene(root);
            stage.setTitle("Create Profile");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /*@FXML
    public void addRow(){
        User newUser = new User("AddFirst", "AddLast", "AddUsername", "AddPassword");
        Stage theStage = (Stage) addRowButton.getScene().getWindow();
        UserCntl.getUserCntl(theStage).addUserRow(tempUser);
        listOfUsers = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getuserList().getUserData();
        userTable.setItems(listOfUsers);
    }
    */
    
    
    public void exit(){
        System.exit(0);
    }
}
