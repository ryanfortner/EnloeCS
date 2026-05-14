import java.util.Scanner;

public class Recursion2
{
    public static void hailstone(int n) {
        while(true) {
            System.out.print(n + " ");
            if (n == 1) {
                break;
            } else if ((n % 2) == 0) {
                n = n / 2;
            } else {
                n = (3 * n) + 1;
            }
        }
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = input.nextInt();
        
        hailstone(n);
    }
}
