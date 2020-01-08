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

    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    public void checkInBedroom(Guest guest, Bedroom bedroom) {
        if (bedrooms.contains(bedroom)){
            bedroom.addGuest(guest);
        }
    }

//        public void checkInBedroom(Guest guest, Bedroom bedroom) {
//        bedroom.addGuest(guest);
//        }

    public void checkOutBedroom(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int nights) {
       return new Booking(bedroom,nights);
    }

    public int totalBill(Booking booking) {
        return booking.countNights() * booking.getBedroom().getCost();
    }

    public ArrayList<Bedroom> vacantBedrooms() {
        ArrayList<Bedroom> vacancies = new ArrayList<Bedroom>();
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.countGuests() == 0);
                vacancies.add(bedroom);
        }
        return vacancies;
    }
}

