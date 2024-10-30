package UnitP2;

public class Trail {
    //attributes
    private String name;
    private double pointA;
    private double pointB;
    private static int trailCounter = 0;

    //constructor
    public Trail(String n , double pa, double pb){
        this.name = n;
        this.pointA = pa;
        this.pointB = pb;
        trailCounter++;
    }

    //create an ID
    private String generateID(){
        String id = "";
        String firstLetter = name.substring(0,1);
        char lastLetter = name.charAt(name.length()-1);
        int ranIndex = (int)(Math.random()*name.length()-1);
        char ranLetter = name.charAt(ranIndex);
        //String ranLetter = name.substring(ranIndex,ranIndex-1);
        id = firstLetter + lastLetter + "-" + ranLetter + trailCounter;
        return id.toUpperCase();
    }

    //toString to print an object
    public String toString(){
        String result = "Trail #" + trailCounter + "\n";
        result = result + "Name: " + name + "\n";
        return result;
//        Trail #1
//        Name: Mahogany
//        TrailID: MY-A1
//        PointA: 150.5
//        PointB: 300.5
//        Trail Distance: 150.0

    }
}
