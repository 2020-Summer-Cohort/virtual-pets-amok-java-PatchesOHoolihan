package pets_amok;

import java.util.ArrayList;
import java.util.Collection;

public class VirtualPetShelter implements Biological, Robotic,Walkable {
    Collection<VirtualPet> pets = new ArrayList<>();

    public void admit(VirtualPet petToAdmit) {
        pets.add(petToAdmit);
    }

    public void adoptAPet(String name){
        pets.remove(name);
    }
    public Collection<VirtualPet> retrieveAllPets() {
        return pets;
    }


    @Override
    public void feedTheBiologicalPets() {
        for (VirtualPet biologicalPet : pets) {
            if (biologicalPet instanceof Biological) {
                ((Biological) biologicalPet).feedTheBiologicalPets();
            }

        }

    }

    @Override
    public void oilTheRoboticPets() {
        for (VirtualPet roboticPet : pets) {
            if (roboticPet instanceof Robotic) {
                ((Robotic) roboticPet).oilTheRoboticPets();
            }
        }
    }

    public void cleanTheBioDogCages() {
            for (VirtualPet bioDog: pets){
                if(bioDog instanceof VirtualBioDog) {
                    ((VirtualBioDog) bioDog).cleanCage();

                }
            }
        }

    public Collection<VirtualPet> showAllPets(){
        return pets;
    }

    @Override
    public void walk() {
        for(VirtualPet dog: pets){
            if(dog instanceof Walkable){
                ((Walkable) dog).walk();

            }
        }
    }

}




