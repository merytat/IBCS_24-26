package UnitP4;

import java.util.Scanner;

public class RadioStations {
    public static void main(String[] args) {
        Scanner tj = new Scanner(System.in);
        double[] radio = new double[6];
        String[] names = new String[6];

        for(int i = 0; i<radio.length; i++){
            System.out.print("Enter a radio station: ");
            radio[i] = tj.nextDouble();
            tj.nextLine(); //discarding the enter after the number
            System.out.println("Enter the name of the station");
            names[i] = tj.nextLine();

        }

        double max = radio[0];
        double min = radio[0];
        for(int i = 1; i<radio.length; i++){
            if(radio[i]>max){
                max = radio[i];
            }
            if(radio[i]<min){
                min = radio[i];
            }
        }

        System.out.println(max - min);

        System.out.println("Select a station from 1-6");
        int chosen = tj.nextInt();
        System.out.println(names[chosen-1]);
        System.out.println(radio[chosen-1]);
    }
}
