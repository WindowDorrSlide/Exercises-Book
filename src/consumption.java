import java.util.Scanner;

public class consumption {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter how many gallons where used: ");
        double gallons = scn.nextDouble();
        System.out.println("Over which distance in miles: ");
        double miles = scn.nextDouble();

        double consumption_liters_per_mile = (gallons * 3.785) / (miles * 1.609);
        System.out.println("Consumption in liters over swedish mile: " + consumption_liters_per_mile);
    }
}
