
package fxmlapp311;

import javafx.collections.*;
import java.io.*;
import java.util.*;


public class GradeList implements Serializable{
    
   // private ObservableList<Grade> theListOfGrades;
    private ArrayList<Grade> theListOfGradesAL;
    
    public GradeList(){
        theListOfGradesAL = getTestGrades();
    }
    
    public ObservableList<Grade> getGradeData() {
        ObservableList<Grade> theListOfGrades;
        List<Grade> gradeList = (List<Grade>) theListOfGradesAL;
        theListOfGrades = FXCollections.observableList(gradeList);
        return theListOfGrades;
    }
    
    public ArrayList<Grade> getTestGrades(){
        ArrayList<Grade> testGrades = new ArrayList();
        for (int i = 0; i < 100; i++) {
            Grade newGrade = new Grade("Class Name" + i, "Grade" + i);
            testGrades.add(newGrade);
        }
        return testGrades;
    }
    
    public Grade addGrade(String className, String grade){
        Grade newGrade = new Grade(className, grade);
        return newGrade;
    }
    
    
}
