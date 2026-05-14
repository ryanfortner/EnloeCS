public class ArrayUtil {
    //static methods to work on an array of integers
	
	//return max value of array
	public static int findMax (int []arr){
		int max = arr[0];
		for (int i = 1; i<arr.length;i++){
			if (arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	
	//return minimum value of array
	public static int findMin (int []arr){
		
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
		    if (arr[i] < min) {
		        min = arr[i];
		    }
		}
		
		return min;
	}
	
	// return olympic average (average not including the max or min)
	public static double olympicAvg(int[] arr) {
	    return (double)(arrSum(arr) - findMin(arr) - findMax(arr)) / (arr.length - 3);
	}
	
	// stupid thing detailed in the assignment instructions
	public static int[] upDown(int[] arr) {
	    int[] output = new int[arr.length];
	    output[0] = arr[0];
	    for (int i = 1; i < arr.length; i++) {
	        output[i] = arr[i] - arr[i - 1];
	    }
	    
	    return output;
	}
	
	//return the sum of the array
	public static int arrSum (int []arr){
	    
	    int sum = 0;
	    for (int i = 0; i < arr.length; i++) {
	        sum += arr[i];
	    }
	
		return sum;
	}
	
	//return the average of the elements
	//of the array
	public static double arrAverage(int[] arr){
        return (double)arrSum(arr) / arr.length;
	}
	
	//look for a specific value in an array.
	//return true if the value exists in the array,
	//return false if it does not.
	public static boolean hasValue(int[]arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
	}
	
	//determines if duplicate values exist
	//in the array
	public static boolean hasDuplicate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j != i && arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
	}
	
	//return a new array with reverse order from the original
	public static int[] reverse (int []arr){
		int [] temp = new int[arr.length];
        
        for (int i = arr.length - 1, counter = 0; i >= 0; i--, counter++) {
            temp[counter] = arr[i];
        }	
		
		return temp;
	}
	
	//return a new array with elements shifted
	//left or right for a certain number of spaces
	//precondition: the number of spaces will be less
	//than or equal to the number of elements in the array.
	//direction = 'l' for left and 'r' for right
	public static int[] shift(int[]arr, char direction,int spaces){
		int []temp = new int [arr.length];
        
        switch(direction) {
            case 'l':
                for (int i = 0; i < arr.length; i++) {
                    if (i + spaces > arr.length - 1) {
                        temp[i] = 0;
                    } else {
                        temp[i] = arr[i + spaces];
                    }
                }
                break;
                
            case 'r':
                for (int i = 0; i < arr.length; i++) {
                    if (i < spaces) {
                        temp[i] = 0;
                    } else {
                        temp[i] = arr[i - spaces];
                    }
                }
                break;

            default:
        }
        	
		return temp;
	}
	public static int[] rotate (int[]arr, char direction,int spaces){
		int []temp = new int [arr.length];
		
		switch(direction) {
		    case 'l':
		        for (int i = 0; i < arr.length; i++) {
		            if (i + spaces > arr.length - 1) {
		                temp[i] = arr[i - arr.length + spaces];
		            } else {
		                temp[i] = arr[i + spaces];
		            }
		        }
		        break;
		        
		    case 'r':
		        for (int i = 0; i < arr.length; i++) {
		            if (i < spaces) {
		                temp[i] = arr[i + arr.length - spaces];
		            } else {
		                temp[i] = arr[i - spaces];
		            }
		        }
		        break;
		        
		    default:
		}
		
		return temp;
	}
}
