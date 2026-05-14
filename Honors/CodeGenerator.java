import java.util.*;

public class CodeGenerator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Prompt for user input
        System.out.println("Enter first two-digit number:");
        int a = input.nextInt();
        System.out.println("Enter second two-digit number:");
        int b = input.nextInt();
        
        // generate the char (ascii value)
        int c1 = ((a + b) % 26) + 65;
        
        // I've used C before so more used to 
        // printf, which uses format specifiers
        System.out.printf("%d %d %c", a, b, c1);
    }
}
