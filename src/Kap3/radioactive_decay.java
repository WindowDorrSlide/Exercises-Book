package Kap3;

import java.util.Scanner;

public class radioactive_decay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("After how many years should the percentage of material be calculated: ");
        int years = scn.nextInt();

        double decay_percentage = Math.exp(-(Math.log(2)/5730) * years) * 100;
        System.out.println("Percentage left after " + years + " years is: " + decay_percentage);
    }
}
