package UnitP4.StandardAlgorithms;

public class SearchAll {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 6, 10, 2};
        boolean allEven = true;

        // Check if all numbers are even
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                allEven = false;
                break;
            }
        }

        System.out.println("All numbers are even: " + allEven);
    }
}
