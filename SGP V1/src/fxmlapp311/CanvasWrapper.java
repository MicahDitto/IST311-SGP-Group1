/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311;

import fxmlapp311.grade.CourseGrade;
import java.io.Serializable;

import java.util.ArrayList;

/**
 *
 * @author micahdittmar
 */
public class CanvasWrapper implements Serializable{
    
    //Attributes of grades. It generates user grades
    
    private ArrayList<CourseGrade> allA = new ArrayList();
    private ArrayList<CourseGrade> goodGrades = new ArrayList();
    private ArrayList<CourseGrade> averageGrades = new ArrayList();
    private ArrayList<CourseGrade> belowAvgGrades = new ArrayList();
    private ArrayList<CourseGrade> badGrades = new ArrayList();
    
    CourseGrade calcA = new CourseGrade("Calc 1", 95);
    CourseGrade calcB = new CourseGrade("Calc 1", 85);
    CourseGrade calcC = new CourseGrade("Calc 1", 75);
    CourseGrade GPA1 = new CourseGrade("GPA", 4.0);
    CourseGrade GPA2 = new CourseGrade("GPA", 3.75);
    CourseGrade GPA3 = new CourseGrade("GPA", 3.0);
    CourseGrade GPA4 = new CourseGrade("GPA", 2.25);
    CourseGrade GPA5 = new CourseGrade("GPA", 2.0);
    CourseGrade chemA = new CourseGrade("Chem 110", 95);
    CourseGrade chemB = new CourseGrade("Chem 110", 85);
    CourseGrade chemC = new CourseGrade("Chem 110", 75);
    CourseGrade econA = new CourseGrade("Econ 102", 95);
    CourseGrade econB = new CourseGrade("Econ 102", 85);
    CourseGrade econC = new CourseGrade("Econ 102", 75);
    
    
    public CanvasWrapper(){
        generateAllA();
        generateGoodGrades();
        generateAverageGrades();
        generateBelowAvgGrades();
        generateBadGrades();
        
    }
          
    private void generateAllA() {
        allA.add(calcA);
        allA.add(chemA);
        allA.add(econA);
        allA.add(GPA1);
    }
    
    private void generateGoodGrades() {
        goodGrades.add(calcA);
        goodGrades.add(chemB);
        goodGrades.add(econA);
        goodGrades.add(GPA2);
    }
    
    private void generateAverageGrades() {
        averageGrades.add(calcB);
        averageGrades.add(chemB);
        averageGrades.add(econB);
        averageGrades.add(GPA3);
    }
    
    private void generateBelowAvgGrades() {
        belowAvgGrades.add(calcB);
        belowAvgGrades.add(chemC);
        belowAvgGrades.add(econC);
        belowAvgGrades.add(GPA4);
    }
    
    private void generateBadGrades() {
        badGrades.add(calcC);
        badGrades.add(chemC);
        badGrades.add(econC);
        badGrades.add(GPA5);
    }

    public ArrayList<CourseGrade> getAllA() {
        return allA;
    }

    public ArrayList<CourseGrade> getGoodGrades() {
        return goodGrades;
    }

    public ArrayList<CourseGrade> getAverageGrades() {
        return averageGrades;
    }

    public ArrayList<CourseGrade> getBelowAvgGrades() {
        return belowAvgGrades;
    }

    public ArrayList<CourseGrade> getBadGrades() {
        return badGrades;
    }
    
    public ArrayList<CourseGrade> getRandomGrades() {
        ArrayList<CourseGrade> grades = new ArrayList();
        double randomDouble = Math.random();
	randomDouble = randomDouble * 5 + 1;
	int randomInt = (int) randomDouble;
	if (randomInt == 1) {
            grades = allA;
        }
        if (randomInt == 2) {
            grades = goodGrades;
        }
        if (randomInt == 3) {
            grades = averageGrades;
        }
        if (randomInt == 4) {
            grades = belowAvgGrades;
        }
        if (randomInt == 5) {
            grades = badGrades;
        }
        return grades;
    }
}