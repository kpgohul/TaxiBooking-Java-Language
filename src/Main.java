import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
       Booking book=new Booking();
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("---------------------------------------------");
            System.out.println("1.book");
            System.out.println("2.printBookedList");
            System.out.println("3.exit");
            System.out.println("---------------------------------------------");
            System.out.println();
            System.out.println("enter your choice :");
            int choice=s.nextInt();
            System.out.println("---------------------------------------------");
            switch(choice)
            {
                case 1 ->
                {
                    System.out.println("Enter your pickUp location :");
                    char pick=s.next().charAt(0);
                    System.out.println("Enter your drop Loccation :");
                    char drop=s.next().charAt(0);
                    System.out.println("Enter your drop time :");
                    int time= s.nextInt();
                    book.execute(pick,drop,time);
                    //1
                    // Sy1;
                }
                case 2 ->
                {
                    book.printHistory();
                    break;
                }
                case 3 ->
                {
                    System.exit(0);
                }
                default ->
                {
                    System.out.println("Enter a correct choice!!!");
                }
            }
        }

    }
}