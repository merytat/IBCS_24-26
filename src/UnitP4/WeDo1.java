package UnitP4;

public class WeDo1 {
    public static void main(String[] args) {
        //declare an array of strings
        String[] stNames = {"Franco","Omar","Lana","Taj","Iyad"};
        //declare an array of double for GPAs
        double[] gpas = new double[5]; //instantiate an array
        gpas[0] = 4.3; //add values to the array
        gpas[1] = 3.95;
        gpas[2] = 4.0;
        gpas[3] = 3.8;
        gpas[4] = 2.5;

        System.out.println(stNames[0] +" : "+ gpas[0]);
        stNames[0] = "Mery Tellez"; //change values on the array
        System.out.println(stNames[0] +" : "+ gpas[0]);

        String hi = "hello hi how are you";
        System.out.println(hi.length());
        System.out.println(stNames.length); //length attribute gives
        // me No of spaces in the array

        System.out.println(stNames[stNames.length-1] + " : " +
                gpas[gpas.length-1]);

        //print both arrays
        for(int i=0; i < stNames.length; i++){
            System.out.println(stNames[i] + " : " + gpas[i]);
        }

        //calculate average for the class
        double total = 0;
        for(int i = 0; i<stNames.length; i++){
            total += gpas[i];
        }
        double average = total/ stNames.length;
        System.out.println("Average: " + average);

        //students above average
        System.out.println("Students higher than average:");
        for(int i = 0; i< gpas.length; i++){
            if(gpas[i] > average){
                System.out.println(stNames[i] + " : " + gpas[i]);
            }
        }
    }
}
