package UnitP5.Animals;

public class Fish extends Pet {
    private String waterType;

    public Fish(){
        waterType = "Salt";
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }
}
