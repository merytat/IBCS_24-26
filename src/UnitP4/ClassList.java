package UnitP4;

public class ClassList {
    private String[] names;
    private double[] gpas;

    public ClassList(int numberSt){
        names = new String[numberSt];
        gpas = new double[numberSt];
    }

    public String highestGPAName(){
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

    public double highestGPA(){
        double maxGPA = gpas[0];
        for(int i = 1; i<gpas.length; i++){
            if(gpas[i]>maxGPA){
                maxGPA = gpas[i];
            }
        }
        return maxGPA;
    }

    public boolean duplicateHighest(){
        boolean flag = false;
        int counter = 0;
        double highest = highestGPA();
        int i = 0;
        while(i< gpas.length && counter < 2){
            if(highest == gpas[i]){
                counter++;
            }
            i++;
        }
        if(counter > 1){
            flag = true;
            //return flag;
        }
        return flag;
    }

    public void printPairs(){
        for(int i = 0; i < gpas.length-1; i++){
            System.out.println(names[i] + ": " + gpas[i] + ", " +
                                names[i+1] + ": " + gpas[i+1]);
        }
    }

    public void shiftLeft(){
        double tempGpa = gpas[0];
        String tempName = names[0];
        for(int i = 0; i<gpas.length-1; i++){
            gpas[i] = gpas[i+1];
            names[i] = names[i+1];
        }
        gpas[gpas.length-1] = tempGpa;
        names[gpas.length-1] = tempName;
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

    public int aboveAverage(){
        int counter = 0;
        double average = classAverage();
        for(int i = 0; i < gpas.length; i++){
            if(gpas[i] > average){
                counter++;
            }
        }
        return counter;
    }
}

class ClassListTester{
    public static void main(String[] args) {
        ClassList dpy1 = new ClassList(13);
        ClassList intro = new ClassList(21);
    }
}
