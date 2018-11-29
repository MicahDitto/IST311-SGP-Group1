package fxmlapp311;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class NavigationUICntl {
    @FXML private Text actiontarget;
    
    
    @FXML protected void handleExitButtonAction(ActionEvent event) {
        actiontarget.setText("Exit button pressed");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        NavigationCntl.getNavigationCntl(theStage).exit();
    }
    
    @FXML protected void handleUsersButtonAction(ActionEvent event) {
        actiontarget.setText("Users button pressed");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        theStage.hide();
        NavigationCntl.getNavigationCntl(theStage).getUserCntl(theStage);
    }
    
    @FXML protected void handleUC2ButtonAction(ActionEvent event) {
        actiontarget.setText("UC2 button pressed");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        theStage.hide();
        NavigationCntl.getNavigationCntl(theStage).getGradeCntl(theStage);
    }
    
    
    
    @FXML protected void handleUC3ButtonAction(ActionEvent event) {
        actiontarget.setText("UC3 button pressed");
    }
        
    @FXML protected void handleUC4ButtonAction(ActionEvent event) {
        actiontarget.setText("UC4 button pressed");
    }
    
    @FXML protected void HandleProfile(ActionEvent event) {
        actiontarget.setText("Profile");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        theStage.hide();
        NavigationCntl.getNavigationCntl(theStage).getUserCntl(theStage);
    }

}
