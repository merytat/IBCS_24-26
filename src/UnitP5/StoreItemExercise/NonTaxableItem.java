package UnitP5.StoreItemExercise;

public class NonTaxableItem extends StoreItem{
    private String classification;

    public NonTaxableItem(String name, double price, String c){
        super(name,price);
        setTaxRate(0);
        this.classification = c;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                "ItemPrice: " + getPrice() + "\n" +
                "Tax: " + getTaxRate()/100 + "\n" +
                "Classification: " + classification + "\n\n" +
                "Payable Price: " + getPayablePrice();
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
}
