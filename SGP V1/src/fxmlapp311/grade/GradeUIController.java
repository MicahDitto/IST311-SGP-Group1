package fxmlapp311.grade;

import java.net.URL;
import java.util.ResourceBundle;

import fxmlapp311.persistentData.PersistentDataCntl;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TextField;



public class GradeUIController implements Initializable {
    
    @FXML
    private TableView<CourseGrade> gradeTable = new TableView<CourseGrade>();
    
    @FXML
    private TableColumn<CourseGrade, String> classNameColumn  = new TableColumn("Class Name");;
    @FXML
    private TableColumn<CourseGrade, String> gradeColumn = new TableColumn("Grade");;
    @FXML
    private ObservableList<CourseGrade> listOfGrades;
    @FXML
    private Button getSelectedRowButton;
    @FXML
    private Button addRowButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Get the data for the table
        listOfGrades = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getgradeList().getGradeData();
    
        // Set up the table columns and link them to the table data fields
        classNameColumn.setCellValueFactory(new PropertyValueFactory<CourseGrade,String>("className"));
        gradeColumn.setCellValueFactory(new PropertyValueFactory<CourseGrade,String>("grade"));
        
        SimpleStringProperty s = new SimpleStringProperty("Test");
        TextField t = new TextField("Test");
        if(s.get().equals(t.getText())){
            System.out.println("Success");
        }
        
        // Add the data to the table
        gradeTable.setItems(listOfGrades);
    }    
    
    @FXML
    public void addRow(){
        CourseGrade tempGrade = new CourseGrade("AddClassName", 99.9);
        Stage theStage = (Stage) addRowButton.getScene().getWindow();
        GradeCntl.getGradeCntl(theStage).addGradeRow(tempGrade);
        listOfGrades = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getgradeList().getGradeData();
        gradeTable.setItems(listOfGrades);
    }
    
    
}
