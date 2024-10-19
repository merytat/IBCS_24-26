package UnitP2;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(4);
        r1.setWidth(10);
        System.out.println(r1.calculateArea());
        Rectangle r2 = new Rectangle();
        
        Rectangle r3 = new Rectangle(3,5,"Pink");
        System.out.println(r3.calculateArea());
    }
}
