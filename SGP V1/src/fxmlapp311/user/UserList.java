/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.user;

import javafx.collections.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author SHaynes
 */
public class UserList implements Serializable{
    
    private ArrayList<User> theListOfUsersAL;
    private static UserList singleton;
    private User currentlyAuthenticatedUser;
    
    private UserList(){
        theListOfUsersAL = getTestUsers();
    }
    
    public static UserList getInstance(){
        if(singleton == null){
            singleton = new UserList();
        }
            return singleton;
    }
    
    public ObservableList<User> getUserData() {
        ObservableList<User> theListOfUsers;
        List<User> userList = (List<User>) theListOfUsersAL;
        theListOfUsers = FXCollections.observableList(userList);
        return theListOfUsers;
    }
    
    public void setAuthedUser(User u){
        this.currentlyAuthenticatedUser = u;
    }
    
    public User getCurrentlyAuthenticatedUser(){
        return this.currentlyAuthenticatedUser;
    }
    
    public ArrayList<User> getTestUsers(){
        ArrayList<User> testUsers = new ArrayList();
        for (int i = 0; i < 100; i++) {
            User newUser = new User("First" + i, "Last" + i, "username" + i, "password" + i);
            testUsers.add(newUser);
        }
        return testUsers;
    }
    
    public User getUser(String username){
        for(int i = 0; i < theListOfUsersAL.size(); i++) {
            if (theListOfUsersAL.get(i).getUsername().equals(username)) {
                return theListOfUsersAL.get(i);
            }
        }
        return new User("","","","");
    }
    
    public User addUser(String firstname, String lastname, String username, String password){
        User newUser = new User(firstname, lastname, username, password);
        return newUser;
    }

    public boolean validateUser(String username, String password){
        boolean isValid = false;
        ObservableList<User> theList = this.getUserData();
        for (User aTheList : theList) {
            if (aTheList.getUsername().equals(username)) {
                System.out.println("Username match");
                if (aTheList.getPassword().equals(password)) {
                    isValid = true;
                    break;
                }
            }
        }
        return isValid;
    }
    
    
}
