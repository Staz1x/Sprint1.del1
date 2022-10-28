package sprint1.inlämningar.inlämning1;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Greenest {

    List<Plants> allPlants = new ArrayList<>();

    public Greenest() {

        allPlants.add(new Cactus("Igge", 0.2));
        allPlants.add(new Palm("Laura", 5));
        allPlants.add(new Palm("Putte", 1));
        allPlants.add(new Carnivorous("Meatloaf", 0.7));


        while (true) {
            String mess = "Dessa växter finns på hotellet: \n";

            for (Plants p : allPlants) {
                mess = mess + p.getPlantType() +"en "+ p.getName() + " som är " + p.getHeight() + " meter\n";
                //olika värden beroende på växt
            }
            mess = mess + "Vilken planta ska vattnas?\n";
            String input = JOptionPane.showInputDialog(null, mess);

            if(input == null)
                System.exit(0);
            input = input.toLowerCase();

            boolean findPlant = false;

            for(Plants p : allPlants) {
                if(p.getName().toLowerCase().equals(input)) {
                    JOptionPane.showMessageDialog(null, GetInfo.showInfo(p));
                    findPlant = true;
                }
            }
            if(!findPlant) {
                JOptionPane.showMessageDialog(null, "Hittar ingen växt med namnet "+input);
            }
        }
    }

    public static void main(String[] args) {
        Greenest g = new Greenest();
    }
}
