package UnitP4.ArrayListPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class WeDo1 {
    public static void main(String[] args) {
        //not limited to data type
        ArrayList allItems = new ArrayList();
        allItems.add(2.3);
        allItems.add("Hello world");
        allItems.add(false);
        allItems.add(new Scanner(System.in));
        System.out.println(allItems);

        //declare ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> gpas = new ArrayList<>();
        names.add("St 1");
        names.add("St 2");
        names.add("St 3");
        names.add("St 4");
        names.add("St 5");
        gpas.add(3.5);
        gpas.add(3.6);
        gpas.add(3.7);
        gpas.add(3.8);
        gpas.add(3.9);

        //printing Arraylist - no loop!
        System.out.println(names);
        System.out.println(gpas);

        //printing an element
        //instead of [index] get(index) - set(index)
        System.out.println(names.get(0) + " " + gpas.get(0));
        gpas.set(0, 4.3);
        System.out.println(names.get(0) + " " + gpas.get(0));

        //add a new element in between
        names.add(1, "Mery");
        gpas.add(1, 4.0);
        System.out.println(names);
        System.out.println(gpas);

        //remove a user - remove(Object) / remove(index)
        System.out.println(names.remove("Mery"));
        System.out.println(gpas.remove(1));
        System.out.println(names);
        System.out.println(gpas);

        //number elements
        System.out.println(names.size());

        //remove elements until empty
        names.clear();
        System.out.println(names);

    }
}
