
package fxmlapp311.profile;

import fxmlapp311.login.LoginCntl;
import fxmlapp311.persistentData.PersistentDataCntl;
import fxmlapp311.profile.ui.ProfileUICntl;
import fxmlapp311.user.User;
import fxmlapp311.user.UserCntl;
import fxmlapp311.user.UserList;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;


public class ProfileCntl {
    public Stage theStage;
    public LoginCntl theLoginCntl;

    public ProfileCntl(Stage theStage, LoginCntl theLoginCntl) throws IOException {
        this.theLoginCntl = theLoginCntl;
        this.theStage = theStage;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ui/ProfileUI.fxml"));
        loader.load();
        ProfileUICntl theProfileUICntl = loader.getController();
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
        theStage.setTitle("Profile");
        theStage.setScene(scene);
        theProfileUICntl.theParentController = this;
        theStage.show();
    }
    
    public void exit(){
        System.exit(0);
    }

    public void backToLogin() throws IOException{
        theStage.hide();
        theLoginCntl.show();

    }

    public void makeProfile(boolean credentialsAreValid, String fName, String lName, String userName, String password){
        Alert confirm = new Alert(Alert.AlertType.INFORMATION);
        User newUser;
        if (credentialsAreValid){
            newUser = new User(fName, lName, userName, password);
            System.out.println("User Created: " + newUser.getFirstName() + " " + newUser.getLastName());

            //Add user to UserList
            //Persistent Data
            theLoginCntl.getUserCntl().addUserRow(newUser);
            //UserList listOfUsers = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getuserList().getUserData();


            confirm.setTitle("Create Profile");
            confirm.setHeaderText("Profile Confirmation");
            confirm.setContentText("Profile Creation Successful");

            confirm.showAndWait();
        } else {
            confirm.setTitle("Create Profile");
            confirm.setHeaderText("Profile Failure");
            confirm.setContentText("Invalid User Credentials");
            confirm.showAndWait();
        }
        try {
            this.backToLogin();
        }catch (Exception ex){
            System.out.println("Exception on Line 80 of ProfileCntl");
        }
    }
}
