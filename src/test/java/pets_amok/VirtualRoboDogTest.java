package pets_amok;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualRoboDogTest {
    @Test
    public void createVirtualRoboDog() {
        VirtualPet underTest = new VirtualRoboDog("Felix", 20, 20,20);
    }
    @Test
    public void roboDogShouldNeedOil() {
        VirtualRoboDog underTest = new VirtualRoboDog("Felix", 20, 20,20);
        int result = underTest.getNeedForOil();
        assertEquals(20,result);
    }
    @Test
    public void roboDogCanBeOiled(){
        VirtualRoboDog underTest = new VirtualRoboDog("Felix",20,20,20);
//        int result = underTest.oilTheRoboticPets();
//        assertEquals(10,result);
    }
}
