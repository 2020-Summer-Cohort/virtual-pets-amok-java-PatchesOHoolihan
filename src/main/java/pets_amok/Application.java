package pets_amok;

import java.util.Collection;
import java.util.Scanner;

public class Application implements Biological, Robotic {
    public static void main(String[] args) {
        VirtualBioDog hambone = new VirtualBioDog("Hambone", 20, 20, 20, 20);
        VirtualRoboDog sandalphon = new VirtualRoboDog("Sandalphon", 20, 20, 20);
        VirtualRoboCat ligerZero = new VirtualRoboCat("Liger Zero", 20, 20, 20);
        VirtualBioCat meowth = new VirtualBioCat("Meowth", 20, 20, 20);

        VirtualPetShelter myShelter = new VirtualPetShelter();

        myShelter.admit(hambone);
        myShelter.admit(sandalphon);
        myShelter.admit(ligerZero);
        myShelter.admit(meowth);

        System.out.println("Welcome to Patches' Pet Shelter Run Amok");
        System.out.println("As the new vet-tech it is your job to care for the pets as well as handle adoptions and intakes");
        System.out.println();


        Scanner scanner = new Scanner(System.in);
        String userSelection;
        printPetStatus(myShelter);


    }

    private static void printPetStatus(VirtualPetShelter shelter) {
        System.out.println("This is the status of your pets: ");


        Collection<VirtualPet> pets = shelter.showAllPets();


        for (VirtualPet bioDog : pets)
            if (bioDog instanceof VirtualBioDog) {
                ( (VirtualBioDog) bioDog ).getCageDirtLevel();
                System.out.println(bioDog.getName() + "\n" +
                        "\tHealth: " + bioDog.getHealth() +
                        "\tSadness: " + bioDog.getSadness() +
                        "\tCage Dirt Level: " + ( (VirtualBioDog) bioDog ).getCageDirtLevel());
                for (VirtualPet bioCat : pets)
                    if (bioCat instanceof VirtualBioCat) {
                        System.out.println(bioCat.getName() + "\n" +
                                "\tHealth: " + bioCat.getHealth() +
                                "\tSadness: " + bioCat.getSadness());


                        for (VirtualPet roboticDog : pets)
                            if (roboticDog instanceof VirtualRoboDog) {
                                ( (VirtualRoboDog) roboticDog ).getNeedForOil();
                                System.out.println(( roboticDog.getName() + "\n" +
                                        "\tHealth: " + roboticDog.getHealth() +
                                        "\tSadness: " + roboticDog.getSadness() +
                                        "\tNeed For Oil: " + ( (VirtualRoboDog) roboticDog ).getNeedForOil() ));


                            }
                        for (VirtualPet roboticCat : pets)
                            if (roboticCat instanceof VirtualRoboCat) {
                                ( (VirtualRoboCat) roboticCat ).getNeedForOil();
                                System.out.println(( roboticCat ).getName() + "\n" +
                                        "\tHeatlh: " + roboticCat.getHealth() +
                                        "\tSadness: " + roboticCat.getSadness() +
                                        "\tNeed For Oil: " + ( (VirtualRoboCat) roboticCat ).getNeedForOil());


                            }
                    }


            }
    }
    @Override
    public void feedTheBiologicalPets ( ) {

    }

    @Override
    public void oilTheRoboticPets ( ) {

    }
}