/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.predictCourseGrade;

import fxmlapp311.grade.CourseGrade;
import fxmlapp311.gradehub.GradeHubCntl;
import fxmlapp311.predictCourseGrade.ui.PredictCourseGradeUICntl;
import java.io.IOException;
import java.util.Random;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author micahdittmar
 */
public class PredictCourseGradeCntl {
    GradeHubCntl gradeHubCntl;
    Stage theStage;
    PredictCourseGradeCntl theCourseGradeCntl;
    public PredictCourseGradeUICntl predictCourseGradeUICntl;
    
    
    public void show() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ui/PredictCourseGradeUI.fxml"));
        loader.load();
        this.predictCourseGradeUICntl = loader.getController();
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
        theStage.setTitle("Grade Hub");
        theStage.setScene(scene);
        predictCourseGradeUICntl.theParentController = this;
        theStage.show();
    }

    public PredictCourseGradeCntl(GradeHubCntl gradeHubCntl, CourseGrade selectedCourseGrade, Stage theStage) throws IOException {
        System.out.println("Testing");    
        this.gradeHubCntl = gradeHubCntl;
        this.theStage = theStage;
        this.show();
    }

    public void backToGradeHubCntl() throws IOException  {
        theStage.hide();
        gradeHubCntl.show();
    }
    
    public static double getRandomNumberInRange(double min, double max) {
        if (min >= max) {
                throw new IllegalArgumentException("max must be greater than min");
        }
        return (Math.random() * ((max - min) + 1)) + min;
    }
    
    
}
