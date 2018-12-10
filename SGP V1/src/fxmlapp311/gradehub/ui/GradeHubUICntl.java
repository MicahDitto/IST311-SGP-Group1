/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.gradehub.ui;

import fxmlapp311.CanvasWrapper;
import fxmlapp311.grade.CourseGrade;
import fxmlapp311.grade.CourseGradeList;
import fxmlapp311.gradehub.GradeHubCntl;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 *
 * @author micahdittmar
 */
public class GradeHubUICntl implements Initializable{

    @FXML
    private Button predictGPAButton;
    @FXML
    private Button predictCourseGradeButton;
    @FXML
    private TableView<CourseGrade> gradeHubTable;
    @FXML
    private TableColumn<CourseGrade, String> courseNameColumn;
    @FXML
    private TableColumn<CourseGrade, Double> gradeColumn;
    @FXML
    private Button backButton;
    private ObservableList<CourseGrade> obsCourseGrades;
    
    public GradeHubCntl theParentController;
    private CanvasWrapper cW = new CanvasWrapper();

    @FXML
    private void handlePredictGPAButton(ActionEvent event) {
        theParentController.getPredictGPACntl();
    }

    @FXML
    private void handlePredictedCourseGradeButton(ActionEvent event) throws IOException {
        CourseGrade selectedCourseGrade = this.gradeHubTable.getSelectionModel().getSelectedItem();
        theParentController.getPredictedCourseGrade(selectedCourseGrade);
    }

    @FXML
    private void handleBackButton(ActionEvent event) throws IOException {
        theParentController.backToNavigationCntl();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ArrayList<CourseGrade> gradesForTable = cW.getRandomGrades(); //Get FROM USER
       this.obsCourseGrades = FXCollections.observableArrayList(gradesForTable);
       this.gradeHubTable.setItems(this.obsCourseGrades);
       this.courseNameColumn.setCellValueFactory(cellData -> {
           CourseGrade cg = cellData.getValue();
       return new ReadOnlyStringWrapper(cg.getCourse());
       });
       
          this.gradeColumn.setCellValueFactory(cellData -> {
           CourseGrade cg = cellData.getValue();
       return new SimpleDoubleProperty(cg.getPercentage()).asObject();
       });
    }
    
    
}
