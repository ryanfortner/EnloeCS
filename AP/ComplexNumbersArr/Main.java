import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.stream.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new FileReader("complexNumbers.txt"));
        
        if (in.ready()) {
            Stream<String> s = in.lines();
            
            Object[] test = s.toArray();
            
            ComplexNumber[] arr = new ComplexNumber[test.length];

            for (int i = 0; i < test.length; i++) {
                arr[i] = new ComplexNumber(test[i].toString());
            }
    
            System.out.println("Starting array:");
            ArrayUtil.printComplexArray(arr);
            
            System.out.println("\nSorted array:");
            ArrayUtil.printComplexArray(arr = ArrayUtil.sortComplexArray(arr));
            
            System.out.print("\nHas duplicates? " + ArrayUtil.hasComplexDuplicates(arr));
        }
        
        in.close();
    }
}
