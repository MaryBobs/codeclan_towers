import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest1;

    @Before
    public void before() {
        bedroom = new Bedroom(1,2,"Double");
        guest1 = new Guest("Eugene");
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

    @Test
    public void canAddGuest() {
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void canRemoveGuest() {
        bedroom.addGuest(guest1);
        bedroom.removeGuest(guest1);
        assertEquals(0, bedroom.countGuests());
    }



}
