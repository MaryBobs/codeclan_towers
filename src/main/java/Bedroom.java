import java.util.ArrayList;

public class Bedroom {

    private int number;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;

    public Bedroom(int number, int capacity, String type) {
        this.number = number;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public int countGuests() {
        return guests.size();
    }
}
