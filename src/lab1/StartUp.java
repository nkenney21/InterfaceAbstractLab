
package lab1;


public class StartUp {
    public static void main(String[] args) {
        
        IntroToProgrammingCourse c1 = new IntroToProgrammingCourse();
        AdvancedJavaCourse aj1 = new AdvancedJavaCourse();  
        IntroJavaCourse ij1 = new IntroJavaCourse();
          
        
        c1.setCourseName("Intro To Programming");
        c1.setCourseNumber("0011");
        c1.setCredits(3);
        
        ij1.setCourseName("Intro To Java");
        ij1.setCourseNumber("0012");
        ij1.setCredits(4);
        ij1.setPrerequisites(c1.getCourseName());
        
        aj1.setCourseName("Advanced Java");
        aj1.setCourseNumber("0013");
        aj1.setCredits(4);
        aj1.setPrerequisites(ij1.getCourseName());
        
        
        System.out.println("Class " + ij1.getCourseName() + " has a prerequisite of " + ij1.getPrerequisites());
        System.out.println("Class " + aj1.getCourseName() + " has a prerequisite of " + aj1.getPrerequisites());
        
        
        
        
 
           
        } // end for
    } // end main

