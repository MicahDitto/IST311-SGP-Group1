/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author micahdittmar
 */
public class ProfileUICntl implements Initializable {

    @FXML
    private Button makeProfileButton;
    @FXML private Text actiontarget;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleMakeProfileButton(ActionEvent event) throws IOException {
        Alert confirm = new Alert(AlertType.INFORMATION);
        
        
        confirm.setTitle("Create Profile");
        confirm.setHeaderText("Profile Confirmation");
        confirm.setContentText("I have a great message for you!");

        confirm.showAndWait();
        
        
    }
    
}
