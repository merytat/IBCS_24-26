package UnitP4.StandardAlgorithms;

public class ShiftLeftRight {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 6, 10, 2};

        // Shift right: move all elements one position right starting with the second to last
        int last = numbers[numbers.length - 1]; //save the last value in the array in temp var

        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = last; // wrap around last element

        // Print shifted array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();


        // Shift left: move all elements one position right starting with the second
        int first = numbers[0]; //save the first value in the array in temp var

        for (int i = 0; i < numbers.length-1; i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers[numbers.length-1] = first; // wrap around first element

        // Print shifted array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
