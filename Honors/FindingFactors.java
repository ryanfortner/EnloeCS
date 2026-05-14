// Ryan Fortner
// 01.13.24
// Finding Factors

import java.util.Scanner;

public class FindingFactors
{
    // method to find factors of integer
    // takes int, outputs string
    // string is either prime or all the factors
    private static String findFactors(int input) {
        String output = "Factors: ";
        
        // iterate through all numbers i to input
        // if divisible by i, add to output string
        for (int i = 1; i <= input; i++) {
            if ((input % i) == 0) {
                output += Integer.toString(i) + " ";
            }
        }
        
        // prime test
        String test = "Factors: 1 " + Integer.toString(input) + " ";
        if (output.compareTo(test) == 0) {
            output = "The number entered is prime.";
        }
        
        return output;
    }
    
    public static void main(String[] args)
    {
        // instantiate scanner object
        Scanner input = new Scanner(System.in);
        
        // continuously loop around if user chooses to
        boolean loop = false;
        do {
            // user input, check if valid
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            if (number > 10000) {
                System.out.println("Error: number is greater than 10000");
                loop = false;
                break;
            }
            
            // find factors using findFactors method
            System.out.println(findFactors(number));

            // check if user wants to enter another number
            System.out.println("Enter another number? (y/n) ");
            String response = input.next();
            if (response.compareTo("y") == 0 || response.compareTo("Y") == 0) {
                loop = true;
                System.out.println();
            } else {
                System.out.println("Ok, exiting.");
                break;
            }
        } while (loop);
    }
}
