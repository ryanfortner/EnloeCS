//October 12th 2023 

//Guess a Number Program
/*
Have user guess a number 1 - 10 and compare
it to a randomly generated number with
if statements.
*/

import java.util.Scanner;

public class GuessANumber
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a number 1-10 inclusive");
        
        int guess = kb.nextInt();
        
        int num = (int)(Math.random()*10 + 1);        
                    //0.0 - 1.0 exclusive
                    //0.0 - 9.999
                    //1.0 - 10.999
                    //1 - 10
            //condition
        if(num == guess){
            System.out.println("Good guess! You won!");
        } else if(Math.abs(num - guess) == 1){
            System.out.println("Close guess! Would you like another try? (Y/N)");
            char answer = kb.next().charAt(0);
            
            //nested if statement
            if(answer == 'Y'){
                System.out.println("Enter another number");
                guess = kb.nextInt();
                
                //nested nested if statement
                if(num == guess){
                    System.out.println("You won on the second try!");
                } else {
                    System.out.println("you lost, game over");
                }
            } else {
                System.out.println("Game over");
            }
            
        } else {
            //else doesnt have a condition
            //this block will run if original condition is false
            System.out.println("You lost! Would you like another try? (Y/N)");
            char answer = kb.next().charAt(0);
            
            //nested if statement
            if(answer == 'Y'){
                System.out.println("Enter another number");
                guess = kb.nextInt();
                
                //nested nested if statement
                if(num == guess){
                    System.out.println("You won on the second try!");
                } else {
                    System.out.println("you lost, game over");
                }
            } else {
                System.out.println("Game over");
            }
        }
    }
}
