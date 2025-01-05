package UnitP3;

import java.util.Scanner;

public class RaterTester {
    public static void main(String[] args) {

        Rater spaceX = new Rater("Space X", 5, "Cool Company");
        Rater nike = new Rater("Nike");
        Rater KFC = new Rater();

        System.out.println(nike);
        System.out.println(spaceX);
        System.out.println(KFC);

        nike.setCompanyName("Adidas");
        //KFC.setRating(3);

        System.out.println(nike);
        System.out.println(spaceX);
        System.out.println(KFC);

        //set a rating for KFC
        KFC.setRating(2);
        System.out.println(KFC);

       checkRatings(nike);
       checkRatings(KFC);
       checkRatings(spaceX);

    }

    public static void checkRatings(Rater r){
        Scanner kb = new Scanner(System.in);

        if (r.getRating() == 0){
            System.out.println("Enter a rating for Nike: ");
            r.setRating(kb.nextInt());
            System.out.println(r);
        }
        else if(r.getRating() < 3){
            System.out.println(r);
            System.out.println("Please improve your service");
        }
        else if(r.getRating() >= 3){
            System.out.println(r);
            System.out.println("Congratulations");
        }
        else{
            r.setRating(5);
            System.out.println(r);
        }
    }


}
