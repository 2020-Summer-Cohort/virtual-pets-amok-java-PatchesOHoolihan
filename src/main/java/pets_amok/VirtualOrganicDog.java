package pets_amok;

public class VirtualOrganicDog extends OrganicPet implements Walkable {


    private int cageDirtLevel;


    public VirtualOrganicDog(String name, int health, int sadness, int hunger, int cageDirtLevel, String description) {
        super(name, health, sadness, hunger, description);

        this.cageDirtLevel = cageDirtLevel;
    }


    public int getCageDirtLevel() {
        return cageDirtLevel;
    }


    @Override
    public void walk() {
        sadness -= 20;

    }

    public void cleanOrganicDogCages() {
        cageDirtLevel -= 20;
    }

    @Override
    public void tick() {
        super.tick();
        cageDirtLevel = +10;
    }
}

