// Ryan Fortner
// September 07, 2023
// Donut Island

public class DonutIsland
{
    public static void main(String[] args)
    {
        // Declare constants
        final double PI = 3.14;
        final double DIAMETER = 4.16;
        final double RADIUS = .95;

        // Calculate area
        // area of entire circle
        final double AREA1 = PI * Math.pow((DIAMETER / 2), 2);
        // area of smaller circle
        final double AREA2 = PI * Math.pow(RADIUS, 2);
        // area of land only
        final double AREA3 = AREA1 - AREA2;
        
        // Print results
        System.out.print("Donut island with a diameter of " + DIAMETER + "miles that contains a circular lake of " + RADIUS + " has ");
        System.out.print(AREA3 + " square miles of cultivatable land.\n");
    }
}

