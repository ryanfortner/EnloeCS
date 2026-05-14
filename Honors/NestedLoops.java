/*
 * A loop inside of a loop
 * Can be for loops or while loops
 * Oten we'll use nested loops to tackle 2-dimensional problems.
 * Write a program using nested for loops to print out a triangle.
 */

public class NestedLoops
{
    public static void main(String[] args)
    {
        for (int i = 1; i < 6; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for (int i = 1; i < 6; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
