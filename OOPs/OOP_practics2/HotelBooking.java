package CoreJava.OOP_practics2;
public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

        public static void main(String[] args) {
            HotelBooking booking1 = new HotelBooking();
            System.out.println(booking1.guestName+""+booking1.roomType+" "+booking1.nights);
            System.out.println();

            HotelBooking booking2 = new HotelBooking("adi", "Deluxe", 3);
            System.out.println(booking2.guestName+""+booking2.roomType+" "+booking2.nights);


            System.out.println();

            HotelBooking booking3 = new HotelBooking(booking2);
            System.out.println(booking3.guestName+""+booking3.roomType+" "+booking3.nights);
        }

    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }


}

