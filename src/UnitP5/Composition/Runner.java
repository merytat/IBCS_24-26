package UnitP5.Composition;

public class Runner {
    public static void main(String[] args) {
        // create a onSiteCourse object
        OnSiteCourse os1 = new OnSiteCourse("Java",1406);
        //create two Teacher objects
        Teacher t1 = new Teacher("Ms T");
        Teacher t2 = new Teacher("Mr. Andre");

        //create 5 Student objects
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        //create a classroom for the onSiteCourse
        Classroom c1 = new Classroom();


        //assign one of the teachers and 4 of the
        t1.chooseCourse(os1);
        c1.setT(t1);
        s1.assignCourse(os1);
        c1.addStudent(s1);


// students to the OnsiteCourse
// you might need an enrollSt method on classroom


        //overwrite the toString of Classroom to show
// teacher and students in the classroom

    }
}
