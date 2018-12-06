
package fxmlapp311;

import java.io.IOException;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ProfileCntl {
    @FXML private Stage stage;
    @FXML private Text actiontarget;
    private static ProfileCntl theProfileCntl;
    @FXML private Button createProfileButton;
    @FXML private ObservableList listOfUsers;
    @FXML private TableView<User> userTable;
    
    private ProfileCntl(Stage theExistingStage){
       stage = theExistingStage;
       //this.setUpCreateProfileScene();
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
    @FXML
    public void handleCreateProfileButton() throws IOException{
//        User newUser = new User("AddFirst", "AddLast", "AddUsername", "AddPassword");
//        Stage theStage = (Stage) createProfileButton.getScene().getWindow();
//        Parent root = FXMLLoader.load(getClass().getResource("ProfileUI.fxml"));
//        Scene scene = new Scene (root, 600, 800);
//        theStage.setTitle("Profile");
//        theStage.setScene(scene);
//        theStage.show();
        
        
//        UserCntl.getUserCntl(theStage).addUserRow(newUser);
//        listOfUsers = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getuserList().getUserData();
//        userTable.setItems(listOfUsers);
        
    }
    
    
    
    
    
    public void exit(){
        System.exit(0);
    }
}
