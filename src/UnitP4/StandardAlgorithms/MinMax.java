package UnitP4.StandardAlgorithms;

public class MinMax {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 6, 10, 2};
        int min = numbers[0]; //initialize min assuming the min is at position 0
        int max = numbers[0];

        // Traverse and update min and max
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
