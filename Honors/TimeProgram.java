// Ryan Fortner
// September 21, 2023
// Time Program

import java.util.Scanner;

public class TimeProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // get user input
        System.out.println("Please enter the elapsed time in the form of hours, minutes and seconds.");
        int hours = input.nextInt();
        int minutes = input.nextInt();
        int seconds = input.nextInt();
        
        // calculate seconds & minutes
        int tSeconds = seconds + (minutes * 60) + (hours * 3600);
        double tMinutes = (double)minutes + ((double)seconds / 60) + ((double)hours * 60);
        
        // print output
        System.out.printf("%02d:%02d:%02d elapsed time converts to:\n", hours, minutes, seconds);
        System.out.printf("%d seconds\n", tSeconds);
        System.out.printf("%.3f minutes\n", tMinutes);
    }
}
