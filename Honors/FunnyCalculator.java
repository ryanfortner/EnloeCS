// Ryan Fortner
// October 19, 2023
// Funny Calculator

/* Comments can be used to plan your code before you write any syntax.
This can be useful especially when writing the logic for new or 
difficult problems. 
**Know What You Don't Know** */

import java.util.*;

public class FunnyCalculator
{
    public static void main(String[] args)
    {
        // make a scanner object
        Scanner input = new Scanner(System.in);
        
        // prompt user for right information
        System.out.printf("Welcome to the Funny Calculator. Your operators are $ # & ^. Please enter an operator followed by two integers. Each character should be separated by a space.\n");
        
        // store first character in a variable
        char operator = input.next().charAt(0);
        
        // store the integers in variables
        int a = input.nextInt();
        int b = input.nextInt();
        
        switch (operator) {
            case '$':
                System.out.printf("%d\n", ((a * b) + (a * b)));
                break;
            case '#':
                System.out.printf("%d\n", ((a + b) * (a + b)));
                break;
            case '&':
                if ((a - b) == 0) { 
                    System.out.printf("Error: denominator is equal to 0\n");
                    System.exit(1);
                }
                System.out.printf("%.2f\n", (((double)a + b) / (a - b)));
                break;
            case '^':
                System.out.printf("%d\n", (int)Math.pow(a, b));
                break;
            default:
                System.out.printf("Sorry, that is an invalid operator\n");
        }
    }
}
