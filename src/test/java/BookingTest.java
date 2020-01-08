import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom1;
    private Bedroom bedroom2;


    @Before
    public void before() {
        bedroom1 = new Bedroom(1,2,"Double");
        bedroom2 = new Bedroom(2,1,"Single");
        booking = new Booking(bedroom1, 2);
    }

    @Test
    public void hasNumberOfNights() {
        assertEquals(2, booking.countNights());
    }

    @Test
    public void hasBedroom() {
        assertEquals(bedroom1, booking.getBedroom());
    }

}
