class Booking {
    protected int bookingId;
    protected String guestName;
    protected int nights;
    protected static int totalBookings;
    protected final double TAX_RATE = 0.10;
    protected int pay;

    public Booking(int nights, String guestName, int bookingId, int pay) {
        this.nights = nights;
        this.guestName = guestName;
        this.bookingId = bookingId;
        this.pay = pay;
        totalBookings++;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getNights() {
        return nights;
    }

    public static int getTotalBookings() {
        return totalBookings;
    }

    public double calculateBill() {
        return nights * pay + (nights * pay * TAX_RATE);
    }

    public void bookRoom() {
        System.out.println("Room has been booked successfully!");
    }

    public void bookRoom(String specialRequest) {
        System.out.println("Room booked successfully upon the request of : " + specialRequest);
    }

    public void displayBooking() {
        System.out.println("=== Booking Information ===");
        System.out.println("Customer Name: " + guestName);
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Total Nights: " + nights);
        System.out.println("Bill: " + calculateBill());
        System.out.println("Total Bookings: " + totalBookings);
        bookRoom();
        bookRoom("Talha");  
        System.out.println();
    }
}

class StandardRoom extends Booking {
    protected double ratePerNight;

    public StandardRoom(int nights, String guestName, int bookingId, int pay, double ratePerNight) {
        super(nights, guestName, bookingId, pay);
        this.ratePerNight = ratePerNight;
    }

    @Override
    public double calculateBill() {
        return super.calculateBill();
    }

    @Override
    public void displayBooking() {
        super.displayBooking();
        System.out.println("Rate Per Night: " + ratePerNight);
        System.out.println();
    }
}

class DeluxeRoom extends Booking {
    protected double serviceCharge;

    public DeluxeRoom(int nights, String guestName, int bookingId, int pay, double serviceCharge) {
        super(nights, guestName, bookingId, pay);
        this.serviceCharge = serviceCharge;
    }

    @Override
    public double calculateBill() {
        return super.calculateBill() + serviceCharge;
    }

    @Override
    public void displayBooking() {
        super.displayBooking();
        System.out.println("Service Charge: " + serviceCharge);
        System.out.println();
    }
}

public class Main1234 {
    public static void main(String[] args) {
        Booking[] detail = new Booking[3];

        detail[0] = new StandardRoom(2, "Khawar", 1, 5000, 5000);
        detail[1] = new StandardRoom(3, "Fahad", 2, 5000, 5000);
        detail[2] = new DeluxeRoom(4, "Hashir", 3, 10000, 250);

        for (Booking b : detail) {
            b.displayBooking();
        }

        System.out.println("Total Bookings are " + Booking.totalBookings);
    }
}