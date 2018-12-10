/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.predictCourseGrade;

import fxmlapp311.grade.CourseGrade;
import fxmlapp311.gradehub.GradeHubCntl;
import fxmlapp311.predictcoursegrade.ui.PredictCourseGradeUICntl;
/**
 *
 * @author micahdittmar
 */
public class PredictCourseGradeCntl {

    public PredictCourseGradeUICntl predictCourseGradeUICntl;
    
    public PredictCourseGradeCntl() {
        
    }

    public PredictCourseGradeCntl(GradeHubCntl aThis, CourseGrade selectedCourseGrade) {
        System.out.println("Testing");    
        
    }
    
}
