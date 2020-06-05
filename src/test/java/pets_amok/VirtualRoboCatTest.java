package pets_amok;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualRoboCatTest {
    @Test
    public void createVirtualRoboCatClass(){
        VirtualPet underTest = new VirtualRoboticCat("Felix",20,20,20,"");
    }

}
