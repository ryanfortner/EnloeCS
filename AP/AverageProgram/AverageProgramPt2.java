/**
 * Average Program part 2
 * Ryan Fortner 2B
 * 10.17.24
 * 
 * Prompt the user for integers, return the average as decimal.
 * Asks user if there are more integers to enter.
 */

import java.util.Scanner;

public class AverageProgramPt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeat = false;
        int total = 0; 
        int count = 0;
        char response;

        outerloop:
        do {
            System.out.println("Enter an integer:");
            total += input.nextInt();
            count++;
            
            innerLoop:
            do {
                System.out.println("Enter another one? (y/n)");
                response = input.next().charAt(0);
                if (response == 'N' || response == 'n') {
                    break outerloop;
                } else if (response == 'Y' || response == 'y') {
                    repeat = true;
                } else {
                    System.out.println("Invalid input, please try again");
                    repeat = false;
                }
            } while(!repeat);
        } while (repeat);
        
        System.out.println((double)total / count);
    }
}
