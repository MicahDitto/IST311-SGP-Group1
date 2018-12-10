package fxmlapp311.grade;

import fxmlapp311.persistentData.PersistentDataCntl;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.collections.ObservableList;


public class GradeCntl {
    
    private Stage stage;
    private static GradeCntl theGradeCntl;
    private ObservableList<CourseGrade> theListOfGrades;
    
    private GradeCntl(Stage theExistingStage){
        theListOfGrades = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getgradeList().getGradeData();
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
    
    public void setUpGradeListScene(){
        Parent root;
        Scene scene;
        try{
            root = FXMLLoader.load(getClass().getResource("fxmlapp311/grade/GradeUI.fxml"));
            scene = new Scene(root);
            stage.setTitle("Grades");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void addGradeRow(CourseGrade newGrade){
        PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getgradeList().getGradeData().add(newGrade);
        PersistentDataCntl.getPersistentDataCntl().writeSerializedDataModel();
    }
    
    public ObservableList<CourseGrade> getListOfGrades(){
        return theListOfGrades;
    }
    
    public Stage getStage(){
        return stage;
    }
    
}
