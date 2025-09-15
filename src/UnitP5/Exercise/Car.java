package UnitP5.Exercise;

public class Car extends Vehicle{
    private int noOfDoors;

    public Car(String name, double ms, int now, int nod){
        super(name,ms,now);
        noOfDoors = nod;
    }

    @Override
    public String honkHorn(){
        return "beep, beep";
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }
}
