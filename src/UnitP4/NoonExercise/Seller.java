package UnitP4.NoonExercise;

public class Seller {
    private String name;
    private Product[] products = new Product[100];
    //this program keeps an organized list of products
    //everytime an object is removed the list will be kept clean of nulls
    private int count = 0;

    public Seller(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getCount(){
        return count;
    }

    /**
     * Adds a new produc to the seller's list
     * @param id
     * @param cat
     * @param price values of the product to be added
     */
    public void addProduct(String id, String cat, double price){
        products[count] = new Product(id,price,cat);
        count++;
    }

    /**
     *
     * @return the full list of products from the seller
     */
    public Product[] getProducts(){
        return products;
    }

    /**
     * This method finds a product with id id, and replaces it with the
     * product other
     * @param id id of the product to be replaced
     * @param other new product to replace the old one
     */
    public void replaceProduct(String id, Product other){
        for(int i = 0; i<count; i++){
            if (products[i].getId().equals(id)) {
                products[i]=other;
                i = count; //stop the loop
            }
        }
    }

    /**
     * This method removes the product with the given id from the list.
     * The method reorganizes the list to make sure to keep no null
     * values in between
     * @param id - id of product to be removed
     */
    public void removeProduct(String id){
        for(int i = 0; i<count; i++){
            if(products[i].getId().equals(id)){
                for(int j=i; j<count-1; j++){ //move all values to the left
                    products[j] = products[j+1];
                }
                products[count]=null; //override last value to null
                count--;  //decrease count of values
                // i=count; //stop the loop
            }

        }
    }

    /**
     * Prints a list of current products for the seller.
     */
    public void showProducts(){
        System.out.println("ID \t\t PRICE \t\t CATEGORY");
        for(int i = 0; i<count; i++){
            System.out.println(products[i]);
        }
    }

    /**
     * Sorts products by ID using bubble sort
     */
    public void sortById(){
        for(int i = 0; i < count; i++){
            for(int j = 1; j< count-i; j++){
                if(products[j-1].getId().compareTo(products[j].getId()) > 0){
                    Product temp = products[j-1];
                    products[j-1] = products[j];
                    products[j] = temp;
                }
            }
        }
    }

    /**
     *
     * @param cat category whose average will be calculated
     * @return Return the average cost of the products within a given category
     */
    public double avPrice(String cat){
        double average = 0;
        int countCat = 0;
        for(int i = 0; i <count; i++){
            if(products[i].getCategory().equals(cat)){
                average = average + products[i].getPrice();
                countCat++;
            }
        }
        if(countCat>0){
            average = average/countCat;
            return average;
        }
        return -1;
    }



}
