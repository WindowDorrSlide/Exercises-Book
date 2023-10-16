package Kap3;

import java.util.Scanner;

public class converter {
    public static void main(String[] args)  {
        Scanner scn = new Scanner(System.in);

        System.out.println("Give temperature in Fahrenheit: ");
        int inp = scn.nextInt();

        double celsius = (inp-32.0) * (5.0/9.0);
        System.out.println("Converted to celsius: " + celsius);
    }
}
