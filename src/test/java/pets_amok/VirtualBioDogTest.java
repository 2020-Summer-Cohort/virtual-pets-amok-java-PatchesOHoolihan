package pets_amok;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class VirtualBioDogTest {
    @Test
    public void virtualBioDogShouldHaveDirtLevel() {
        VirtualBioDog underTest = new VirtualBioDog("Fido", 20, 20, 20, 20);
        underTest.getCageDirtLevel();
    }

    @Test
    public void virtualBioDogCanHaveCageCleaned() {
        VirtualBioDog underTest = new VirtualBioDog("Fido", 20, 20, 20, 20);
        underTest.cleanCage();
        int result = underTest.getCageDirtLevel();
        assertEquals(10, result);

    }

    @Test
    public void virtualBioDogShouldHaveHunger() {
        VirtualBioDog underTest = new VirtualBioDog("Fido", 20, 20, 20, 20);
        int result = underTest.getHunger();
        assertEquals( 20,result);
    }
}