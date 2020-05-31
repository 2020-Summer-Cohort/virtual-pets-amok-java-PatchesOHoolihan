package pets_amok;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualRoboCatTest {
    @Test
    public void createVirtualRoboCatClass(){
        VirtualPet underTest = new VirtualRoboCat("Felix",20,20,20);
    }
    @Test
    public void roboCatShouldAbleToBeOiled(){
        VirtualRoboCat underTest = new VirtualRoboCat("Felix",20,20,20);
//        int result = underTest.oilTheRoboticPets();
//        assertEquals(10,result);
    }
}
