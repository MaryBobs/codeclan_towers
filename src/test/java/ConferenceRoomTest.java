import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(10, "Conference Room 1");
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Conference Room 1", conferenceRoom.getName());
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, conferenceRoom.countGuests());
    }

}
