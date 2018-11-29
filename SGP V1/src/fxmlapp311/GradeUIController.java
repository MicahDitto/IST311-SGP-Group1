package fxmlapp311;

import java.net.URL;
import java.util.ResourceBundle;
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
    private TableView<Grade> gradeTable = new TableView<Grade>();
    
    @FXML
    private TableColumn<Grade, String> classNameColumn  = new TableColumn("Class Name");;
    @FXML
    private TableColumn<Grade, String> gradeColumn = new TableColumn("Grade");;
    @FXML
    private ObservableList<Grade> listOfGrades;
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
        classNameColumn.setCellValueFactory(new PropertyValueFactory<Grade,String>("className"));
        gradeColumn.setCellValueFactory(new PropertyValueFactory<Grade,String>("grade"));
        
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
        Grade tempGrade = new Grade("AddClassName", "AddGrade");
        Stage theStage = (Stage) addRowButton.getScene().getWindow();
        GradeCntl.getGradeCntl(theStage).addGradeRow(tempGrade);
        listOfGrades = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getgradeList().getGradeData();
        gradeTable.setItems(listOfGrades);
    }
    
    @FXML
    public void getSelectedRow(){
        Grade tempGrade = gradeTable.getSelectionModel().getSelectedItem();
        System.out.println(tempGrade.getClassName());
    }
    
}
