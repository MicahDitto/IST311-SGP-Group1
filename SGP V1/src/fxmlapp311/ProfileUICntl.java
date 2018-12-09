/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author micahdittmar
 */
public class ProfileUICntl implements Initializable {

    @FXML
    private Button makeProfileButton;
    @FXML private Text actiontarget;
    @FXML private ObservableList<User> listOfUsers;
    @FXML private TableView<User> userTable = new TableView<User>();
    @FXML private TextField fnTextField;
    @FXML private TextField lnTextField;
    @FXML private TextField unTextField;
    @FXML private TextField passwordTextField;
    @FXML private TextField confirmPasswordTextField;
    @FXML private UserUICntl userUIControl;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleMakeProfileButton(ActionEvent event) throws IOException {
        Alert confirm = new Alert(AlertType.INFORMATION);
        Stage theStage = (Stage) makeProfileButton.getScene().getWindow();
        boolean CredentialsAreValid = false;
        
        //Check Credentials
        if (fnTextField.getText() != null && lnTextField.getText() != null 
                && unTextField.getText() != null && passwordTextField.getText() != null
                && passwordTextField.getText().equals(confirmPasswordTextField.getText()) ) {
            CredentialsAreValid = true;
        }
        //Make new user with Credentials
        if (CredentialsAreValid) {
        User newUser = new User(fnTextField.getText(), lnTextField.getText(), unTextField.getText(), passwordTextField.getText());
        System.out.println("User Created: " + newUser.getFirstName() + " " + newUser.getLastName());

        //Add user to UserList
        //Persistant Data
//        UserCntl.getUserCntl(theStage).addUserRow(newUser);
        listOfUsers = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getUserList().getUserData();
//        userUIControl.updateTableView(listOfUsers);
        userTable.setItems(listOfUsers);
        
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
        
    }
    
    @FXML
    private void handleBackToLoginButton(ActionEvent event) throws IOException {
        
        Stage theStage = (Stage) makeProfileButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("LoginUI.fxml"));
        Scene scene = new Scene (root, 330, 200);
        theStage.setTitle("Login");
        theStage.setScene(scene);
        theStage.show();
        
//        actiontarget.setText("Back To Login button pressed");
//        Stage theStage = (Stage) actiontarget.getScene().getWindow();
//        theStage.hide();
//        ProfileCntl.getProfileCntl(theStage).getLoginCntl(theStage);
        }
    }
    

