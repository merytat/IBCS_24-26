package UnitP5;

public class Dog extends Pet {
    private boolean trained;

    public Dog(String name, double size){
        super(name); //start with a call to constructor of super class
        this.trained = true;
    }

    @Override
    public String speak(){
        return "woof";
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }
}

class DogRunner{
    public static void main(String[] args) {
        Dog d1 = new Dog("Tina", 2.5);
        System.out.println(d1.getName());
    }
}
