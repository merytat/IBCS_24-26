package UnitP1;

import java.util.Scanner;

public class NightOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much did dinner cost?");
        double dinner = input.nextDouble();
        System.out.println("How much is mini-golf?");
        double golf = input.nextDouble();
        System.out.println("How much did dessert cost?");
        double dessert = input.nextDouble();

        //calculation
        double totalCost = dinner + dessert + (2 * golf);
        System.out.println("Dinner: $" + dinner);
        System.out.println("Mini-golf: $" + golf);
        System.out.println("Dessert: $" + dessert);
        System.out.println("Grand Total: $" +totalCost);
    }
}
