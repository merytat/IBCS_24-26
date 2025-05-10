package UnitH2;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }

    public static int fibonacci(int n){

        if(n <= 1){
            return n; //base case
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
