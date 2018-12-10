package fxmlapp311.navigation.ui;

import fxmlapp311.navigation.NavigationCntl;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class NavigationUICntl {
    public NavigationCntl theParentController;
    @FXML private Text actiontarget;
    @FXML
    private Button gradeHubButton;
    
    
    @FXML protected void handleExitButtonAction(ActionEvent event) {
        actiontarget.setText("Exit button pressed");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        theParentController.exit();
    }
    
    @FXML protected void handleUsersButtonAction(ActionEvent event) {
        actiontarget.setText("Users button pressed");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        theStage.hide();
        theParentController.getUserCntl(theStage);
    }
    
    @FXML protected void handleUC2ButtonAction(ActionEvent event) {
        actiontarget.setText("UC2 button pressed");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        theStage.hide();
        theParentController.getGradeCntl(theStage);
    }
    
    
    
    @FXML protected void handleUC3ButtonAction(ActionEvent event) {
        actiontarget.setText("UC3 button pressed");
    }
        
    @FXML protected void handleUC4ButtonAction(ActionEvent event) {
        actiontarget.setText("UC4 button pressed");
    }
    
    protected void HandleProfile(ActionEvent event) {
        actiontarget.setText("Profile");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        theStage.hide();
        theParentController.getUserCntl(theStage);
    }

    @FXML
    private void handleGradeHubButton(ActionEvent event) throws IOException {
        theParentController.getGradeHubCntl();
    }

}
