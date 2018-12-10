/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.grade;

/**
 *
 * @author micahdittmar
 */
public class CourseGrade {
    
    private String course;
    private String letterGrade;

    public CourseGrade(String course, String letterGrade) {
        this.course = course;
        this.letterGrade = letterGrade;
    }

    public String getCourse() {
        return course;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }
    
    
}
