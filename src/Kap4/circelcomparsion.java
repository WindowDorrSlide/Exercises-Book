package Kap4;

import java.util.Scanner;

public class circelcomparsion {
    public static void main(String[] args)  {
        Scanner scn = new Scanner(System.in);

        System.out.println("Give radial of Kap3.sphere: ");
        int inp = scn.nextInt();

        if (inp < 0)    {
            System.out.println("Negative values are not valid; ending program");
            System.exit(1);
        }

        double area = (4 * Math.PI * Math.cbrt(inp)) / 3;
        double volume = 4 * Math.PI * Math.sqrt(inp);

        System.out.println("Area: " + area + "| Volume: " + volume);
    }
}

