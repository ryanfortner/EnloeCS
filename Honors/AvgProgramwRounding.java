import java.util.*;

public class AvgProgramwRounding
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Read in user input
        System.out.printf("Enter 5 decimal numbers separated by spaces.\n");
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble(), d = input.nextDouble(), e = input.nextDouble();
        
        // Find the average
        double avg = (a + b + c + d + e) / 5;
        
        // Display rounded results.
        System.out.printf("The average of %.2f, %.2f, %.2f, %.2f, and %.2f rounded to the nearest integer is %d\n", a, b, c, d, e, Math.round(avg));
        System.out.printf("Rounded to the nearest hundredth is %.2f\n", (Math.rint(avg * 100) / 100)); // scale up, round, scale down
    }
}
