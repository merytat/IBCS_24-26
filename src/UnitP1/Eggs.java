package UnitP1;

import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        //input
        Scanner kb = new Scanner(System.in);
        System.out.print("Number of eggs: ");
        int eggs = kb.nextInt();
        System.out.print("Price per dozen: ");
        double price12 = kb.nextDouble();
        System.out.print("Price per egg: ");
        double price1 = kb.nextDouble();

        //process
        int noDozens = eggs/12;
        int extraEggs = eggs%12;
        double totalPrice = (price12 * noDozens) + (price1 * extraEggs);
        System.out.println("Total Price: " + totalPrice);
    }
}
