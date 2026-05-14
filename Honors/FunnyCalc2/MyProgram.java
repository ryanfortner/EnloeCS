import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class MyProgram
{
    public static double dollar (int a, int b){
        return ((a * b) + (a * b));
    }
    
    public static double pound (int a, int b){
        return ((a + b) * (a + b));
    }
    
    public static double ampersand (double a, double b){
        return ((a + b) / (a - b));
    }
    
    public static double caret (int a, int b){
        return Math.pow(a, b);
    }
    
    public static void main(String[] args) throws FileNotFoundException
    {
        // set up a file object
        File data1 = new File("data1.txt");
 
        // set up a scanner object to read from the file
        Scanner sc1 = new Scanner(data1);
        
        // while there is data in the file, get the
        // next line and read it in as an string.
        // output the data
        while (sc1.hasNextLine())
            {
                String input = sc1.nextLine();
                System.out.println(input);
                // split the input line and place in
                // a array of strings
                String [] expr = input.split(" ");
                // get the operator
                char operator = expr[0].charAt(0);
                //System.out.println(operator);
                
                int a = Integer.parseInt(expr[1]);
                int b = Integer.parseInt(expr[2]);
                
                switch (operator) {
                    default:
                        System.out.println("Unsupported operation");
                        break;
                        
                    case '$':
                        System.out.printf("%.2f\n", dollar(a, b));
                        break;
                        
                    case '#':
                        System.out.printf("%.2f\n", pound(a, b));
                        break;
                        
                    case '&':
                        System.out.printf("%.2f\n", ampersand(a, b));
                        break;
                    
                    case '^':
                        System.out.printf("%.2f\n", caret(a, b));
                        break;
                }
            }

        // clean up by closing the scanner
        // not really necessary
        sc1.close();
        
         
   
    }
}
