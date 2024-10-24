package UnitP2;

import java.util.Scanner;

public class FoodRunner {

    public static void main(String[] args) {
        Food burger = new Food("Hamburgers", 600);
        System.out.println(burger);
        Scanner kb = new Scanner(System.in);
        System.out.println("How many would you like?");
        int numHamburgers = kb.nextInt();
//        Hamburgers have 600 calories.
//                How many would you like?
//        2
//
//        French Fries have 350 calories.
//                How many would you like?
        Food frenchFries = new Food("French Fries", 350);
        System.out.println(frenchFries);
        System.out.println("How many would you like?");
        int numfries = kb.nextInt();
//        1
//
//        Coke have 200 calories.
//                How many would you like?
        Food coke = new Food("Coke", 200);
        System.out.println(coke);
        System.out.println("How many would you like?");
        int numCoke = kb.nextInt();
        System.out.println("Your meal will have a total of " + (numHamburgers * burger.getCalories() +
                numfries * frenchFries.getCalories() + numCoke * coke.getCalories()) + " calories");
//        2
//
//        Your meal will have a total of 1950 calories
    }
}
