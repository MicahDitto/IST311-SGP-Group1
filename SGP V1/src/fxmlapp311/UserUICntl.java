/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author SHaynes
*/
public class UserUICntl implements Initializable {
    
    @FXML
    private TableView<User> userTable = new TableView<User>();
    @FXML
    private TableColumn<User, String> firstNameColumn = new TableColumn("First Name");
    @FXML
    private TableColumn<User, String> lastNameColumn  = new TableColumn("Last Name");;
    @FXML
    private TableColumn<User, String> usernameColumn  = new TableColumn("Username");;
    @FXML
    private ObservableList<User> listOfUsers;
    @FXML
    private Button getSelectedRowButton;
    @FXML
    private Button backToNavigationButton;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Get the data for the table
        listOfUsers = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getUserList().getUserData();
    
        // Set up the table columns and link them to the table data fields
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<User,String>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<User,String>("lastName"));
        usernameColumn.setCellValueFactory(new PropertyValueFactory<User,String>("username"));
        
        SimpleStringProperty s = new SimpleStringProperty("Test");
        TextField t = new TextField("Test");
        if(s.get().equals(t.getText())){
            System.out.println("Success");
        }
        
        // Add the data to the table
        userTable.setItems(listOfUsers);
    }    
    
    
    @FXML
    public void handleGetSelectedRowButton(ActionEvent event){
        User tempUser = userTable.getSelectionModel().getSelectedItem();
        System.out.println(tempUser.getUsername());
        // Could pass the user to the UserCntl to show in a new Stage/Scene
    }
    
    @FXML 
    public void handleBackToNavigationButton(ActionEvent event) throws IOException {
       //Doesn't Work
//            Stage stage = (Stage) getSelectedRowButton.getScene().getWindow();
//            stage.hide();
//            NavigationCntl theNavigationCntl = NavigationCntl.getNavigationCntl(stage);
//            
////            Scene scene = new Scene (root, 600, 500);
////            stage.setScene(scene);
//            stage.show();
        

        //Doesn't Allow for Back and forth between nav and user
            Stage theStage = (Stage) getSelectedRowButton.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("NavigationUI.fxml"));
            Scene scene = new Scene (root);
            theStage.setTitle("Navigation");
            theStage.setScene(scene);
            theStage.show();
       
    }
    
    
    @FXML
    public TableView updateTableView(ObservableList<User> list){
        userTable.setItems(list);
        return userTable;
    }
    
    
}
