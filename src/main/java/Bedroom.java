import java.util.ArrayList;

public class Bedroom {

    private int number;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private int cost;

    public Bedroom(int number, int capacity, String type, int cost) {
        this.number = number;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = type;
        this.cost = cost;
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

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        guests.remove(guest);
    }

    public int getCost() {
        return cost;
    }
}
