/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.gradehub.ui;

import fxmlapp311.gradehub.GradeHubCntl;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 *
 * @author micahdittmar
 */
public class GradeHubUICntl {

    @FXML
    private Button predictGPAButton;
    @FXML
    private Button predictCourseGradeButton;
    @FXML
    private TableView<?> gradeHubTable;
    @FXML
    private TableColumn<?, ?> courseNameColumn;
    @FXML
    private TableColumn<?, ?> gradeColumn;
    @FXML
    private Button backButton;
    
    public GradeHubCntl theParentController;

    @FXML
    private void handlePredictGPAButton(ActionEvent event) {
        
    }

    @FXML
    private void handlePredictedCourseGradeButton(ActionEvent event) {
    }

    @FXML
    private void handleBackButton(ActionEvent event) throws IOException {
        theParentController.backToNavigationCntl();
    }
    
}
