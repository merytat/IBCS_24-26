package UnitP4.NoonExercise;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Noon n = new Noon(200);
        Seller s1 = new Seller("Super Store");
        n.addSeller(s1);

        Product p1 = new Product("1001", 200, "Clothing");
        s1.addProduct("1002","Food",30);
        s1.addProduct("1005","Food",30);
        s1.addProduct("1003","Food",30);
        s1.addProduct("1006","Food",30);
        s1.addProduct("1004","Clothing",30);
        s1.showProducts();

        s1.sortById();
        System.out.println();
        System.out.println("After sorting");
        s1.showProducts();

        s1.replaceProduct("1002",p1);
        System.out.println();
        System.out.println("After replacing 1002");
        s1.showProducts();

        s1.removeProduct("1003");
        System.out.println();
        System.out.println("After removing 1003");
        s1.showProducts();

        s1.addProduct("1007", "Books", 34);
        System.out.println();
        System.out.println("After adding 1007");
        s1.showProducts();

        System.out.println();
        System.out.println("The average cost of clothing for Seller 1 is: " + s1.avPrice("Clothing"));

        Seller s2 = new Seller("Other store");
        s2.addProduct("O1001", "Food", 500);
        n.addSeller(s2);
        System.out.println();
        System.out.println("The seller with the lowest average in Food is: " + n.findSellerLowerAvPrice("Food").getName());

        System.out.println("");
        System.out.println("Enter ID of product you are looking for: ");
        String id = kb.nextLine();
        Product found = n.search(id);
        if(found!=null){
            System.out.println(found);
        }
        else{
            System.out.println("Product not found");
        }

        System.out.println();
        System.out.println("Enter the min price you want: ");
        double min = kb.nextDouble();
        System.out.println("Enter the max price you want: ");
        double max = kb.nextDouble();
        Product[] inRange = n.getAllProductsInRange(min,max);
        for(Product p:inRange){
            if(p!=null){
                System.out.println(p);
            }
        }

    }
}
