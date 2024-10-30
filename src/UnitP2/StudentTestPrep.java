package UnitP2;

public class StudentTestPrep {
    //Attributes
    private String name;
    private int stCode;
    private String schoolCode;
    private static int enrolledCount = 0;

    public static int getEnrolledCount(){
        return enrolledCount;
    }

    public StudentTestPrep(String name, String schoolCode){
        this.name = name;
        this.stCode = enrolledCount + 1;
        this.schoolCode = schoolCode;
        this.enrolledCount = enrolledCount + 1;
    }


}
