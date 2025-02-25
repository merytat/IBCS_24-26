package UnitP4;

public class QuickCheck1 {
    public static void main(String[] args) {
        //1.declare array of empty string
        String[] names = new String[5];
        //2. Add your name on 2 and a friend's on 4
        names[1] = "Mery";
        names[3] = "Sajjad";

        //3. Print the last element
        System.out.println(names[names.length-1]);

        //4. Print every other element
        for(int i = 1; i<names.length; i+=2){
            System.out.println(names[i]);
        }
    }
}
