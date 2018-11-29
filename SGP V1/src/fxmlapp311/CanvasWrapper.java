/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311;

import java.util.ArrayList;

/**
 *
 * @author micahdittmar
 */
public class CanvasWrapper {
    
    //Attributes of grades. It generates user grades
    
    private ArrayList<CourseGrade> allA;
    private ArrayList<CourseGrade> goodGrades;
    private ArrayList<CourseGrade> averageGrades;
    private ArrayList<CourseGrade> belowAvgGrades;
    private ArrayList<CourseGrade> badGrades;
    
    CourseGrade calcA = new CourseGrade("Calculus 1", "A");
    CourseGrade calcB = new CourseGrade("Calculus 1", "B");
    CourseGrade calcC = new CourseGrade("Calculus 1", "C");
    CourseGrade chemA = new CourseGrade("Chem 110", "A");
    CourseGrade chemB = new CourseGrade("Chem 110", "B");
    CourseGrade chemC = new CourseGrade("Chem 110", "C");
    CourseGrade econA = new CourseGrade("Econ 102", "A");
    CourseGrade econB = new CourseGrade("Econ 102", "B");
    CourseGrade econC = new CourseGrade("Econ 102", "C");
    
    
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
    }
    
    private void generateGoodGrades() {
        goodGrades.add(calcA);
        goodGrades.add(chemB);
        goodGrades.add(econA);
    }
    
    private void generateAverageGrades() {
        averageGrades.add(calcB);
        averageGrades.add(chemB);
        averageGrades.add(econB);
    }
    
    private void generateBelowAvgGrades() {
        belowAvgGrades.add(calcB);
        belowAvgGrades.add(chemB);
        belowAvgGrades.add(econC);
    }
    
    private void generateBadGrades() {
        badGrades.add(calcC);
        badGrades.add(chemC);
        badGrades.add(econA);
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