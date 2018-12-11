/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.predictgpa.ui;

import fxmlapp311.predictgpa.PredictGPACntl;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author micahdittmar
 */
public class PredictGPAUICntl implements Initializable {
    
    public PredictGPACntl theParentController;

    @FXML
    private Button predictButton;
    @FXML
    private TextField currentGPATextField;
    @FXML
    private Button backButton;
    @FXML
    private TextField predictGPAButton;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handlePredictButton(ActionEvent event) {
        double theGPA = Double.parseDouble(currentGPATextField.getText());
        double thePredictedGPA = theGPA * (Math.random() *.3 + -.3 + 1) + .5;
        if (thePredictedGPA < 4.0){
           predictGPAButton .setText(Double.toString(thePredictedGPA));

        }
        else {
            predictGPAButton.setText("4.0");   
        }
        predictButton.setDisable(true);
        
    }

    @FXML
    private void handleBackButton(ActionEvent event) throws IOException {
        theParentController.backToGradeHubCntl();
    }
    
}
