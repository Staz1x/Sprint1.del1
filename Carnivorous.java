package sprint1.inlämningar.inlämning1;

public class Carnivorous extends Plants{

    public Carnivorous(String name, double height) {
        super(name, height);
        super.setPlantType("Köttätande växt");
    }
    @Override
    public double amount() {
        return 0.1+(0.2*getHeight());
    }
    @Override
    public String waterType() {
        return "proteindryck";
    }
}
