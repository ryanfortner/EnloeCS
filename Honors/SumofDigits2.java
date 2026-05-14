import java.util.*;

public class SumofDigits2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter a 5-digit number.\n");
        String digits = input.next();
        
        // check if string is the right length
        /*if (digits.length() != 5) {
            System.out.printf("Error: the number you entered is not 5 digits.\n");
            System.exit(1);
        }*/
        
        int total = 0;
        for (int i = 0; i < digits.length(); i++) {
            total += Integer.parseInt(digits.substring(i, i + 1));
        }
        
        System.out.printf("The sum of the digits is %d\n", total);
        
        // one-liner if statement example (for future reference)
            // variable = condition ? expression_if_true : expression_if_false
        
        System.out.printf("%d is divisible by ", total);
        for (int i = 2; i <= 10; i++) {
            while (i != 7 && i != 10) {
                if ((total % i) == 0) {
                    System.out.printf("%d, ", i);
                }
                break;
            }
            if (i == 10) {
                if ((total % i) == 0) {
                    System.out.printf("%d.", i);
                }
            }
        }
        
        System.out.println();
    };
}
