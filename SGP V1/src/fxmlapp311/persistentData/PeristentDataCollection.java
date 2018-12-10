/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.persistentData;

import fxmlapp311.grade.GradeList;
import fxmlapp311.user.UserList;

import java.io.*;

/**
 *
 * @author SHaynes
 */
public class PeristentDataCollection implements Serializable{
    
    private UserList theUserList;
    private GradeList theGradeList;
    // All other persistent data will go below here
    
    public PeristentDataCollection(){
        if(theUserList == null){
            theUserList = new UserList();
        }
        if(theGradeList == null){
            theGradeList = new GradeList();
        }
    }
    
    public UserList getuserList(){
        return theUserList;
    }
    
    public GradeList getgradeList(){
        return theGradeList;
    }
    
}
