package UnitP5.Composition;

public class Student {
    private String name;
    private double GPA;
    private Course[] classes;
    private int noCourses;

    public Student(){
        name = "newbie";
        GPA = 4.0;
        classes = new Course[8];
        noCourses = 0;
    }

    public void assignCourse(Course c){
        classes[noCourses] = c;
        noCourses++;
    }

}
