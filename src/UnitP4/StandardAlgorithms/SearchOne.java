package UnitP4.StandardAlgorithms;

public class SearchOne {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 6, 10, 2};
        boolean found = false; //store if found or not
        int loc = -1; //store the result of the index where found

        // Look for an even number greater than 9
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] > 9) {
                found = true;
                loc = i;
                i = numbers.length; //to stop the loop once the value is found (break is an alternative)
            }
        }

        System.out.println("Found even number > 9: " + found);
        if(found){
            System.out.println("Number found at position: " + loc);
        }
    }
}
