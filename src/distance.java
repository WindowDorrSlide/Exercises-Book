import java.util.Scanner;

public class distance {
    public static void main(String[] args)  {
        Scanner scn = new Scanner(System.in);

        System.out.println("Give coordinates in following format x1,y1,x2,y2: ");
        String inp = scn.nextLine();

        String[] coordinates_str = inp.split(",", 0);
        double[] coordinates = new double[4];
        for(int i = 0; i < coordinates_str.length; i++) {
            coordinates[i] = Double.parseDouble(coordinates_str[i]);
        }

        double distance =
                Math.sqrt( Math.pow(coordinates[2]-coordinates[0], 2.0) + Math.pow(coordinates[3]-coordinates[1],
                        2.0) );
        System.out.println("Distance between these coordinates is: " + distance);
    }
}
