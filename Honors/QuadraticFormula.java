import java.util.*;

public class QuadraticFormula
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Prompt user for a, b, c
        System.out.printf("Please enter a, b, and c for a quadratic equation. The value for 'a' may not be zero.\n");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        // Calculate roots
        double rootOne = (-(b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double rootTwo = (-(b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    
        // Print results
        System.out.printf("The equation %dx^2 + %dx + %d has the roots: %.2f and %.2f\n", a, b, c, rootOne, rootTwo);
    }
}
