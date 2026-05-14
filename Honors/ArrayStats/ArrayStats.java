import java.io.File;
import java.util.Scanner;

public class ArrayStats
{
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static boolean isSorted(int[] array) {
        boolean result = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) result = false;
        }
        return result;
    }
    
    public static void main(String[] args) throws Exception
    {
        File file = new File("FileNameHere.txt"); //Makes a file object based on the file in parentheses
        Scanner sc = new Scanner(file); //Makes a scanner object that looks at the contents of the file object named "file"
        
        int x = 11;
        int[] arr1 = new int[x]; //x is the size of the array
        
        //This loops fills in the array with the contents of the file
        int n = 0;
        while(sc.hasNextLine()){ 
            arr1[n] = sc.nextInt();
            n++;
        }
        
        // Bubble sort the array for later use
        int[] arr2 = new int[x];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        while (!isSorted(arr2)) {
            for (int i = 0; i < arr2.length - 1; i++) {
                if (arr2[i] > arr2[i + 1]) {
                    int t = arr2[i + 1];
                    arr2[i + 1] = arr2[i];
                    arr2[i] = t;
                }
            }
        }
        
        // 1
        // Find the maximum value and print
        System.out.println("Maximum: " + arr2[arr2.length - 1]);
        
        // 2
        // Find the minimum value and print
        System.out.println("Minimum: " + arr2[0]);
        
        // 3
        // Print the range
        System.out.println("Range: " + arr2[0] + "-" + arr2[arr2.length - 1]);
        
        // 4
        // Print bubble sorted array
        System.out.print("Bubble sorted array: ");
        printArray(arr2);
        // Find and print the median
        if ((x % 2) == 0) {
            System.out.println("Median: " + (double)(arr2[x / 2] + arr2[(x / 2) + 1]) / 2);
        } else {
            System.out.println("Median: " + arr2[x / 2]);
        }
        
        // 5
        // Find and print the average of the array (round to nearest int)
        int average = 0;
        for (int i = 0; i < arr1.length; i++) {
            average += arr1[i];
        }
        average /= arr1.length;
        System.out.printf("Average: %d\n", average);
        
        // 6
        // Search for duplicates
        boolean duplicatesFound = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (j != i) {
                    if (arr1[j] == arr1[i]) {
                        duplicatesFound = true;
                    }
                }
            }
        }
        if (duplicatesFound) System.out.println("Duplicates detected.");
        
        // 7
        // Replace smallest and largest values with the average value
        int smallestValueIdx = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[0] == arr1[i]) smallestValueIdx = i;
        }
        arr1[smallestValueIdx] = average;
        int largestValueIdx = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[arr2.length - 1] == arr1[i]) largestValueIdx = i;
        }
        arr1[largestValueIdx] = average;
        
        // 8
        // Calculate and display the new average
        average = 0;
        for (int i = 0; i < arr1.length; i++) {
            average += arr1[i];
        }
        average /= arr1.length;
        System.out.printf("New Average: %d\n", average);
        
        // 9
        System.out.print("Final Array: ");
        printArray(arr1);
    }
}
