package fxmlapp311;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.collections.ObservableList;


public class GradeCntl {
    
    @FXML private Stage stage;
    private static GradeCntl theGradeCntl;
    private ObservableList<Grade> theListOfGrades;
    
    private GradeCntl(Stage theExistingStage){
        theListOfGrades = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getGradeList().getGradeData();
        stage = theExistingStage;
        this.setUpGradeListScene();
        stage.show();
    }
    
    public static GradeCntl getGradeCntl(Stage theStage){
        if(theGradeCntl != null){
            return theGradeCntl;
        }else{
            theGradeCntl = new GradeCntl(theStage);
            return theGradeCntl;
        }
    }
    
    @FXML public void setUpGradeListScene(){
        Parent root;
        Scene scene;
        try{
            root = FXMLLoader.load(getClass().getResource("GradeUI.fxml"));
            scene = new Scene(root);
            stage.setTitle("Grades");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void addGradeRow(Grade newGrade){
        PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getGradeList().getGradeData().add(newGrade);
        PersistentDataCntl.getPersistentDataCntl().writeSerializedDataModel();
    }
    
    public ObservableList<Grade> getListOfGrades(){
        return theListOfGrades;
    }
    
    public Stage getStage(){
        return stage;
    }
    
}
