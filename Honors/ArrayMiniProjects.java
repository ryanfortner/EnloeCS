import java.util.Scanner;

public class ArrayMiniProjects
{
    public static int[] parseArrayInput(String input) {
        String inputSplit[] = input.split(" ");
        int output[] = new int[inputSplit.length];
        for (int i = 0; i < inputSplit.length; i++) {
            output[i] = Integer.parseInt(inputSplit[i]);
        }
        return output;
    }
    
    public static boolean checkPrime(int input) {
        boolean result = true;
        
        // check all number between 2 and input
        for (int i = 2; i < input; i++) {
            if ((input % i) == 0) result = false;
        }
        
        if (input == 1) result = false;
        
        return result;
    }
    
    public static void printIntArray(int input[]) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
    
    public static void main(String[] args)
    {
        // Prime Numbers
        // Sample input: 10 13 12 8 5 7 15 19 2 6
        // Sample output: 10 -1 12 8 -1 -1 15 -1 -1 6
        Scanner input = new Scanner(System.in);
        System.out.println("Prime Numbers: enter integer array as one string");
        int primeNumArr[] = parseArrayInput(input.nextLine());
        
        for (int i = 0; i < primeNumArr.length; i++) {
            if (checkPrime(primeNumArr[i])) primeNumArr[i] = -1;
        }
        
        printIntArray(primeNumArr);
        
        System.out.println();
        
        System.out.println();
        
        // Odds and Evens
        // Sample input: 10 13 12 8 5 7 15 19 2 6
        // Sample output: 0 1 0 0 1 1 1 1 0 0
        System.out.println("Odds and Evens: enter integer array as one string");
        int oddEvenArray[] = parseArrayInput(input.nextLine());
        
        for (int i = 0; i < oddEvenArray.length; i++) {
            if ((oddEvenArray[i] % 2) == 0) oddEvenArray[i] = 0;
            else {
                oddEvenArray[i] = 1;
            }
        }
        
        printIntArray(oddEvenArray);
        
        System.out.println();

        System.out.println();
        
        // Array Element Swap
        // Sample input: { 'b', 'l', 'o', 'c', 'k', 's'}
        // Sample output: skcolb
        System.out.println("Array Element Swap: enter a string");
        String swapStr = input.nextLine();
        
        int length = swapStr.length();
        char newArr[] = new char[length + 1];
        for (int i = 0; i < length; i++) {
            newArr[length - i] = swapStr.charAt(i);
        }
        
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
        }
        System.out.println();
    }
}
