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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author micahdittmar
 */
public class ProfileUICntl implements Initializable {

    @FXML
    private Button createProfileButton;
    @FXML private Text actiontarget;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleCreateProfileButton(ActionEvent event) throws IOException {
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("ProfileUICntl.fxml"));
        Scene scene = new Scene (root, 600, 800);
        theStage.setTitle("Profile");
        theStage.setScene(scene);
        theStage.show();
    }
    
}
