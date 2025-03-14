package UnitP4.NoonExercise;

public class Seller {
    private String name;
    private Product[] products = new Product[100];
    private int count = 0;

    public void addProduct(String id, String cat, double price){
        products[count] = new Product(id,price,cat);
        count++;
    }
}
