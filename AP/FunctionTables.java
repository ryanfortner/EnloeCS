/*
 * Ryan Fortner
 * 10 Sept '24
 * Function Tables
 */

public class FunctionTables
{
    public static void main(String[] args)
    {
        System.out.printf("Number\tSquare\tSquare Root\tCube\t4th Root\n");
        for (int i = 1; i <= 20; i++) {
            System.out.printf(
                "%d\t%.0f\t%.4f\t%.0f\t%.4f\n", 
                i, 
                Math.pow(i, 2),
                Math.pow(i, 1/2.0),
                Math.pow(i, 3),
                Math.pow(i, 1/4.0)
            );
        }
    }
}
