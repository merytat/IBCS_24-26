package UnitP5.Animals;

public class LoudDog extends Dog {

    public LoudDog(String name, double size){
        super(name,size);
    }

    @Override
    public String speak(){
        return super.speak().toUpperCase();
    }
}

class LoudDogTester{
    public static void main(String[] args) {
        LoudDog ld1 = new LoudDog("Max",1.5);
        System.out.println(ld1.speak());
    }
}
