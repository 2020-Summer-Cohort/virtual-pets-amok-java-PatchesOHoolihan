package pets_amok;

public abstract class VirtualPet {
    private String name;
    private int health;
    protected int sadness;
    private String description;


    public VirtualPet(String name, int health, int sadness, String description) {
        this.name = name;
        this.health = health;
        this.sadness = sadness;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHealth() {
        return health;
    }

    public int getSadness() {
        return sadness;
    }

    public void tick() {
        sadness += 10;

        if (sadness >= 50) {
            health -= 10;

        }
    }
}
