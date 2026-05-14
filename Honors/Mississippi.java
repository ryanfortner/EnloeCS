// Ryan Fortner
// 10 January '24
// Mississippi Program

import java.util.Scanner;

public class Mississippi
{
    // method to remove duplicate letters in a given string
    private static String removeDuplicateLetters(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) { // check all letters
            // if the new string contains the given letter, skip
            // also skip whitespace
            if (!result.contains(String.valueOf(input.charAt(i))) && !Character.isWhitespace(input.charAt(i))) { 
                result += input.charAt(i);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args)
    {
        // create scanner object
        Scanner input = new Scanner(System.in);
        
        // read in string
        System.out.println("Enter string: ");
        String str = input.nextLine();
        
        // convert string to uppercase
        str = str.toUpperCase();
        
        // collect duplicated letters and print
        System.out.println(removeDuplicateLetters(str));
        
    }
}
