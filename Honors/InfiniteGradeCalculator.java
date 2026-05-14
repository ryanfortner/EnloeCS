// Ryan Fortner
// 01.12.24
// Infinite Grade Calculator

import java.util.Scanner;

public class InfiniteGradeCalculator
{
    public static void main(String[] args)
    {
        // create scanner object
        Scanner input = new Scanner(System.in);
        
        boolean continueLoop = false;
        
        int gradeTotal = 0;
        int numGrades = 0;
        
        do {
            int n = numGrades + 1;

            if ((n > 3 && n < 10) || (n > 10 && n < 20) || (n % 10) == 0 || (n % 10) > 3 && (n % 10) < 10) { // st
                System.out.printf("Enter %dth grade: ", n);
            } else if (n == 2 || (n % 10) == 2) { // nd
                System.out.printf("Enter %dnd grade: ", n);
            } else if (n == 3 || (n % 10) == 3) { // rd
                System.out.printf("Enter %drd grade: ", n);
            } else if (n == 1 || (n % 10) == 1) { // th
                System.out.printf("Enter %dst grade: ", n);
            }

            // check for valid grade
            int enteredGrade = input.nextInt();
            while (enteredGrade <= 100 && enteredGrade >= 0) {
                gradeTotal += enteredGrade;
                numGrades++;
                
                System.out.print("Do you wish to enter more grades? (y/n) ");
                String response = input.next();
                
                if (response.compareTo("y") == 0 || response.compareTo("Y") == 0) {
                    continueLoop = true;
                    break;
                } else {
                    continueLoop = false;
                    break;
                }
            }
            if (enteredGrade > 100 || enteredGrade < 0) {
                System.out.printf("Please input a valid score.\n");
            }
        } while (continueLoop);
        
        double average = (double)gradeTotal / numGrades;
        
        System.out.printf("You have entered %d grades.\n", numGrades);
        System.out.printf("The sum of all your grades is %d.\n", gradeTotal);
        System.out.printf("Your average is %.2f.\n", average);
    }
}
