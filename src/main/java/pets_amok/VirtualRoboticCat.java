package pets_amok;

public class VirtualRoboticCat extends RoboticPet implements LovesCatnip {
    public VirtualRoboticCat(String name, int health, int sadness, int needForOil, String description) {
        super(name, health, sadness, needForOil, description);
    }

    @Override
    public void giveCatnip() {
        sadness -= 20;

    }
}
