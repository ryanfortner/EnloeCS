// Ryan Fortner
// September 21, 2023
// Midpoint of a line

import java.util.Scanner;

public class MidpointOfALine
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // get user input
        System.out.println("Please enter two coordinates:");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        
        int xf = (x1 + x2) / 2;
        int yf = (y1 + y2) / 2;
        
        System.out.printf("The midpoint is: (%d, %d)", xf, yf);
    }
}
