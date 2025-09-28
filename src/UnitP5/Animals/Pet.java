package UnitP5.Animals;

public class Pet extends Animal {
    private String name;
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
        this.name = "Firulais";
    }

    public String speak(){
        return "I am a Pet";
    }
}
