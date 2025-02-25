package UnitP3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //first exercise
        //input
        Scanner kb = new Scanner(System.in);
        //System.out.println("Enter red plates:");
        int red = kb.nextInt();
        int green = kb.nextInt();
        int blue = kb.nextInt();

        double cost = (red*3) + (green*4) + (blue*5);

        System.out.println(cost);


    }
}
