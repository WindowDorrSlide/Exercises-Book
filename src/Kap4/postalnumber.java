package Kap4;

import java.util.Scanner;

public class postalnumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Postalcode: ");
        String inp = scn.nextLine();

        int district = Integer.parseInt(inp.substring(0, 2));

        if ((district >= 20 && district <= 62) || district == 65 || district == 66)   {
            System.out.println("Postalcode is in Götland");
        } else if (district >= 80) {
            System.out.println("Postalcode is in Norrland");
        }   else    {
            System.out.println("Postalcode is in Svealand");
        }

    }
}
