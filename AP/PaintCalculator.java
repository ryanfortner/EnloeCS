import java.util.Scanner;

public class PaintCalculator
{
    public static void exitWithError(int code, String msg) {
        System.out.println(msg);
        System.exit(1);
    }
    
    public static int[] parseDimensions(String dimensions) {
        int[] result = new int[3];
        
        String[] arr = dimensions.split("x");
        
        int counter = 0;
        
        for (String elem : arr) {
            try{
                result[counter] = Integer.parseInt(elem);
            } catch(NumberFormatException e) {
                exitWithError(1, "Format error: please use LxWxH");
            }
            counter++;
        }
        
        return result;
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter dimensions in ft (LxWxH)");
        System.out.println("Ex: 15x12x9");
        int[] arr = parseDimensions(input.nextLine());
        
        /* LxHx2 + WxHx2 */
        double total = (arr[0] * arr[2] * 2) + (arr[1] * arr[2] * 2);
        
        System.out.printf("You will need %.1f gallons of paint.\n", total/350);
    }
}
