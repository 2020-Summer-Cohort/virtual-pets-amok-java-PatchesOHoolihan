package pets_amok;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class VirtualPetShelter implements Walkable {
    Map<String, VirtualPet> pets = new HashMap<>();

    public void admit(VirtualPet petToAdmit) {

        pets.put(petToAdmit.getName(), petToAdmit);
    }

    public void adoptAPet(String name) {
        pets.remove(name);
    }

    public void feedOrganicPets() {
        for (VirtualPet organicPet : pets.values()) {
            if (organicPet instanceof OrganicPet) {
                ( (OrganicPet) organicPet ).feedTheOrganicPets();
            }
        }
    }

    public void giveTheCatsCatnip() {
        for (VirtualPet cat : pets.values()) {
            if (cat instanceof VirtualRoboticCat) {
                ( (VirtualRoboticCat) cat ).giveCatnip();
            } else if (cat instanceof VirtualOrganicCat) {
                ( (VirtualOrganicCat) cat ).giveCatnip();
            }
        }
    }

    public void cleanOrganicDogCages() {
        for (VirtualPet organicDog : pets.values()) {
            if (organicDog instanceof VirtualOrganicDog) {
                ( (VirtualOrganicDog) organicDog ).cleanOrganicDogCages();
            }
        }

    }

    public void oilTheRoboticPets() {
        for (VirtualPet roboticPet : pets.values()) {
            if (roboticPet instanceof RoboticPet) {
                ( (RoboticPet) roboticPet ).oilTheRoboticPets();
            }
        }
    }

    public VirtualPet findThisPet(String name) {
        return pets.get(name);

    }

    public Collection<VirtualPet> showAllPets() {
        return pets.values();
    }

    @Override
    public void walk() {
        for (VirtualPet dog : pets.values()) {
            if (dog instanceof Walkable) {
                ( (Walkable) dog ).walk();

            }
        }
    }

    public void tick() {
        for (VirtualPet pet : pets.values())
            pet.tick();
    }

}

