package UnitP1;

import java.util.Scanner;

public class Futbol {
    public static void main(String[] args) {

        //scanner is a class
        //variable of type Scanner is an object
        // kb is an object
        Scanner kb = new Scanner(System.in);
        System.out.print("Wins: ");
        int wins = kb.nextInt();
        kb.nextLine();

        //Whenever you use nextLine after reading a number
        //you must add an extra nextLine to read the enter
        //and avoid skipping
        System.out.println("type your name");
        String name = kb.nextLine();

        System.out.print("Draws: ");
        int draws = kb.nextInt();

        System.out.print("losses: ");
        int losses = kb.nextInt();

        System.out.println("Total Points: " + (wins*3 + draws));





    }
}
