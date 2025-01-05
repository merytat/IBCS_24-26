package UnitP3;

public class Methods {

    public void eggs(int noEggs){
        int dozen = noEggs / 12;
        int extraEggs = noEggs % 12;
        double costPerDozen;
        if(dozen < 4 && dozen >= 0){
            costPerDozen = 0.5;
        }
        else if(dozen >=4 && dozen < 6){
            costPerDozen = 0.45;
        }
        else if(dozen >= 6 && dozen < 11){
            costPerDozen = 0.4;
        }
        else {
            costPerDozen = 0.35;
        }
        double costPerEgg = costPerDozen / 12;
        double total = (dozen * costPerDozen) + (extraEggs * costPerEgg);
        System.out.println("Total cost is: $" + total);
    }

    public void printing(int pages){
        double costCopy;
        if (pages <= 99 && pages > 0){
            costCopy = 0.3;
        }
        else if (pages > 99 && pages <=499){
            costCopy = 0.28;
        }
        else if (pages > 499 && pages <=749){
            costCopy = 0.27;
        }
        else if (pages > 749 && pages <=1000){
            costCopy = 0.26;
        }
        else {
            costCopy = 0.25;
        }
        System.out.println("Cost per copy is: $" + costCopy);
        System.out.println("Total cost is: $" + (pages * costCopy));
    }

    public void packageCheck(double w, double h, double width, double l){

    }
}
