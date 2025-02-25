package UnitP3;

import java.util.Scanner;

public class Lab03Level3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String letter;
        System.out.print("Enter a letter (0 to exit) ");
        letter = kb.nextLine();
        int counterS = 0;
        int counter = 0;

        while(!letter.equals("0")){
            //only one character
            if(letter.length() > 1){
                System.out.println("Error: Enter only a character or 0");
            }
            else if(letter.equals("s") || letter.equals("S")){
                counterS++;
                counter++;
            }
            else{
                counter++;
            }
            System.out.print("Enter a letter (0 to exit) ");
            letter = kb.nextLine();
        }

        System.out.println("You entered the letter S " + counterS + " times");
        System.out.println("You entered a total of " + counter + " letters");
    }
}
