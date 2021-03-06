/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.gradehub;

import fxmlapp311.grade.CourseGrade;
import fxmlapp311.gradehub.ui.GradeHubUICntl;
import fxmlapp311.navigation.NavigationCntl;
import fxmlapp311.predictCourseGrade.PredictCourseGradeCntl;
import fxmlapp311.predictgpa.PredictGPACntl;
import fxmlapp311.user.User;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author micahdittmar
 */
public class GradeHubCntl {
    public NavigationCntl theNavigationCntl;
    public Stage theStage;
    public GradeHubUICntl theGradeHubUICntl;
    public User theUser;
    

    public GradeHubCntl(NavigationCntl theNavigationCntl, Stage theStage, User theUser) throws IOException {
        this.theNavigationCntl = theNavigationCntl;
        this.theStage = theStage;
        this.theUser = theUser;
        this.show();
    }
    
    public void show() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ui/GradeHubUI.fxml"));
        loader.load();
        this.theGradeHubUICntl = loader.getController();
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
        theStage.setTitle("Grade Hub");
        theStage.setScene(scene);
        theGradeHubUICntl.theParentController = this;
        theStage.show();
    }
    
    public void backToNavigationCntl() throws IOException{
        theStage.hide();
        theNavigationCntl.show();
    }
    
    public void getPredictGPACntl() throws IOException{
        theStage.hide();
        PredictGPACntl PredictGPACntl = new PredictGPACntl(this, theStage);
        
    }

    public void getPredictedCourseGrade(CourseGrade selectedCourseGrade) throws IOException {
        theStage.hide();
        PredictCourseGradeCntl PredictCourseGradeCntl = new PredictCourseGradeCntl(this, selectedCourseGrade, theStage);
    }
    
    public User getTheUser(){
        
        return theUser;
    }
    
}
