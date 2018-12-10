
package fxmlapp311.grade;

import javafx.collections.*;
import java.io.*;
import java.util.*;


public class CourseGradeList implements Serializable{
    
   // private ObservableList<Grade> theListOfGrades;
    private ArrayList<CourseGrade> theListOfGradesAL;
    
    public CourseGradeList(){
        theListOfGradesAL = getTestGrades();
    }
    
    public ObservableList<CourseGrade> getGradeData() {
        ObservableList<CourseGrade> theListOfGrades;
        List<CourseGrade> gradeList = (List<CourseGrade>) theListOfGradesAL;
        theListOfGrades = FXCollections.observableList(gradeList);
        return theListOfGrades;
    }
    
    public ArrayList<CourseGrade> getTestGrades(){
        ArrayList<CourseGrade> testGrades = new ArrayList();
        for (int i = 0; i < 100; i++) {
            CourseGrade newGrade = new CourseGrade("Class" + 1, i);
            testGrades.add(newGrade);
        }
        return testGrades;
    }
    
    public CourseGrade addGrade(String className, double percentage){
        CourseGrade newGrade = new CourseGrade(className, 99.9);
        return newGrade;
    }
    
    
}
