package pets_amok;

public abstract class RoboticPet extends VirtualPet {


    private int needForOil;

    public RoboticPet(String name, int health, int sadness, int needForOil, String description) {
        super(name, health, sadness, description);
        this.needForOil = needForOil;


    }

    public int getNeedForOil() {
        return needForOil;
    }


    public void oilTheRoboticPets() {
        needForOil -= 20;
    }

    @Override
    public void tick() {
        super.tick();
        needForOil = +10;
    }
}