package UnitP3;

import java.util.Scanner;

public class MethodsRunner {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); //creating Scanner object
        Methods methods = new Methods(); //creating a Methods object
        System.out.println("Enter the no of pages: ");
        int pages = kb.nextInt();
        methods.printing(pages); //calling method printing from Methods

        System.out.println("Enter no of eggs");
        int eggs = kb.nextInt();
        methods.eggs(eggs);
    }
}
