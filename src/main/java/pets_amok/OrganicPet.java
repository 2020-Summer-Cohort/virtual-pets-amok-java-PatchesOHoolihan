package pets_amok;

public abstract class OrganicPet extends VirtualPet {

    public int getHunger() {
        return hunger;
    }

    public int hunger;

    public OrganicPet(String name, int health, int sadness, int hunger, String description) {
        super(name, health, sadness, description);
        this.hunger = hunger;
    }

    public void feedTheOrganicPets() {
        hunger -= 20;
    }

    @Override
    public void tick() {
        super.tick();
        hunger += 10;

    }
}
