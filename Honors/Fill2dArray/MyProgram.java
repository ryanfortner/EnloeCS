import java.io.File;
import java.util.Scanner;

public class MyProgram
{
    public static void print4x4Array(int[][] arr) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int findLargestValue(int[][] arr) {
        int largestValue = arr[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[i][j] > largestValue) largestValue = arr[i][j];
            }
        }
        return largestValue;
    }
    
    public static int findSmallestValue(int[][] arr) {
        int smallestValue = arr[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[i][j] < smallestValue) smallestValue = arr[i][j];
            }
        }
        return smallestValue;
    }
    
    public static int findLargestRowSum(int [][] arr) {
        int[] rowSums = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                rowSums[i] += arr[i][j];
            }
        }
        int greatestRowSum = rowSums[0];
        for (int i = 0; i < 4; i++) {
            if (rowSums[i] > greatestRowSum) greatestRowSum = rowSums[i];
        }
        return greatestRowSum;
    }
    
    public static int findSmallestColumnSum(int [][] arr) {
        int[] columnSums = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                columnSums[i] += arr[j][i];
            }
        }
        int smallestColumnSum = columnSums[0];
        for (int i = 0; i < 4; i++) {
            if (columnSums[i] < smallestColumnSum) smallestColumnSum = columnSums[i];
        }
        return smallestColumnSum;
    }
    
    public static void main(String[] args) throws Exception
    {
        File file = new File("InputFile.txt");
        Scanner input = new Scanner(file);
        
        int arr[][] = new int[4][4];
        
        while (input.hasNextLine()) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    arr[i][j] = input.nextInt();
                }
            }
        }
        
        System.out.println("The largest value is " + findLargestValue(arr));
        
        System.out.println("The smallest value is " + findSmallestValue(arr));
        
        System.out.println("The largest row sum is " + findLargestRowSum(arr));
        
        System.out.println("The smallest column sum is " + findSmallestColumnSum(arr));
    }
}
