/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.profile.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import fxmlapp311.persistentData.PersistentDataCntl;
import fxmlapp311.profile.ProfileCntl;
import fxmlapp311.user.User;
import fxmlapp311.user.UserCntl;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author micahdittmar
 */
public class ProfileUICntl implements Initializable {

    @FXML
    private Button makeProfileButton;
    @FXML
    private ObservableList<User> listOfUsers;
    @FXML
    private TableView<User> userTable;
    @FXML
    private TextField fnTextField;
    @FXML
    private TextField lnTextField;
    @FXML
    private TextField unTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private TextField confirmPasswordTextField;

    public ProfileCntl theParentController;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void handleMakeProfileButton(ActionEvent event) throws IOException {
        boolean CredentialsAreValid = false;

        //Check Credentials
        if (fnTextField.getText() != null && lnTextField.getText() != null
                && unTextField.getText() != null && passwordTextField.getText() != null
                && passwordTextField.getText().equals(confirmPasswordTextField.getText())) {
            CredentialsAreValid = true;
        }

        //Make new user with Credentials
        theParentController.makeProfile(CredentialsAreValid, fnTextField.getText(), lnTextField.getText(), unTextField.getText(), passwordTextField.getText());

    }

    @FXML
    private void handleBackToLoginButton(ActionEvent event) throws IOException {
        theParentController.backToLogin();
    }
}
    

