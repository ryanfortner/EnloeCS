import java.util.Scanner;

public class ParksideTriangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Parkside Triangle part 1");
        System.out.println("Enter number of rows: ");
        int p1Input = input.nextInt();

        System.out.printf("\nOutput:\n");
        int n = 1;
        for (int i = 1; i < (p1Input + 1); i++) {
            for (int k = 1; k <= i; k++) {
                if (n == 10) {
                    n = 0;
                }
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
        
        System.out.printf("\n\n");
        
        System.out.println("Parkside Triangle part 2");
        
        System.out.println("Enter number of rows: ");
        int p2Rows = input.nextInt();
        System.out.println("Enter number to start with:");
        int p2Start = input.nextInt();
        
        System.out.printf("\nOutput:\n");
        n = p2Start;
        for (int i = 1; i < (p2Rows + 1); i++) {
            for (int k = 1; k <= i; k++) {
                if (n == 10) {
                    n = 0;
                }
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}
