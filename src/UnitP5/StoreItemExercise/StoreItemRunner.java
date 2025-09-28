package UnitP5.StoreItemExercise;

import java.util.Scanner;

public class StoreItemRunner {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Odd Market");
        System.out.println();

        StoreItemCollection sic = new StoreItemCollection();

        int option = -1;
        while(option != 0) {

            System.out.print("1 - Add Item \n" +
                    "2- Remove Item \n" +
                    "3 - Print Items in Cart \n" +
                    "0 - Quit \n" +
                    ">>");
            option = kb.nextInt();
            kb.nextLine();

            if (option == 1) {
                System.out.print("\tA - add non-taxable item \n" +
                        "\tB - add taxable Item \n" +
                        "\tX - back to main \n\t>>");
                String type = kb.nextLine();
                if (type.equals("A")){
                    System.out.print("\t\tItem name >> ");
                    String name = kb.nextLine();
                    System.out.print("\t\tItem price >> ");
                    double price = kb.nextDouble();
                    kb.nextLine();
                    System.out.print("\t\tClassification >> ");
                    String classification = kb.nextLine();
                    NonTaxableItem ni = new NonTaxableItem(name, price, classification);
                    sic.addItem(ni);
                    System.out.println("Item added to cart!");
                    System.out.println(ni);

                } else if (type.equals("B")) {
                    System.out.print("\t\t1 - car \n" +
                            "\t\t2 - not a car \n" +
                            "\t\t0 - back to main\n\t\t>>");
                    String taxableType = kb.nextLine();
                    if(!taxableType.equals("1") && !taxableType.equals("2")){
                        continue;

                    } else {
                        System.out.print("\t\t\tItem name >> ");
                        String name = kb.nextLine();
                        System.out.print("\t\t\tItem price >> ");
                        double price = kb.nextDouble();
                        kb.nextLine();
                        StoreItem ni;
                        if(taxableType.equals("1")){
                            ni = new Car(name,price);
                            sic.addItem(ni);
                        }
                        else{
                            ni = new TaxableItem(name,price);
                            sic.addItem(ni);
                        }
                        System.out.println("Item added to cart!");
                        System.out.println(ni);

                    }

                } else if (type.equals("X")) {
                    continue;

                } else{
                    System.out.println("Incorrect option - back to main");
                    continue;
                }


            } else if (option == 2) {
                sic.printItems();
                System.out.print("\t\tEnter Item name");
                String name = kb.nextLine();
                sic.removeItem(name);

            } else if (option == 3) {
                sic.printItems();

            } else if (option == 0) {
                System.out.println("Thanks");

            } else {
                System.out.println("Invalid option, try again");
            }
        }
    }
}
