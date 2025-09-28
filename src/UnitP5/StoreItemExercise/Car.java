package UnitP5.StoreItemExercise;

public class Car extends TaxableItem{

    public Car(String name, double price){
        super(name, price);
        if (price>= 100000){
            setTaxRate(35);
        } else if (price >= 30000) {
            setTaxRate(25);
        } else if (price >= 15000) {
            setTaxRate(20);
        }
        else{
            setTaxRate(0);
        }
    }

    @Override
    public String toString(){
        return "Name: " + getName() + "\n" +
                "ItemPrice: " + getPrice() + "\n" +
                "Tax: " + getTaxRate()/100 + "\n" +
                "Discount: " + getDiscount(super.getPayablePrice())/100 + "\n\n" +
                "Payable Price: " + getPayablePrice();
    }

    private double getDiscount(double priceAfterTax){
        if (priceAfterTax >= 100000){
            return 12;
        } else if (priceAfterTax >= 50000) {
            return 10;
        } else if (priceAfterTax >= 20000) {
            return 5;
        }
        else{
            return 0;
        }
    }

    @Override
    public double getPayablePrice(){
        return super.getPayablePrice() - super.getPayablePrice()*(getDiscount(super.getPayablePrice())/100);
    }


}
