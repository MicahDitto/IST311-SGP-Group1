/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.predictCourseGrade.ui;


import fxmlapp311.predictCourseGrade.PredictCourseGradeCntl;
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
public class PredictCourseGradeUICntl implements Initializable {

    public PredictCourseGradeCntl theParentController;
    @FXML
    private TextField CurrentGradeTextField;
    @FXML
    private Button predictButton;
    @FXML
    private TextField predictedCourseGradeTextField;
    @FXML
    private Button backButton;

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handlePredictButton(ActionEvent event) {
        double theGrade = Double.parseDouble(CurrentGradeTextField.getText());
        double predictedGrade = theGrade * (Math.random() *.05 + -.05 + 1) + 2;
        predictedCourseGradeTextField.setText(Double.toString(predictedGrade));
        predictButton.setDisable(true);
    }

    @FXML
    private void handleBackButton(ActionEvent event) throws IOException {
        theParentController.backToGradeHubCntl();
    }
    
}
