/**
 * Average Program part 1
 * Ryan Fortner 2B
 * 10.17.24
 * 
 * Prompt the user for five integers and 
 * return the average as a double
 */

import java.util.Scanner;

public class AverageProgramPt1
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter five integers. Example: 12 14 1 8 12");

        String[] tempArr = input.nextLine().split(" ");
        
        int total = 0;
        for (int i = 0; i < tempArr.length; i++) {
            try{
                total += Integer.parseInt(tempArr[i]);
            } catch (NumberFormatException e) {
                System.out.println("Error: one or more entries are not a number.");
                System.exit(1);
            }
        }
        
        System.out.println((double)total / tempArr.length);
    }
}
