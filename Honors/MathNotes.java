public class MathNotes
{
    public static void main(String[] args)
    {
        // declare variables
        int x = 16;
        int y = -10;
        double d1 = 1.69;
        double d2 = -8.9;
        
        // square root, integer parameter, returns a double
        System.out.println("The square root of " + x + " is " + Math.sqrt(x));
        // square root, double parameter, returns a double
        System.out.println("The square root of " + d1 + " is " + Math.sqrt(d1));
        
        // absolute value
        double d3 = Math.abs(d2);
        System.out.println("The absolute value of d3 is " + d3);
        System.out.println("The absolute value of y is " + Math.abs(y));
        
        // power
        double d4 = 4.0;
        System.out.println (d4 + " raised to the 3rd power is " + Math.pow(d4, 3));
        
        // random returns a positive double value greater or equal to 0 and
        // less than 1. To get an integer, multiply by an integer and TYPECAST.
        int randomNumber = (int)( Math.random()*10);
        System.out.println ("here's a random number " + randomNumber);
        // to generate a random number between 1 and 20 inclusive
        randomNumber = (int)(Math.random()*20 + 1);
        System.out.println ("here's another random number " + randomNumber);
        
        // to round a number to the nearest integer. It returns a double, but it
        // looks like an integer.
        double f1 = 4.77;
        System.out.println("round the number to the nearest integer " + Math.rint(f1));
        System.out.println("round the number to the nearest integer " + Math.rint(4.27));
        
        // ceiling method returns the smallest double value that is greater than
        // or equal to the argument and is mathematically
        // an integer. Draw a number line if you need to figure out how it works for
        // negative values
        double f2 = -f1;
        System.out.println("using the ceiling function " + Math.ceil(f2));
        System.out.println("using the ceiling function " + Math.ceil(f1));
        
        // floor method is the opposite of ceiling and returns a double value that is
        // less than or equal to the value.
        System.out.println("using the ceiling function " + Math.floor(f2));
        System.out.println("using the ceiling function " + Math.floor(f1));
        int bob = (int) (5 + 2 / 3 + 1);
        System.out.println(bob);
        
        int n = 5, b = 3;
        double z = 1.0* n / b;
        System.out.println(z); 
    }
}
