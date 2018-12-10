/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.grade;

import javafx.beans.property.SimpleStringProperty;
import java.io.*;


public class Grade implements Serializable{
    
    // SimpleStringProperty is NOT serializable
    /*
    private SimpleStringProperty firstName = new SimpleStringProperty();
    private SimpleStringProperty lastName  = new SimpleStringProperty();
    private SimpleStringProperty username  = new SimpleStringProperty();
    private SimpleStringProperty password  = new SimpleStringProperty();
    */
    
    private String className  = new String();
    private String grade  = new String();
    
    public Grade(String newClassName, String newGrade){
        
        className = newClassName;
        grade = newGrade;
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
    
  
    
    public String getClassName() {
        return className;
    }
    
    public void setClassName(String newClassName) {
        className = newClassName;
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
