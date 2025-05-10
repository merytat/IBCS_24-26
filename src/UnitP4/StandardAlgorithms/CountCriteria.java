package UnitP4.StandardAlgorithms;

public class CountCriteria {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 6, 10, 2};
        int count = 0; //initialize a counter before looping

        // Count numbers greater than 5
        for (int num : numbers) {
            if (num > 5) {
                count++;
            }
        }

        System.out.println("Count > 5: " + count); //print/use the counter only after loop is done
    }
}
