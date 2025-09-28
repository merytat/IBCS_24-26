package UnitP5.StoreItemExercise;

public class StoreItem {
    private String name;
    private double taxRate;
    private double price;

    public StoreItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.taxRate = 0;
    }

    public double getPayablePrice(){
        return price*(1+(taxRate/100));
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "ItemPrice: " + price + "\n" +
                "Tax: " + taxRate + "\n\n" +
                "Payable Price: " + getPayablePrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
