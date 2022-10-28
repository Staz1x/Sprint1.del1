package sprint1.inlämningar.inlämning1;

//      Subklasserna Cactus, Palm och Carnivorous ärver implementeringen av Info från Plants
//      samt variablerna


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
