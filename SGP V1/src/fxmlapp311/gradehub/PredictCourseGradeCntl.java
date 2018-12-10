/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.gradehub;

import fxmlapp311.predictcoursegrade.ui.PredictCourseGradeUICntl;
import fxmlapp311.grade.CourseGrade;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author micahdittmar
 */
public class PredictCourseGradeCntl {

    GradeHubCntl theParentController;
    CourseGrade selectedCourseGrade;
    PredictCourseGradeUICntl thePredictCourseGradeUICntl;
    Stage theStage;
            
    PredictCourseGradeCntl(GradeHubCntl theParentController, CourseGrade selectedCourseGrade) throws IOException {
        this.theParentController = theParentController;
        this.selectedCourseGrade = selectedCourseGrade;
        this.show();
        
    }
    
    public void show() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ui/PredictCourseGradeUI.fxml"));
        loader.load();
        this.thePredictCourseGradeUICntl = loader.getController();
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
        theStage.setTitle("Predict Course Grade");
        theStage.setScene(scene);
        thePredictCourseGradeUICntl.theParentController = this;
        theStage.show();
    }
    
    public void backToGradeHubCntl() throws IOException{
        theStage.hide();
        theParentController.show();
    }
}
