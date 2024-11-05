package UnitP2;

public class SchoolItem {
    private String name;
    private double price;
    private String itemId;
    private static int itemCounter = 0;

    //constructors
    public SchoolItem(String name, double price) {
        this.name = name;
        this.price = price;
        itemCounter++;
        itemId = "SRI_0" + itemCounter;

    }

    public SchoolItem(String name) {
        this.name = name;
        this.price = 10;
        itemCounter++;
        itemId = "SRI_0" + itemCounter;
    }


    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public static int totalInvetoryItems() {
        return itemCounter;
    }

    public static void setItemCounter(int itemCounter) {
        SchoolItem.itemCounter = itemCounter;
    }

    //toString

    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price + ", ID Number: "+ itemId;
    }

    //other methods
    public void increasePrice(double percentage){
        price = price*(1+percentage);
    }

    public static void taxAllItems(double percentage){

    }

}
