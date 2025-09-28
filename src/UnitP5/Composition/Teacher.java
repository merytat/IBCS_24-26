package UnitP5.Composition;

public class Teacher {
    private String name;
    private double salary;
    private Course[] courses;
    private int noCourses;

    public void chooseCourse(Course c){
        courses[noCourses] = c;
        noCourses++;
    }

    public Teacher(){
        this.name = "guest";
        salary = 40000;
        courses = new Course[5];
        noCourses = 0;
    }

    public Teacher(String name){
        this.name = name;
        salary = 80000;
        courses = new Course[5];
        noCourses = 0;
    }
}
