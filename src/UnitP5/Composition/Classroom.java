package UnitP5.Composition;

public class Classroom{

    //Attributes
    private Teacher t;   //has a
    private Student[] students;  //has a
    private int noSt;

    public Classroom(){
        t = new Teacher();
        students = new Student[20];
        noSt = 0;

    }

    public void addStudent(Student s){
        students[noSt] = s;
        noSt++;

    }

    public Teacher getT() {
        return t;
    }

    public void setT(Teacher t) {
        this.t = t;
    }
}
