import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public String getName() {
        return name;
    }

    public int countBedrooms() {
        return bedrooms.size();
    }

    public int countConferenceRooms() {
        return conferenceRooms.size();
    }

    public void addBedroom(Bedroom bedroom1) {
        bedrooms.add(bedroom1);
    }

//    public void checkInBedroom(Guest guest, Bedroom bedroom) {
////        bedrooms.addGuest(guest);
//        if (bedrooms.contains(bedroom)){
//            bedrooms.indexOf(bedroom);
//        }
//    }

        public void checkInBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
        }

    public void checkOutBedroom(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }
}

