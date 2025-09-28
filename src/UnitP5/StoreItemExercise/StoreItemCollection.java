package UnitP5.StoreItemExercise;

import java.util.ArrayList;

public class StoreItemCollection {
    private ArrayList<StoreItem> itemsList = new ArrayList<>();

    public ArrayList<StoreItem> getItemsList() {
        return itemsList;
    }

    public void setItemsList(ArrayList<StoreItem> itemsList) {
        this.itemsList = itemsList;
    }

    public void addItem(StoreItem item){
        itemsList.add(item);
    }

    public void removeItem(String name){
        for(StoreItem si: itemsList){
            if(si.getName().equals(name)){
                itemsList.remove(si);
            }
        }
    }

    public void printItems(){
        System.out.println("Name \t\t\t Price \t Tax \t Payable Price \t\t Discount \t Class");
        for(StoreItem si: itemsList){
            System.out.print(si.getName() + " \t\t " +
                    si.getPrice() + "\t" +
                    si.getTaxRate() + "\t" +
                    si.getPayablePrice() + "\t\t" +
                    si.getTaxRate()/100 + "\t");
            if(si instanceof NonTaxableItem){
                System.out.print(((NonTaxableItem) si).getClassification());
            }
            System.out.println();
        }
    }
}
