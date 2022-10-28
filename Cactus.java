package sprint1.inlämningar.inlämning1;

public class Cactus extends Plants{


    public Cactus(String name, double height) {
        super(name, height);
        super.setPlantType("Kaktus");
    }
    @Override
    public double amount() {
        return 0.02;
    }

    @Override
    public String waterType() {
        return "mineralvatten";
    }


}
