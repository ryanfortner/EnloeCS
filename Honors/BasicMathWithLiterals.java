// Ryan Fortner
// September 07, 2023
// Basic Math with Literals

/*
"Success consists of going failure to failure 
without loss of enthusiasm." - Winston Churchill
*/

public class BasicMathWithLiterals
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
            // "Hello World" is a string literal.
        
        System.out.println(3 + 4);
        System.out.println("The sum of 3 and 4 is " + (3 + 4));
            // 3 and 4 are integer (int) literals.
            
        System.out.println('a');
            // 'a' is a character (char) literal.
            
        System.out.println('a' + 3 + 4);
            // ascii value of char 'a' is 98
        System.out.println(5*5);
        
        /* Variable Types
           Int is the data type for integers. */
        int number = 3;
        // could be declared on a different line, like
        //      int number;
        //      number = 3;
        System.out.println("number is " + number);
        
        int num2 = number;
        System.out.println("num2 is " + num2);
        num2 = num2 * 3;
        System.out.println("num2 is now " + num2);
        
        // Double is the data type for integers
        double num3 = num2 * 0.5;
        System.out.println("num3 is " + num3);
    }
}
