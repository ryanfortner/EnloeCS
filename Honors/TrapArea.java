import java.util.*;

public class TrapArea
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Obtain user input
        System.out.println("Enter base and height of trapezoid: ");
        double b1 = input.nextDouble();
        double b2 = input.nextDouble();
        double h = input.nextDouble();
        
        // Print area
        System.out.println("The area is: " + ((0.5) * (b1 + b2) * h) + " centimeters");
    }
}
