package pets_amok;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class VirtualDogTest {

    @Test
    public void createVirtualDogClass(){
    VirtualPet underTest = new VirtualDog("Fido",20,20);
    }
    @Test
    public void dogsShouldWantToWalk(){
        VirtualDog underTest = new VirtualDog("Fido",20,20);
        underTest.walk();
        int result = underTest.getSadness();
        assertEquals(10,result);
}
}
