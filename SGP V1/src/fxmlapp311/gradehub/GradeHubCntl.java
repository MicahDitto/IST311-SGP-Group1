/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.gradehub;

import fxmlapp311.gradehub.ui.GradeHubUICntl;
import fxmlapp311.navigation.NavigationCntl;
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
    NavigationCntl theNavigationCntl;
    Stage theStage;
    GradeHubUICntl theGradeHubUICntl;
    

    public GradeHubCntl(NavigationCntl theNavigationCntl, Stage theStage) throws IOException {
        this.theNavigationCntl = theNavigationCntl;
        this.theStage = theStage;
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
    
    
    
}
