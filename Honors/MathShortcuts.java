//Comments activity
// Math Short cuts

import java.util.*;
public class MathShortcuts
{
    public static void main(String[] args) {
        //ADD COMMENTS BEFORE EACH LINE TO EXPLAIN WHATS HAPPENING
        
        // Variable x (an integer) is declared with the value of 3
        int x = 3;
        
        // The value of X plus 1 is added to itself
        x = x + 1;
        
        // The value of X plus 1 is added to itself (increment)
        x++;
        
        // set x = x + 4
        x += 4;
        
        // set x = x * 2
        x *=2;
        
        // set x = x - 3
        x -=3;
        
        // set x = x % 2
        x %=2;
        
        // set x to -6
        x = -6;
        
        // print remainder when x divided by 4
        System.out.println("neg mod " + x%4);
        
        //pre increment x. x=2
        ++x;
        
        // print x
        System.out.println("line 23 x is " + x);
        
        // increment x
        x = x++;
        
        // print x again
        System.out.println("line 24 x is " + x);
        
        // print incremented x
        System.out.println("x = " + x++);
        
        // print x again
        System.out.println("x = " + x);
        
        // declare double d1 and give it value of -5.3
        double d1 = -5.3;
        
        // d1 = d1 + (-5)
        d1 += -5;
        
        // print d1
        System.out.println ("d1 = " + d1);
        
        // find greatest integer closest to d1, use that value in newly-declared variable
        double value = Math.ceil(d1);
        
        // print value
        System.out.println("value is " + value);
        
        // take absolute value of value
        value = Math.abs(d1);
        
        // print value
        System.out.println("value is " + value);
        
        // find smallest integer closest to value
        value = Math.floor(value);
        
        // print value
        System.out.println("value is " + value);
        
        // round value to integer
        value = Math.rint(d1);
        
        // print value
        System.out.println("value is " + value);
        
        // round d1 to nearest long, put that value in newly declared variable y
        long y = Math.round(d1);
        
        // print y
        System.out.println("y is long and " + y);
        
        // round 3.6 to nearest long
        x = Math.round(3.6f);
        
        // print x
        System.out.println("x is rounded to "+ x);
        
        // print random number between 1 and 6 inclusive
        System.out.println((int)(Math.random()*6+1));
        
        // print 2 to the -5th power
        System.out.println ("2 to the -5th power is "+ Math.pow(2,-5));
        
        // declare n1 int to value of 5
        int n1 = 5;
        
        // declare en2 int to value of -3
        int n2 = -3;
        
        // declare int value2 using formula involving n1 and n2 int variables previously declared
        int value2 = (5*n1 + n2)/2;
        
        // print value2
        System.out.println(value2);
        
        int a = 2;
        int b = 3;
        int c = 4;
        System.out.println(a * b + b / a + (a * c / 4.0) * c);
    }
}
