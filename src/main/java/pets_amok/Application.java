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

        while(true){
            printPetStatus(myShelter);
            System.out.println();
            System.out.println("If you would like to feed all the biological pets press 1, \n " +
                    "Press 2 if you'd like to enter a particular pet name to see their status ");






        userSelection = scanner.nextLine();
        if(userSelection.equals("1")){
            myShelter.feedTheBiologicalPets();
            System.out.println("You fed everyone who wants to eat");
        }
        else if(userSelection.equals("2")){
            System.out.println("Please enter the pet's name");
            String petName = scanner.nextLine();
            System.out.println(myShelter);
        }
        }
    }

    private static void printPetStatus(VirtualPetShelter shelter) {
        System.out.println("This is the status of your pets: ");

        Collection<VirtualPet> pets = shelter.showAllPets();

        for (VirtualPet pet : pets) {
            if (pet instanceof VirtualBioDog) {
                ( (VirtualBioDog) pet ).getCageDirtLevel();
                System.out.println(pet.getName() + "\n" +
                        "\tHunger: " + ( (VirtualBioDog) pet ).getHunger() +
                        "\tHealth: " + pet.getHealth() +
                        "\tSadness: " + pet.getSadness() +
                        "\tCage Dirt Level: " + ( (VirtualBioDog) pet ).getCageDirtLevel());
            }
            if (pet instanceof VirtualBioCat) {
                System.out.println(pet.getName() + "\n" +
                        "\tHunger: " +( (VirtualBioCat) pet ).getHunger() +
                        "\tHealth: " + pet.getHealth() +
                        "\tSadness: " + pet.getSadness());
            }
                if (pet instanceof VirtualRoboDog) {
                    ( (VirtualRoboDog) pet ).getNeedForOil();
                    System.out.println(( pet.getName() + "\n" +
                            "\tHealth: " + pet.getHealth() +
                            "\tSadness: " + pet.getSadness() +
                            "\tNeed For Oil: " + ( (VirtualRoboDog) pet ).getNeedForOil() ));
                }
                if (pet instanceof VirtualRoboCat) {
                    ( (VirtualRoboCat) pet ).getNeedForOil();
                    System.out.println(( pet ).getName() + "\n" +
                            "\tHeatlh: " + pet.getHealth() +
                            "\tSadness: " + pet.getSadness() +
                            "\tNeed For Oil: " + ( (VirtualRoboCat) pet ).getNeedForOil());
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