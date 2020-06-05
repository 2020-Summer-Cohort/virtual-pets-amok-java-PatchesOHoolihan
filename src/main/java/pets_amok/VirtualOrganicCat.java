package pets_amok;

public class VirtualOrganicCat extends OrganicPet implements LovesCatnip {
    public VirtualOrganicCat(String name, int health, int sadness, int hunger, String description) {
        super(name, health, sadness, hunger, description);
    }

    @Override
    public void giveCatnip() {
        sadness -= 20;
    }
}
