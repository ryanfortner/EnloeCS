import java.util.*;

public class SumOftheDigits
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter a 5-digit number.\n");
        String digits = input.next();
        
        // check if string is the right length
        if (digits.length() != 5) {
            System.out.printf("Error: the number you entered is not 5 digits.\n");
            System.exit(1);
        }
        
        int total = Integer.parseInt(digits.substring(0,1)) + Integer.parseInt(digits.substring(1,2)) + Integer.parseInt(digits.substring(2,3))+ Integer.parseInt(digits.substring(3,4)) + Integer.parseInt(digits.substring(4,5));

        System.out.printf("The sum of the digits is %d\n", total);
    };
}
