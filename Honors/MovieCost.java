import java.util.*;

public class MovieCost
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("What is your age?\n");
        int age = input.nextInt();
        
        System.out.printf("Would you like to purchase:\n\t- a small popcorn (1)\n\t- a large popcorn (2)\n\t- no popcorn (0)\n");
        int popcorn = input.nextInt();
        
        double price = 7.50;
        if (age >= 65) {
            price -= 1.50;
        } else if (age < 18) {
            price -= 1.00;
        }
        
        if (popcorn == 1) {
            price += 3.50;
        } else if (popcorn == 2) {
            price += 4.50;
        }
        
        System.out.printf("The cost of your movie is $%.2f\n", price);
    }
}
