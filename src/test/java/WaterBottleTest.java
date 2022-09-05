import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;
    @Before
    public void before(){
       waterBottle = new WaterBottle();
    }


    @Test
    public void hasWater(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drink(){
        assertEquals(90, waterBottle.drink());
    }
    @Test
    public void empty(){
        assertEquals(0, waterBottle.empty());
    }
    @Test
    public void fill(){
        assertEquals(100, waterBottle.fill());
    }


}
