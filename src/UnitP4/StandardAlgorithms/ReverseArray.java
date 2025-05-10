package UnitP4.StandardAlgorithms;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 6, 10, 2};
        int n = numbers.length;

        // Swap elements from ends toward the center
        for (int i = 0; i < n / 2; i++) { //only need to loop to half the number of elements
            //swap algorithm
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }

        // Output reversed array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
