/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.grade;

import java.io.Serializable;

/**
 *
 * @author micahdittmar
 */
public class CourseGrade implements Serializable {
    
    private String course;
    private double percentage;

    public CourseGrade(String course, double percentage) {
        this.course = course;
        this.percentage = percentage;
    }

    public String getCourse() {
        return course;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setLetterGrade(double percentage) {
        this.percentage = percentage;
    }
    
    
}
