package unitP2;

public class Student {
    //attributes
    private String name;
    private int gradeLevel;

    //constructors

    public Student(){
        //leave empty
    }

    public Student(String n, int grade) {
        name = n;
        gradeLevel = grade;
    }

    //methods
    public String getName() {
        return name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGradeLevel(int grade) {
        gradeLevel = grade;
    }
}
