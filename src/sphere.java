import java.util.Scanner;
public class sphere {
    public static void main(String[] args)  {
        Scanner scn = new Scanner(System.in);

        System.out.println("Give radial of sphere: ");
        int inp = scn.nextInt();

        double area = (4 * Math.PI * Math.cbrt(inp)) / 3;
        double volume = 4 * Math.PI * Math.sqrt(inp);

        System.out.println("Area: " + area + "| Volume: " + volume);
    }
}