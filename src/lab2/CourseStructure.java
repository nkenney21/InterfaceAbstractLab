/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

import javax.swing.JOptionPane;

/**
 *
 * @author neilkenney
 */
public interface CourseStructure {
        
    public String getCourseNumber();
    public abstract void setCourseNumber();
    public abstract double getCredits();
    public abstract void setCredits();
    public abstract String getCourseName();
    public abstract void setCourseName();
    
}
