package pets_amok;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class VirtualPetShelterTest {
    @Test
    public void virtualPetShelterShouldInstantiate(){
        VirtualPetShelter underTest = new VirtualPetShelter();
    }
    @Test
    public void shouldBeAbleToAdmitADog(){
        VirtualPet testDog = new VirtualDog("Bob",20,20);
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admit(testDog);
        Collection<VirtualPet> pets = underTest.retrieveAllPets();
        assertThat(pets).containsOnlyOnce(testDog);
    }
    @Test
    public void shouldBeAbleToAdmitACat(){
        VirtualPet testCat = new VirtualCat("Bob",20,20);
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admit(testCat);
        Collection<VirtualPet> pets = underTest.retrieveAllPets();
        assertThat(pets).containsOnlyOnce(testCat);
    }
//    @Test
//    public void shouldBeAbleToFeedAllBioDogs(){
//        VirtualBioDog testBioDog = new VirtualBioDog("Bob",20,20,20,20);
//        VirtualPetShelter underTest = new VirtualPetShelter();
//        underTest.admit(testBioDog);
//        underTest.feedAllBio

    }

