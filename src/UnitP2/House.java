package UnitP2;

public class House {
    //attributes
    private String address;
    private int noRooms;

    //methods
    //accessor and mutators (getters and setters)
    //Encapsulation
    // protect data - control how attributes are read and written

    //getters - accessors: public, return (have a type), no params
    public String getAddress(){
        return address;
    }

    public int getNoRooms(){
        return noRooms;
    }

    //setter - mutator: always public, void, param
    public void setAddress(String address){
        this.address = address;
    }

    public void setNoRooms(int nr){
        this.noRooms = nr;
    }

    //Other methods: CREATIVE TASK - YOU DESIGN THEM
    // addRoof: paint a roof for my house
    // @Return
    // @param
    public void addRoof(){
        System.out.println("   / \\");
        System.out.println("  /   \\");
        System.out.println(" /     \\");
        System.out.println("/_______\\");
    }

    // addBase: draw the base for my house
    // @Return string with the drawing of a square
    public String addBase(){
        return    " _____ " +
                "\n |    |" +
                "\n |    |" +
                "\n |    |" +
                "\n  _____ ";
    }



    //Constructor: special method
    // name is EXACTLY the same as the class
    // always public
    // no return / no void
    public House(String address, int noRooms){
        this.address = address;
        this.noRooms = noRooms;
    }

    //default constructor - hard coded default values for attributes
    public House(){
        this.address = "";
        this.noRooms = 0;
    }

    //toString
    public String toString(){

        return address + " Rooms: " + noRooms;
    }

}
