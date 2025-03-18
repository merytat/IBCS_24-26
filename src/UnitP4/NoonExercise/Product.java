package UnitP4.NoonExercise;

public class Product {
    private String id;
    private double price;
    private String category;

    public Product(String id, double price, String category) {
        this.id = id;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return id  +"\t\t" + price + "\t\t" + category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
