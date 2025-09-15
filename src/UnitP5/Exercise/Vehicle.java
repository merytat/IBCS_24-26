package UnitP5.Exercise;

public class Vehicle extends Transportation{
    private int NoOfWheels;

    public Vehicle(String name, double ms, int now){
        super(name, ms);
        NoOfWheels = now;
    }

    public String honkHorn(){
        return "";
    }

    public int getNoOfWheels() {
        return NoOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        NoOfWheels = noOfWheels;
    }
}
