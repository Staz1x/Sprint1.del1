package sprint1.inlämningar.inlämning1;


//      Klassen implementerar interfacet Info som hämtar information om de olika växterna
//      Klassen innehåller privata variabler(inkapsling) som används i subklasserna
//      Variablerna har också olika värden beroende på subklassen (polymorfism)


abstract public class Plants implements Info{

    private String name;        //Inkaplsade variabler
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
