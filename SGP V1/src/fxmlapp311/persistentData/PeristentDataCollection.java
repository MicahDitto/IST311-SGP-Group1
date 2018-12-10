/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.persistentData;

import fxmlapp311.grade.CourseGradeList;
import fxmlapp311.user.UserList;

import java.io.*;

/**
 *
 * @author SHaynes
 */
public class PeristentDataCollection implements Serializable{
    
    private UserList theUserList;
    private CourseGradeList theGradeList;
    // All other persistent data will go below here
    
    public PeristentDataCollection(){
        
        UserList.getInstance();
        if(theGradeList == null){
            theGradeList = new CourseGradeList();
        }
    }
    
    public UserList getuserList(){
        return UserList.getInstance();
    }
    
    public CourseGradeList getgradeList(){
        return theGradeList;
    }
    
}
