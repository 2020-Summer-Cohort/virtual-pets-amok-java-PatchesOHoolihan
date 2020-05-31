package pets_amok;

public class VirtualRoboCat extends VirtualPet implements Robotic {
    private int needForOil;

    public int getNeedForOil() {
        return needForOil;
    }

    public VirtualRoboCat(String name  , int health, int sadness, int needForOil) {
        super(name,health,sadness);
        this.needForOil = needForOil;
    }

//    @Override
//    public int oilTheRobots() {
//        needForOil -= 10;
//        return needForOil;
//    }

    @Override
    public void oilTheRoboticPets() {

    }
}
