public class ArrayUtil {
    
    // Print an array of complex numbers
    public static void printComplexArray(ComplexNumber[] arr) {
        System.out.printf("{");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.printf("%s, ", arr[i]);
            } else {
                System.out.printf("%s}\n", arr[i]);
            }
        }
    }
    
    // Bubble sort an array of complex numbers
    public static ComplexNumber[] sortComplexArray(ComplexNumber[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].getMagnitude() > arr[j + 1].getMagnitude()) {
                    ComplexNumber x = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = x;
                }
            }
        }
        return arr;
    }
    
    // Check for duplicates in an array of complex numbers
    public static boolean hasComplexDuplicates(ComplexNumber[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    if (Math.abs(arr[i].getMagnitude() - arr[j].getMagnitude()) <= 0.001) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
