package UnitP5.Animals;

import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> pets = new ArrayList<>();

    public void add(Pet newPet){
        pets.add(newPet);
    }

    public void allSpeak(){
        for (Pet p:pets){
            System.out.println(p.speak());
        }
    }
}
class KennelRunner{
    public static void main(String[] args) {
        Kennel k1 = new Kennel();
        Pet p1 = new Pet("Pet1");
        k1.add(p1);
        Dog d1 = new Dog("Doggie",3.5);
        k1.add(d1);
        LoudDog ld1 = new LoudDog("Firulais", 7.5);
        k1.add(ld1);
        k1.allSpeak();
    }
}
