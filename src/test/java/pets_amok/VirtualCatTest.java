package pets_amok;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualCatTest {
    @Test
    public void createVirtualCatClass(){
        VirtualPet underTest = new VirtualCat("Felix",20,20);
    }
}
