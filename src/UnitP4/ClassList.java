package UnitP4;

public class ClassList {
    private String[] names;
    private double[] gpas;

    public ClassList(int numberSt){
        names = new String[numberSt];
        gpas = new double[numberSt];
    }

    public String highestGPA(){
        String result = "";
        double maxGPA = gpas[0];
        for(int i = 1; i<gpas.length; i++){
            if(gpas[i]>maxGPA){
                maxGPA = gpas[i];
                result = names[i];
            }
        }
        return result;
    }

    public double findGPA(String name){
        for(int i =0; i<names.length; i++){
            if(names[i].equals(name)){
                return gpas[i];
            }
        }

        return -1;
    }

    public double classAverage(){
        double sum = 0;
        for(int i = 0; i < gpas.length; i++){
            sum += gpas[i];
        }
        return sum/gpas.length;
    }
}

class ClassListTester{
    public static void main(String[] args) {
        ClassList dpy1 = new ClassList(13);
        ClassList intro = new ClassList(21);
    }
}
