package Kap4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("A: ");
        double a = scn.nextDouble();
        System.out.println("B: ");
        double b = scn.nextDouble();
        System.out.println("alfa: ");
        double alfa = scn.nextDouble();

        // Fick hjälp av tvilingarna med att få equvationen rätt då inte hade Radialer
        double c = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(Math.toRadians(alfa)));

        if (Math.abs(c-b) < 0.0001 && b == a)   {
            System.out.println("The triangle is equilateral");
        } else if (Math.abs(c-b) < 0.0001 || a == b) {
            System.out.println("The triangle is isosceles");
        }   else    {
            System.out.println("Just a normal triangle");
        }
    }
}
