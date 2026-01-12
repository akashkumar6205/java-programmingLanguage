// finding avg of three number

import java.util.Scanner;
public class solution1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first no.: ");
        double x = sc.nextDouble();
        System.out.print("Enter your second no.: ");
        double y = sc.nextDouble();
        System.out.print("Enter your third no.: ");
        double z = sc.nextDouble();
        System.out.print("The average value is " + average(x, y,z) + "\n" );
    }
    public static double average(double x, double y, double z) {
        return ( x + y + z) / 3;
    }
}
