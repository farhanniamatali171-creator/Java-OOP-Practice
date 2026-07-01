class Ride {
    private int rideId;
    private String customerName;
    private double distance;

    static int totalRides = 0;
    final double BASE_FARE = 100;

    // Constructor
    public Ride(int rideId, String customerName, double distance) {
        this.rideId = rideId;
        this.customerName = customerName;
        this.distance = distance;
        totalRides++;
    }

    // Getters
    public int getRideId() {
        return rideId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getDistance() {
        return distance;
    }

    // Method to calculate fare (to be overridden)
    public double calculateFare() {
        return BASE_FARE;
    }

    public void displayRide() {
        System.out.println("Ride ID: " + rideId);
        System.out.println("Customer: " + customerName);
        System.out.println("Distance: " + distance);
    }
}

// EconomyRide Class
class EconomyRide extends Ride {
    private double ratePerKm;

    public EconomyRide(int rideId, String customerName, double distance, double ratePerKm) {
        super(rideId, customerName, distance);
        this.ratePerKm = ratePerKm;
    }

    @Override
    public double calculateFare() {
        return BASE_FARE + (getDistance() * ratePerKm);
    }

    @Override
    public void displayRide() {
        super.displayRide();
        System.out.println("Type: Economy Ride");
        System.out.println("Fare: " + calculateFare());
        System.out.println("------------------------");
    }
}

// PremiumRide Class
class PremiumRide extends Ride {
    private double comfortFee;

    public PremiumRide(int rideId, String customerName, double distance, double comfortFee) {
        super(rideId, customerName, distance);
        this.comfortFee = comfortFee;
    }

    @Override
    public double calculateFare() {
        return BASE_FARE + comfortFee;
    }

    @Override
    public void displayRide() {
        super.displayRide();
        System.out.println("Type: Premium Ride");
        System.out.println("Fare: " + calculateFare());
        System.out.println("------------------------");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Ride[] rides = new Ride[3];

        rides[0] = new EconomyRide(1, "Ali", 10, 20);
        rides[1] = new PremiumRide(2, "Ahmed", 15, 200);
        rides[2] = new EconomyRide(3, "Sara", 8, 25);

        for (Ride r : rides) {
            r.displayRide(); // polymorphism
        }

        System.out.println("Total Rides: " + Ride.totalRides);
    }
}