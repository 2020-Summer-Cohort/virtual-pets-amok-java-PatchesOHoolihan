package pets_amok;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class VirtualBioDogTest {
    @Test
    public void virtualBioDogShouldHaveDirtLevel() {
        VirtualOrganicDog underTest = new VirtualOrganicDog("Fido", 20, 20, 20, 20,"");
        underTest.getCageDirtLevel();
    }

    @Test
    public void virtualBioDogCanHaveCageCleaned() {
        VirtualOrganicDog underTest = new VirtualOrganicDog("Fido", 20, 20, 20, 20,"");
        underTest.cleanOrganicDogCages();
        int result = underTest.getCageDirtLevel();
        assertEquals(10, result);

    }

    @Test
    public void virtualBioDogShouldHaveHunger() {
        VirtualOrganicDog underTest = new VirtualOrganicDog("Fido", 20, 20, 20, 20,"");
        int result = underTest.getHunger();
        assertEquals( 20,result);
    }
}