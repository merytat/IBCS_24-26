package UnitP2;

import java.util.Scanner;

public class HouseRunner {
    public static void main(String[] args) {
        // 2 types of variable
        // Primitive - Reference

        //primitive
        //instantiating = assigning
        //type identifier = value;
        int noOfStudents = 13;
        double average = 6.5;
        boolean areTardy = false;


        //reference: create our own template
        //Variables of a reference data type are called OBJECTS
        // for variable type
        //instantiate = initialize
        //type identifier = new Constructor(parameters)
        House house1 = new House("G123", 4);
        House house2 = new House("G134", 2);
        System.out.println(house1);

        //paint the house
        house1.addRoof(); //calling a void method
        System.out.println(house1.addBase()); //calling a return method

        Scanner kb = new Scanner(System.in);
        System.out.println("What is your new address: ");
        String newAddress = kb.nextLine();
        house1.setAddress(newAddress); //call void setter to change the address
        System.out.println("House 1 address: " + house1.getAddress());
        String result = house1.getAddress();
    }
}
