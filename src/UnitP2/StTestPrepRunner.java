package UnitP2;

public class StTestPrepRunner {
    public static void main(String[] args) {
        StudentTestPrep franco =
                new StudentTestPrep("Franco", 0001, "TKS");
        System.out.println(StudentTestPrep.getEnrolledCount());
        StudentTestPrep omar =
                new StudentTestPrep("Omar", 0002, "TKS");
        System.out.println(StudentTestPrep.getEnrolledCount());
    }
}
