package UnitP3;

public class ToThePower {
    public static void main(String[] args) {
       toThePower();
    }

    //print the powers from 1-7
    public static void toThePower() {
        for(int i = 1; i < 8; i++){
            System.out.println(i + " = " + Math.pow(i,i));
        }

    }
}
