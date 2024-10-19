package UnitP2;

public class StudentRunner {
    public static void main(String[] args) {
        Student alharbi = new Student("Mohammad", 11);
        System.out.println(alharbi.getName());
        System.out.println(alharbi.getGradeLevel());
        Student ada = new Student();
        ada.setName("Ada");
        ada.setGradeLevel(12);
        System.out.println(ada.getName());
        System.out.println(ada.getGradeLevel());
    }
}
