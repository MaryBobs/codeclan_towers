import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Guest guest1;

    @Before
    public void before() {
        hotel = new Hotel("CodeClan Towers");
        bedroom1 = new Bedroom(1,2,"Double");
        bedroom2 = new Bedroom(2,1,"Single");
        guest1 = new Guest("Eugene");
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

    @Test
    public void canAddBedroom() {
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.countBedrooms());
    }

//    @Test
//    public void canCheckInBedroom() {
//        hotel.addBedroom(bedroom1);
//        hotel.checkInBedroom(guest1, bedroom1);
//        assertEquals(1, bedroom1.countGuests());
//    }

    @Test
    public void canCheckInBedroom() {
        hotel.addBedroom(bedroom1);
        hotel.checkInBedroom(guest1, bedroom1);
        assertEquals(1, bedroom1.countGuests());
    }

    @Test
    public void canCheckOut() {
        hotel.checkOutBedroom(guest1, bedroom1);
        assertEquals(0, bedroom1.countGuests());
    }

    @Test
    public void canBookRoom() {
        Booking booking = hotel.bookRoom(bedroom1, 2);
        assertEquals(2, booking.countNights());
        assertEquals(bedroom1, booking.getBedroom());
    }

}
