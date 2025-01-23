package UnitP3;

import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //loop: control variable
        int grade = 1;
        //counter: initialize counter
        int counter = 0;
        //accum: initialize accum
        int total = 0;

        //loop: conditional
        while (grade > 0) {
            //loop: change CV (read input)
            System.out.print("Enter grade 0 to exit: ");
            grade = kb.nextInt();
            //counter: increase
            counter++;
            //accum: add the input
            total += grade;
        }
        //counter & accum: use to calc av
        counter--;
        double average = (double)total / counter;
        System.out.println("Your average is: " + average);

    }
}
