package UnitP5.Exercise;

public class Airplane extends Transportation{
    private double wingSpan;
    private int capacity;

    public Airplane(String name, double ms, double ws, int c){
        super(name,ms);
        wingSpan = ws;
        capacity = c;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
