package pets_amok;

public  class VirtualDog extends VirtualPet {




    public VirtualDog(String name, int health, int sadness) {
        super(name, health, sadness);

    }
        public void walk () {
            sadness -= 10;
        }

}
