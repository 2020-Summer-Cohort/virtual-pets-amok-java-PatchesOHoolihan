package pets_amok;

public class VirtualBioDog extends VirtualDog implements Biological,Walkable{


    private  int cageDirtLevel;
    private int hunger;

    public int getCageDirtLevel() {
        return cageDirtLevel;
    }

    public int getHunger() {
        return hunger;
    }

    public VirtualBioDog(String name , int health, int sadness, int cageDirtLevel, int hunger) {
    super(name,health,sadness);

        this.cageDirtLevel = cageDirtLevel;
        this.hunger = hunger;
    }
    public void cleanCage(){
        cageDirtLevel -=10;
    }

    @Override
    public void feedTheBiologicalPets() {
        hunger -= 10;

    }


}
