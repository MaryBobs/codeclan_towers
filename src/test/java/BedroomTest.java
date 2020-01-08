import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(1,2,"Double");
    }

    @Test
    public void hasNumber() {
        assertEquals(1, bedroom.getNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasType() {
        assertEquals("Double", bedroom.getType());
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, bedroom.countGuests());
    }


}
