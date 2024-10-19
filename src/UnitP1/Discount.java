package UnitP1;

public class Discount {
    public static void main(String[] args) {
        int noOfItems = 10;
        double price = 12.3;
        int discount = 2;
        double total = (noOfItems*price) * (1 - discount/100.0);

        System.out.println("Number of Items: " + noOfItems);
        System.out.println("Price of item: " + price);
        System.out.println("Discount %: " + discount);
        System.out.println("Total price: " + total);
    }
}
