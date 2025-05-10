package UnitP4.StandardAlgorithms;

public class ConsecutivePairs {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 6, 10, 2};

        // Print each pair of consecutive elements
        for (int i = 0; i < numbers.length - 1; i++) { //always length-1 so you don't get out of bunds when doing i+1
            System.out.println("Pair: " + numbers[i] + ", " + numbers[i + 1]);
        }
    }
}
