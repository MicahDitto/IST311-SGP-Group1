/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311;

import javafx.beans.property.SimpleStringProperty;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author SHaynes
 */
public class User implements Serializable{
    
    // SimpleStringProperty is NOT serializable
    /*
    private SimpleStringProperty firstName = new SimpleStringProperty();
    private SimpleStringProperty lastName  = new SimpleStringProperty();
    private SimpleStringProperty username  = new SimpleStringProperty();
    private SimpleStringProperty password  = new SimpleStringProperty();
    */
    
    //CanvasWrapper userGradeProfile = new CanvasWrapper();  //Micah ADDED Canvas Wrapper
    private String firstName = new String();
    private String lastName  = new String();
    private String username  = new String();
    private String password  = new String();
    //private ArrayList<CourseGrade> userGrades = new ArrayList(); // ADDED userGrades as an attribute of the user
    
                //= userGradeProfile.getBadGrades();

    
    public User(String newFirstName, String newLastName, String newUsername, String newPassword){
        firstName = newFirstName;
        lastName = newLastName;
        username = newUsername;
        password = newPassword;
        //userGrades = userGradeProfile.getRandomGrades();            //When User is created they get random grades through Canvas Wrapper
    }
    
    // SimpleStringProperty is NOT serializable
    /*
    public User(String newFirstName, String newLastName, String newUsername, String newPassword){
        firstName.set(newFirstName);
        lastName.set(newLastName);
        username.set(newUsername);
        password.set(newPassword);
    }
    */

//    User(String string, String string0, String string1, String string2) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
 
   
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
        
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setusername(String newUsername) {
        username = newUsername;
    }
    
    // SimpleStringProperty is NOT serializable
    /*
    public String getFirstName() {
        return firstName.get();
    }
    
    public void setFirstName(String newFirstName) {
        firstName.set(newFirstName);
    }
        
    public String getLastName() {
        return lastName.get();
    }
    
    public void setLastName(String newLastName) {
        lastName.set(newLastName);
    }
    
    public String getUsername() {
        return username.get();
    }
    
    public void setusername(String newUsername) {
        username.set(newUsername);
    }
    */
}
