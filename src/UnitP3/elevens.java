package UnitP3;

import java.util.Scanner;

public class elevens {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number to check:");
        long number = kb.nextLong();

        while(number > 99){
            long nextNumber = number/10;
            long onesDigit = number % 10;
            number = nextNumber - onesDigit;
            System.out.println(nextNumber + " - " + onesDigit);

        }

        if (number % 11 == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
