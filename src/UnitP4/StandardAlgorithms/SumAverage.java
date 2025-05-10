package UnitP4.StandardAlgorithms;

public class SumAverage {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 6, 10, 2};
        int sum = 0; //initialize a sum variable at 0

        // Traverse the array and compute the sum
        for (int num : numbers) {
            sum += num;
        }

        // Calculate average after looping
        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
