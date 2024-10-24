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

    public StudentTestPrep(String name, int stCode, String schoolCode){
        this.name = name;
        this.stCode = stCode;
        this.schoolCode = schoolCode;
        this.enrolledCount = enrolledCount + 1;
    }


}
