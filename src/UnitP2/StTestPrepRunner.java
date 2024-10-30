package UnitP2;

public class StTestPrepRunner {
    public static void main(String[] args) {
        StudentTestPrep franco =
                new StudentTestPrep("Franco", "TKS");
        System.out.println(StudentTestPrep.getEnrolledCount());
        StudentTestPrep omar =
                new StudentTestPrep("Omar", "TKS");
        System.out.println(StudentTestPrep.getEnrolledCount());
    }
}
