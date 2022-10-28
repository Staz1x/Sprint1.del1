package sprint1.inlämningar.inlämning1;

abstract public class Plants implements Info{

    private String name;
    private double height;
    private String plantType;

    public Plants(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public String getPlantType() {
        return plantType;
    }
    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }


}
