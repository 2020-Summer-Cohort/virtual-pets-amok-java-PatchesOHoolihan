package pets_amok;

public class VirtualRoboticDog extends RoboticPet implements Walkable {


    public VirtualRoboticDog(String name, int health, int sadness, int needForOil, String description) {
        super(name, health, sadness, needForOil, description);
    }

    @Override
    public void walk() {
        sadness -= 10;

    }
}
