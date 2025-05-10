package UnitP4.StandardAlgorithms;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 6, 10, 8};
        boolean hasDuplicate = false;

        // Compare each element with all elements after it
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    hasDuplicate = true;
                    break; //stop searching
                }
            }
            if (hasDuplicate == true) {
                break; //stop searching if you found one duplicate already
            }
        }

        System.out.println("Has duplicate: " + hasDuplicate);
    }
}
