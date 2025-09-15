package UnitP5.Exercise;

public class Truck extends Vehicle{
    private double horsePower;

    public Truck(String name, double ms, int now, double hp){
        super(name,ms,now);
        horsePower = hp;
    }

    @Override
    public String honkHorn(){
        return "hunk, hunk";
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }
}
