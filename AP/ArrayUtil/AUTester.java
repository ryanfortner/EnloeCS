import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class AUTester {
    public static void main(String[] args) throws FileNotFoundException 
    {
        int size = 16;
        int [] arr = new int[size];
        //fill an array with random integers from 1 through 100
		File data = new File ("data.txt");
        Scanner sc = new Scanner (data);
        int count = 0;
        while (sc.hasNext())
		{
			arr[count]=sc.nextInt();
			count++;
		}
	    sc.close();
		System.out.println("\n **contents of the array**");
		for(int value:arr)
			System.out.print(value + " ");
			
		System.out.println();
		//call a static method to find the max
		//value of the array and print it out
		//call all other methods.
		System.out.println("\nThe max is: " + ArrayUtil.findMax(arr));
		System.out.println("The min is: " + ArrayUtil.findMin(arr));
		System.out.println("The sum is: " + ArrayUtil.arrSum(arr));
		System.out.println("The average is: " + ArrayUtil.arrAverage(arr));
		System.out.println("find duplicate: "+ ArrayUtil.hasDuplicate(arr));
		System.out.println("find a value 5: "+ ArrayUtil.hasValue(arr, 5)); 
        System.out.println("find a value -100: "+ ArrayUtil.hasValue(arr, -100));
		
		
		int []rev = ArrayUtil.reverse(arr);
		System.out.println("\n\n **contents of the reverse array**");
		for(int value:rev)
			System.out.print(value+ " ");
		
		rev = ArrayUtil.shift(arr, 'l', 2);
		System.out.println("\n\n **contents of the shift left 2 array**");
		for(int value:rev)
			System.out.print(value+ " ");
		
		
		rev = ArrayUtil.shift(arr, 'r', 6);
		System.out.println("\n\n **contents of the shift right 6 array**");
		for(int value:rev)
			System.out.print(value+ " ");
		
        rev = ArrayUtil.rotate(arr, 'r', 3);
		System.out.println("\n\n **contents of the rotate right 3 array**");
		for(int value:rev)
			System.out.print(value+ " ");
                rev = ArrayUtil.rotate(arr, 'r', 3);
                
        rev = ArrayUtil.rotate(arr,'l', 4);       
		System.out.println("\n\n **contents of the rotate left 4 array**");
		for(int value:rev)
			System.out.print(value+ " ");
			
			
	    System.out.println("\n");
		int[] nArr = {4, 1, 8, 20, 5};
		nArr = ArrayUtil.upDown(nArr);
		for (int i : nArr) {
		    System.out.print(i + " ");
		}
		System.out.println();
    }
    
}
