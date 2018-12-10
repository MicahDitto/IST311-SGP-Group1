/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.user;

import java.io.*;

/**
 *
 * @author SHaynes
 */
public class User implements Serializable{

    private String firstName = new String();
    private String lastName  = new String();
    private String username  = new String();
    private String password  = new String();

    public User(String newFirstName, String newLastName, String newUsername, String newPassword){
        setFirstName(newFirstName);
        setLastName(newLastName);
        setUsername(newUsername);
        setPassword(newPassword);
    }

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
        setUsername(newUsername);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
