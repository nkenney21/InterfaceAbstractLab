

package lab2;


public class StartUp {
    public static void main(String[] args) {
        /* I like using an interface because I can controll exactly how I want all of my classes to look
        I have found it easier to use and understand more than using abstract methods.
        */
        
        IntroToProgrammingCourse ipc1 = new IntroToProgrammingCourse("Intro To Programming", "0012", 3);
        IntroJavaCourse ijc1 = new IntroJavaCourse("Intro to Java", "0013", 4);
        AdvancedJavaCourse ajc1 = new AdvancedJavaCourse("Advanced Java", "0014", 4);
        
        
        System.out.println("Course " + ajc1.getCourseName() + " is a " + ajc1.getCredits() + " credit class");
        }
    
}
