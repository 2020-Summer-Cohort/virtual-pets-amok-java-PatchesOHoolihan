package pets_amok;

import java.util.ArrayList;
import java.util.Collection;

public class VirtualPetShelter implements Biological, Robotic {
    Collection<VirtualPet> pets = new ArrayList<>();

    public void admit(VirtualPet petToAdmit) {
        pets.add(petToAdmit);
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

        }




