/*
Use our vocab below in comments in the above code:

    Find two return types: int for rowSum and int for colSum
    Accessors: both methods are private, cannot be accessed outside the class
    formal parameters: int arr[][] and int row for rowSum, int arr[][] and int row for colSum
    Actual parameters / arguments: arr,3; arr,7; arr,0; arr,5
    static methods: both methods are static
    method names: rowSum and colSum
    Calling a method: colSum(arr, 7); rowSum(arr, 3)
*/


import java.util.Scanner;
public class SampleCodeCommenting
{
           
    private static int rowSum(int arr [][], int row){
        if (row > arr.length-1 || row <0){
            return -1;
        }
        int sum = 0;
        for (int i = 0; i<arr[row].length; i++){
            sum += arr[row][i];
        }
        return sum;
    }
    
    private static int colSum(int arr [][],int col){
        if (col > arr[0].length -1||col<0){
            return -1;
        }
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum +=arr[i][col];
        }
        return sum;
    }   
    public static void main(String[] args)
    {
        int [][] arr = {{1,2,3,4}, {8,9,10,11},{6,25,9,4},{2,3,9,12}};
        System.out.println(rowSum(arr,3));
        System.out.println(colSum(arr,7));
        System.out.println(colSum(arr,0));
        System.out.println(rowSum(arr,5));
        
    }
}
