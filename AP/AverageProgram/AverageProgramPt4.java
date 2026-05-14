/**
 * Average Program part 4
 * Ryan Fortner 2B
 * 10.18.24
 * 
 * Read in an unknown amount of integers from a file.
 * Integers are separated by commas, no spaces.
 * Find the average of each line in the file.
 */

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class AverageProgramPt4 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("data4.txt"));
        
        while (input.hasNextLine()) {
            
            String[] temp = input.nextLine().split(",");
            int[] arr = new int[temp.length];
            for (int i = 0; i < temp.length; i++) {
                arr[i] = Integer.parseInt(temp[i]);
            }
            
            int lineTotal = 0;
            int lineCount = 0;
            
            for (int i = 0; i < arr.length; i++) {
                lineTotal += arr[i];
                lineCount++;
            }
            
            System.out.printf("%.2f ", (double)lineTotal / lineCount);
        }
        System.out.printf("\n");
        
        input.close();
    }
}
