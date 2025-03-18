package UnitP4.NoonExercise;

public class Noon {
    private Seller[] sellers;
    private int count = 0;

    public Noon(int size){
        sellers = new Seller[size];
    }

    /**
     * Search for a product with certain ID within all the sellers available
     * @param id - id looked for
     * @return - Product found.
     */
    public Product search(String id){
        Product result = null;
        for(int i =0; i < count; i++){
            for(Product p: sellers[i].getProducts()){
                if(p!=null && p.getId().equals(id)){
                    result = p;//write getProducts
                }
            }
        }
        return result;
    }

    /**
     * Add a new Seller to the list
     * @param sNew - new Seller to be added
     */
    public void addSeller(Seller sNew){
        if(count<sellers.length){
            sellers[count] = sNew;
            count++;
        }
    }

    /**
     *
     * @param cat - category being search for lowest average
     * @return the Seller object with the lowest average for category cat
     */
    public Seller findSellerLowerAvPrice(String cat){
        Seller min = null; //start with a null minimum (in case none has products)
        double minAv = (double)Integer.MAX_VALUE; //start with largest int value possible
        for(Seller s: sellers){
            if(s!=null){
                double avPrice = s.avPrice(cat); //calculate for each seller
                if(avPrice!= -1 && avPrice<minAv){
                    minAv = avPrice;
                    min = s;
                }
            }

        }
        return min;
    }

    /**
     *
     * @param min
     * @param max
     * @return an array of all products in all sellers within a range
     */
    public Product[] getAllProductsInRange(double min, double max){
        Product[] inRange = new Product[count*100];
        int index = 0;
        for(Seller s: sellers){
            if(s!= null){
                for(int i = 0; i<s.getCount(); i++){
                    if(s.getProducts()[i].getPrice() > min && s.getProducts()[i].getPrice() < max){
                        inRange[index] = s.getProducts()[i];
                        index++;
                    }
                }
            }
        }
        return inRange;
    }


}
