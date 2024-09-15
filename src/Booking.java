import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

public class Booking {
    private static int IDGenerator=1,taxiCount=4;
    private static ArrayList<Taxi> taxilist=new ArrayList<>();
    private static ArrayList<Taxi> bookedHistory=new ArrayList<>();

    private void performBooking(char pickupLoc,char dropLoc,int pickupTime) throws CloneNotSupportedException
    {
       if(taxilist.size()<taxiCount)
       {
           taxilist.add(new Taxi());
       }
       int min=Integer.MAX_VALUE;
       Taxi newTaxi=null;
       for(Taxi taxi:taxilist)
       {
           if(taxi.getDropTime()<=pickupTime&&min>Math.abs(taxi.getCurrentLocation()-pickupLoc))
           {
               newTaxi=taxi;
               min=Math.abs(taxi.getCurrentLocation()-pickupLoc);
           }
       }
       if(newTaxi!=null)
       {
           newTaxi.setBookingID(taxilist.indexOf(newTaxi)+1);
           newTaxi.setCustomerID(IDGenerator++);
           newTaxi.setPickupLoc(pickupLoc);
           newTaxi.setDropLoc(dropLoc);
           newTaxi.setCurrentLocation(dropLoc);
           newTaxi.setPickupTime(pickupTime);
           newTaxi.setDropTime(newTaxi.getPickupTime()+Math.abs(pickupLoc-dropLoc));
           newTaxi.setTotEarn(newTaxi.getTotEarn()+Math.abs(pickupLoc-dropLoc)*200);
           bookedHistory.add((Taxi)newTaxi.clone());
           System.out.println("taxi has booked with taxi no :"+newTaxi.getBookingID());
       }
       else {
           System.out.println("taxi isn't available!!!");
       }
    }
    public void execute(char pickupLoc,char dropLoc,int pickupTime) throws CloneNotSupportedException
    {
        performBooking(pickupLoc,dropLoc,pickupTime);
    }
    public void printHistory()
    {
        if(bookedHistory.size()<1)
        {
            System.out.println("there are no taxies booked yet!");
            return;
        }
        System.out.println("---------------------------------------------");
        System.out.println("Booked History :");
        System.out.println("---------------------------------------------------------------------------------");
        for(Taxi taxi:bookedHistory)
        {

            System.out.println("BookingId\tCustomerId\tSource\tDestination\tPickUpTime\tDropTime\tAmountEarned");
            System.out.println(taxi.getBookingID()+"\t\t\t"+taxi.getCustomerID()+"\t\t\t"+taxi.getPickupLoc()+"\t\t"+taxi.getDropLoc()+"\t\t\t"+taxi.getPickupTime()+"\t\t\t"+taxi.getDropTime()+"\t\t\t"+taxi.getTotEarn());
            System.out.println("---------------------------------------------------------------------------------");
        }
    }
}
