package UnitP4.POS;

public class Cart {
    private int id;
    private double totalItems;

    public Cart(int id, double totalItems) {
        this.id = id;
        this.totalItems = totalItems;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", totalItems=" + totalItems +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(double totalItems) {
        this.totalItems = totalItems;
    }
}
