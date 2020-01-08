import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;

    @Before
    public void before() {
        hotel = new Hotel("CodeClan Towers");
        bedroom1 = new Bedroom(1,2,"Double");
        bedroom2 = new Bedroom(2,1,"Single");
    }

    @Test
    public void hasName() {
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void startsWithNoBedrooms() {
        assertEquals(0, hotel.countBedrooms());
    }

    @Test
    public void startsWithNoConferenceRooms() {
        assertEquals(0, hotel.countConferenceRooms());
    }
}
