package UnitP1;

import java.util.Scanner;

public class Ratings {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(13.8*69));
        Scanner in = new Scanner(System.in);
        System.out.println("Enter movie rating (as a decimal)");
        double rating = in.nextDouble();
        System.out.println("Rating rounded: " + (int)(rating + 0.5));
    }
}
