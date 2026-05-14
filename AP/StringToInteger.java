/*
 * Ryan Fortner
 * 16 Sept '24
 * String to Integer Conversion
 */

import java.util.Scanner;

public class StringToInteger
{
    /* debug method */
    public static void printIntArr(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
    
    /* split string with 5 two digit integers by space*/
    public static int[] splitStringToInts(String input) {
        int[] output = new int[5];
        
        int arrI = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i + 1) != ' ' && input.charAt(i) != ' ') {
                output[arrI] = Integer.parseInt(Character.toString(input.charAt(i)) + Character.toString(input.charAt(i + 1)));
                arrI++;
            }
        }
        
        return output;
    }
    
    /* convert decimal to any base via division remainder method */
    public static String decToBase(int num, int base) {
        String output = "";
        int remainder = 0;
        while (num > 0) {
            remainder = num % base;
            if (remainder > 9) {
                output += (char)(remainder + 55);
            } else {
                output += Integer.toString(remainder);
            }
            num /= base;
        }
        
        // reverse the string
        String output2 = "";
        for (int i = output.length() - 1; i >= 0; i--) {
            output2 += output.charAt(i);
        }
        
        return output2;
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter string of 5 two-digit integers (separated by space)");
        int[] splitString = splitStringToInts(input.nextLine());
        
        int stringTotal = 0;
        for (int i = 0; i < splitString.length; i++) {
            stringTotal += splitString[i];
        }

        System.out.println(decToBase(stringTotal, 16));
    }
}
