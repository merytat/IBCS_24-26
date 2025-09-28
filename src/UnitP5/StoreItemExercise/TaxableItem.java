package UnitP5.StoreItemExercise;

public class TaxableItem extends StoreItem{


    public TaxableItem(String name, double price){
        super(name, price);
        setTaxRate(3.5);
    }


}
