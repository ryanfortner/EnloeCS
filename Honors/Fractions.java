// Ryan Fortner
// September 21, 2023
// Fractions Class Activity

import java.util.*;

public class Fractions
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the numerator and denominator for the first fraction.");
        int n1 = input.nextInt();
        int d1 = input.nextInt();
        System.out.println("Enter the numerator and denominator for the second fraction.");
        int n2 = input.nextInt();
        int d2 = input.nextInt();
        
        double quotient = (double)(n1*d2)/(n2*d1);
        
        System.out.printf("The quotient is %.2f", quotient);
    }
}
