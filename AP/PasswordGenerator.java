/*
 * Ryan Fortner
 * 12 Sept '24
 * Password Generator
 */

/* Conditions:
 * First character is a letter
 * Second character is an uppercase letter
 * At least one numeric character
 * At least one special character
 * Must contain 10 characetrs
 */

// How to use Math.random inclusively: (int)(Math.random() * (range + 1) + (lowest value))
// ASCII letters: uppercase [65,90], lowercase [97,122]

import java.util.Scanner;

public class PasswordGenerator
{
    // insert a number given array and index
    public static char[] insertNum(char[] arr, int i) {
        arr[i] = (char)(int)(Math.random()* 10 + 48);
        return arr;
    }
    
    // insert a special character given array and index
    public static char[] insertSpecial(char[] arr, int i) {
        int x = (int)(Math.random() * 10);
        switch(x) {
            case 0: // $
                arr[i] = ((char)36);
                break;
                            
            case 1: // %
                arr[i] = ((char)37);
                break;
                            
            case 2: // &
                arr[i] = ((char)38);
                break;
                            
            case 3: // !
                arr[i] = ((char)33);
                break;
                                
            case 4: // @
                arr[i] = ((char)64);
                break;
                                
            case 5: // *
                arr[i] = ((char)42);
                break;
                                
            case 6: // ?
                arr[i] = ((char)63);
                break;
                            
            case 7: // /
                arr[i] = ((char)47);
                break;
                                
            case 8: // <
                arr[i] = ((char)60);
                break;
                                
            case 9: // >
                arr[i] = ((char)62);
                break;
                                
            default:
                break;
            }
        return arr;
    }
    
    public static char[] generatePassword(int length) {
        char[] arr = new char[length];
        
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                // generate any letter (upper or lower) for first char
                if ((int)(Math.random() * 2) == 1) { // decide if upper or lowercase
                    arr[i] = ((char)(int)(Math.random() * 26 + 65));
                } else {
                    arr[i] = ((char)(int)(Math.random() * 26 + 97));
                }
            } else if (i == 1) {
                // generate an uppercase letter
                arr[i] = ((char)(int)(Math.random() * 26 + 65));
            } else {
                /*
                 * decide whether:
                 * 1- uppercase letter
                 * 2- lowercase letter
                 * 3- numeric character (0-9)
                 * 4- special character ($%&!@*?/<>)
                 */
                int y = (int)(Math.random() * 4);
                switch(y) {
                    case 0:
                        arr[i] = ((char)(int)(Math.random() * 26 + 65));
                        break;
                    
                    case 1:
                        arr[i] = ((char)(int)(Math.random() * 26 + 97));
                        break;
                    
                    case 2:
                        arr[i] = (char)(int)(Math.random() * 9 + 48);
                        break;
                    
                    case 3: // special character -> ascii values are all over the place
                        arr = insertSpecial(arr, i);
                        break;
                        
                    default:
                        break;
                }
            }
        }
        
        // check for special character... if there is none add one
        boolean includesSpecial = false;
        for (int i = 0; i < length; i++) {
            if (arr[i] == '$'
                || arr[i] == '%'
                || arr[i] == '&'
                || arr[i] == '!'
                || arr[i] == '@'
                || arr[i] == '*'
                || arr[i] == '?'
                || arr[i] == '/'
                || arr[i] == '<'
                || arr[i] == '>') {
                    includesSpecial = true;
            }
        }
        if (!includesSpecial) {
            // generate number between 2 and 9 (inclusive), insert special
            arr = insertSpecial(arr, ((int)(Math.random() * 8 + 2)));
        }
        
        // check for number... if there is none add one
        boolean includesNum = false;
        for (int i = 0; i < length; i++) {
            if (arr[i] == '0'
                || arr[i] == '1'
                || arr[i] == '2'
                || arr[i] == '3'
                || arr[i] == '4'
                || arr[i] == '5'
                || arr[i] == '6'
                || arr[i] == '7'
                || arr[i] == '8'
                || arr[i] == '9') {
                    includesNum = true;
            }
        }
        if (!includesNum) {
            // generate number between 2 and 9 (inclusive), insert special
            arr = insertNum(arr, ((int)(Math.random() * 8 + 2)));
        }
        
        return arr;
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the password generator.");
        System.out.print(" Press enter to proceed.");
        
        int length = 10;
        if (input.hasNextLine()) {
            char[] arr = generatePassword(length);
            for (int i = 0; i < length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
}
