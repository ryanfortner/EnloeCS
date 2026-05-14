/**
 * Average Program part 3
 * Ryan Fortner 2B
 * 10.18.24
 * 
 * Read in an unknown number of integers from a file.
 * Integers will be separated by spaces.
 * Output must be decimal rounded to nearest hundredth.
 */

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class AverageProgramPt3 {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("data3.txt"));
        
        int total = 0;
        int count = 0;
        
        while(input.hasNextInt()) {
            total += input.nextInt();
            count++;
        }
        
        System.out.printf("%.2f\n", (double)total / count);
        
        input.close();
    }
    
}
