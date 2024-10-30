package UnitP2;

public class Trail {
    //attributes
    private String name;
    private double pointA;
    private double pointB;
    private static int trailCounter = 0;
    private static double totalDistance = 0;
    private static String warning;

    //constructor
    public Trail(String n , double pa, double pb){
        this.name = n;
        this.pointA = pa;
        this.pointB = pb;
        trailCounter++;
        totalDistance += getDistance();
    }

    public Trail(){
        this.name = "Magnolia";
        this.pointB = 150;
        this.pointA = 0;
        trailCounter++;
        totalDistance += getDistance();
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

    public double getDistance(){
        return pointB-pointA;
    }

    public double getMidPoint(){
        return (pointB+pointA)/2;
    }

    public double getRandomPoint(){
        System.out.println(pointA);
        return (Math.random()*(pointB-pointA))+pointA;
    }

    public static int getTrailCount(){
        return trailCounter;
    }

    public static double getDistanceOfTrails(){
        return totalDistance;
    }

    public static double averageDistanceOfTrails(){
        return totalDistance/trailCounter;
    }

    public static void sendWarning(String message){
        warning = "WARNING: " + message + "!";
    }

    public String getWarning(){
        return warning;
    }

    //toString to print an object
    public String toString(){
        String result = "Trail #" + trailCounter + "\n";
        result = result + "Name: " + name + "\n";
        result += "TrailID: " + generateID() + "\n";
        result += "PointA: " + pointA + "\n";
        result += "PointB: " + pointB + "\n";
        result += "Trail Distance: " + getDistance();
        return result;
//        Trail #1
//        Name: Mahogany
//        TrailID: MY-A1
//        PointA: 150.5
//        PointB: 300.5
//        Trail Distance: 150.0

    }
}
