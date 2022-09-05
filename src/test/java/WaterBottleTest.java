import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;


    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void subtractVolumeFromBottle(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void emptyContentsOfBottle() {
        assertEquals((0), waterBottle.emptyBottle());
    }

    @Test
    public void fillContentsOfBottle() {
        assertEquals(100, waterBottle.fillBottle());
    }
}
