package sprint1.inlämningar.inlämning1;

public class Palm extends Plants{

    public Palm(String name, double height) {
        super(name, height);
        super.setPlantType("Palm");
    }
    @Override
    public double amount() {
        return 0.5*getHeight();
    }
    @Override
    public String waterType() {
        return "kranvatten";
    }

}
