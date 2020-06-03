package pets_amok;

public class VirtualRoboDog extends VirtualDog implements Robotic,Walkable {
    private int needForOil;

    public VirtualRoboDog(String name, int health, int sadness, int needForOil) {
        super(name,health,sadness);


        this.needForOil = needForOil;
    }

    public int getNeedForOil() {
        return needForOil;
    }

    @Override
    public void oilTheRoboticPets() {
        needForOil -= 10;

    }



}
