package UnitP3;

public class EvenCoutner {
    public static void main(String[] args) {
        evenCounter(10,20);
    }

    public static void evenCounter(int min, int max) {
        int count = 0;
        for(int i = min; i <= max; i++){
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.println("there are" + count + "even numbers");

    }
}
