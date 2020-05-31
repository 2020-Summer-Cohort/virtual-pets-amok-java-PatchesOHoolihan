package pets_amok;

public class VirtualBioCat extends VirtualCat implements Biological{

        private int hunger;

    public VirtualBioCat(String name, int health, int sadness,int hunger) {
        super(name, health, sadness);
        this.hunger = hunger;
    }

    public int getHunger() {
        return hunger;
    }

    @Override
    public void feedTheBiologicalPets() {

    }
}
