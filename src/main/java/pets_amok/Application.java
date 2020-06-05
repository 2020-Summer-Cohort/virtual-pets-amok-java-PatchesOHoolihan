package pets_amok;


import java.util.Collection;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        VirtualOrganicDog hambone = new VirtualOrganicDog("Hambone", 20, 20, 20, 20, "Hambone is a goofy dog");
        VirtualRoboticDog sandalphon = new VirtualRoboticDog("Sandalphon", 20, 20, 20, "Sandalphon is a VERY tall robotic dog");
        VirtualRoboticCat ligerZero = new VirtualRoboticCat("Liger Zero", 20, 20, 20, "Liger Zero is a giant robot cat monster");
        VirtualOrganicCat meowth = new VirtualOrganicCat("Meowth", 20, 20, 20, "Meowth is a weird talking cat");
        // write your code here

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

        while (true) {
            printPetStatus(myShelter);
            System.out.println();
            System.out.println("If you would like to feed all the biological pets press 1, \n " +
                    "Press 2 if you'd like to enter a particular pet name to see their status \n" +
                    "Press 3 if you want to walk the dogs \n" +
                    "Press 4 if you want to feed the organic pets \n" +
                    "Press 5 if you'd like to adopt a pet \n" +
                    "Press 6 if you would like to admit a new pet \n" +
                    "Press 7 if you would like to clean the organic dog cages \n" +
                    "Press 8 if you want to oil the robotic pets \n" +
                    "Press 9 if you want to give the cats catnip(Even robot cats love the stuff) \n" +
                    "Press 10 to exit the program");


            userSelection = scanner.nextLine();
            if (userSelection.equals("1")) {
                myShelter.feedOrganicPets();
                System.out.println("You fed everyone who wants to eat");
            } else if (userSelection.equals("2")) {
                System.out.println("Please enter the pet's name");
                String name = scanner.nextLine();
                System.out.println(myShelter.findThisPet(name).getDescription());
            } else if (userSelection.equals("3")) {
                myShelter.walk();
            } else if (userSelection.equals("4")) {
                myShelter.feedOrganicPets();
            } else if (userSelection.equals("5")) {
                System.out.println("Please enter the name of the pet you want to adopt");
                String name = scanner.nextLine();
                myShelter.adoptAPet(name);
                System.out.println("You adopted " + name
                );
            } else if (userSelection.equals("6")) {
                System.out.println("Please provide a name for the pet to admit");
                String name = scanner.nextLine();
                System.out.println("Please provide a quick description");
                String description = scanner.nextLine();
                System.out.println("What kind of pet is it? Press 1 for Organic Dog, 2 for Robotic Dog, 3 for Robotic Cat or 4 for Organic Cat");
                int petType = scanner.nextInt();
                scanner.nextLine();
                if (petType == 1) {
                    myShelter.admit(new VirtualOrganicDog(name, 20, 20, 20, 20, description));
                } else if (petType == 2) {
                    myShelter.admit(new VirtualRoboticDog(name, 20, 20, 20, description));
                } else if (petType == 3) {
                    myShelter.admit(new VirtualRoboticCat(name, 20, 20, 20, description));
                } else if (petType == 4) {
                    myShelter.admit(new VirtualOrganicCat(name, 20, 20, 20, description));
                }
            } else if (userSelection.equals("7")) {
                myShelter.cleanOrganicDogCages();
            } else if (userSelection.equals("8")) {
                myShelter.oilTheRoboticPets();
            } else if (userSelection.equals("9")) {
                myShelter.giveTheCatsCatnip();
            } else if (userSelection.equals("10")) {
                System.out.println("Goodbye");
                System.exit(-1);
            }
            myShelter.tick();
        }


    }

    private static void printPetStatus(VirtualPetShelter shelter) {
        System.out.println("This is the status of your pets: ");

        Collection<VirtualPet> pets = shelter.showAllPets();

        for (VirtualPet pet : pets) {
            if (pet instanceof VirtualOrganicDog) {
                ( (VirtualOrganicDog) pet ).getCageDirtLevel();
                System.out.println(pet.getName() + "\n" +
                        "\tHunger: " + ( (VirtualOrganicDog) pet ).getHunger() +
                        "\tHealth: " + pet.getHealth() +
                        "\tSadness: " + pet.getSadness() +
                        "\tCage Dirt Level: " + ( (VirtualOrganicDog) pet ).getCageDirtLevel());
            }
            if (pet instanceof VirtualOrganicCat) {
                System.out.println(pet.getName() + "\n" +
                        "\tHunger: " + ( (VirtualOrganicCat) pet ).getHunger() +
                        "\tHealth: " + pet.getHealth() +
                        "\tSadness: " + pet.getSadness());
            }
            if (pet instanceof VirtualRoboticDog) {
                ( (VirtualRoboticDog) pet ).getNeedForOil();
                System.out.println(( pet.getName() + "\n" +
                        "\tHealth: " + pet.getHealth() +
                        "\tSadness: " + pet.getSadness() +
                        "\tNeed For Oil: " + ( (VirtualRoboticDog) pet ).getNeedForOil() ));
            }
            if (pet instanceof VirtualRoboticCat) {
                ( (VirtualRoboticCat) pet ).getNeedForOil();
                System.out.println(( pet ).getName() + "\n" +
                        "\tHeatlh: " + pet.getHealth() +
                        "\tSadness: " + pet.getSadness() +
                        "\tNeed For Oil: " + ( (VirtualRoboticCat) pet ).getNeedForOil());
            }
        }
    }
}