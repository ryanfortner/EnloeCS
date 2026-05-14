import java.util.Scanner;

public class PracticeRecursion
{
    public static int h(int x) {
        if (x > 5) {
            return (h(x - 7) + 1);
        } else if ((x >= 0) && (x <= 5)) {
            return x;
        } else {
            return (h(x + 3));
        }
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = input.nextInt();
        
        System.out.println(h(x));
    }
}
