public class Booking {

    private Bedroom bedroom;
    private int nights;

    public Booking(Bedroom bedroom, int nights) {
        this.bedroom = bedroom;
        this.nights = nights;
    }

    public int countNights() {
        return nights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }
}
