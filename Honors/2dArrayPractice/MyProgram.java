import java.util.Scanner;
import java.io.File;

public class MyProgram
{
    // debug methods
    public static void print1dArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void print2dArray(int[][] arr) {
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) throws Exception
    {
        File file = new File("FileNameHere.txt"); //Makes a file object based on the file in parentheses
        Scanner sc = new Scanner(file); //Makes a scanner object that looks at the contents of the file object named "file"
        
        int array[][] = new int[2][5];
        
        int counter = 0;
        int row1Count = 0;
        int row2Count = 0;
        int columns[] = new int[5];
        while (sc.hasNextLine()) {
            if (counter < 5) {
                array[0][counter] = sc.nextInt();
                row1Count += array[0][counter];
                columns[counter] += array[0][counter];
            } else if (counter >= 5) {
                array[1][counter - 5] = sc.nextInt();
                row2Count += array[1][counter - 5];
                columns[counter - 5] += array[1][counter - 5];
            }
            counter++;
        }
        
        
        
        System.out.println("Array:");
        print2dArray(array);
        
        System.out.println();
        System.out.println("Row 0: " + row1Count);
        System.out.println("Row 2: " + row2Count);
        
        System.out.println();
        for (int i = 0; i < columns.length; i++) {
            System.out.println("Column " + i + ": " + columns[i]);
        }
    }
}
