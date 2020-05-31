package pets_amok;

public abstract class VirtualPet {
    private String name;
    private int health;
    protected int sadness;
    public VirtualPet(String name, int health, int sadness) {
        this.name = name;
        this.health = health;
        this.sadness = sadness;
    }
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getSadness() {
        return sadness;
    }
}
