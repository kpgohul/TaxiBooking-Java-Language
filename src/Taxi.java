import java.util.ArrayList;

public class Taxi implements Cloneable {
    private char currentLocation='A';
    private int bookingID;
    private int customerID;
    private int pickupTime;
    private int TotEarn;
    private char pickupLoc;
    private char dropLoc;
    private int dropTime;
    private ArrayList<Integer> earnedFromEachBooking=new ArrayList<>();

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    public int getDropTime() {
        return dropTime;
    }

    public void setDropTime(int dropTime) {
        this.dropTime = dropTime;
    }

    public char getPickupLoc() {
        return pickupLoc;
    }

    public void setPickupLoc(char pickupLoc) {
        this.pickupLoc = pickupLoc;
    }

    public char getDropLoc() {
        return dropLoc;
    }

    public void setDropLoc(char dropLoc) {
        this.dropLoc = dropLoc;
    }

    public char getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(char currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(int pickupTime) {
        this.pickupTime = pickupTime;
    }

    public int getTotEarn() {
        return TotEarn;
    }

    public void setTotEarn (int totEarn) {
        TotEarn = totEarn;
    }
}
