/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.predictgpa;

import fxmlapp311.gradehub.GradeHubCntl;
import fxmlapp311.predictgpa.ui.PredictGPAUICntl;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author micahdittmar
 */
public class PredictGPACntl {
    GradeHubCntl gradeHubCntl;
    Stage theStage;
    PredictGPACntl theGPACntl;
    public PredictGPAUICntl predictGPAUICntl;
    
    public void show() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ui/PredictGPA.fxml"));
        loader.load();
        this.predictGPAUICntl = loader.getController();
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
        theStage.setTitle("Predict GPA");
        theStage.setScene(scene);
        predictGPAUICntl.theParentController = this;
        theStage.show();      
    }

    public PredictGPACntl(GradeHubCntl gradeHubCntl, Stage theStage) throws IOException{
        System.out.println("testing");
        this.gradeHubCntl = gradeHubCntl;
        this.theStage = theStage;
        this.show();
    }
    
    public void backToGradeHubCntl() throws IOException {
        theStage.hide();
        gradeHubCntl.show();
    }
    
}
