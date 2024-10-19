package UnitP2;

public class Rectangle {
    //attributes
    private double length; //no value because this is a template
    private double width;
    private String color;

    //constructor
    public Rectangle(){
        //create rectangles without width and height and color

    }

    public Rectangle(double l, double w, String color){
        length = l;
        width = w;
        this.color = color;

    }

    //methods
    public double calculateArea(){
        return length*width;
    }

    public double calculatePerimeter(){
        return (length+width)*2;
    }

    public void setLength(double l){
        length = l;
    }

    public void setWidth(double w){
        width = w;
    }
}

class RectangleTester {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
    }
}
