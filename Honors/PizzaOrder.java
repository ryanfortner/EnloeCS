// Ryan Fortner
// October 17, 2023
// Pizza Order

import java.util.*;

public class PizzaOrder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the pizza size
        System.out.printf("Please enter the size of the pizza (12, 14, or 16 inch)\n");
        int pizzaSize = input.nextInt();
        
        // Prompt user for the number of toppings
        System.out.printf("Please enter the number of toppings.\n");
        int numToppings = input.nextInt();
        
        // Calculate cost
        double cost = 0.0;
        switch(pizzaSize) {
            case 12:
                cost = 9.00;
                break;
            case 14:
                cost = 11.00;
                break;
            case 16:
                cost = 14.00;
                break;
            default:
                System.out.printf("Not a valid pizza size.\n");
                System.exit(1);
        }
        if (numToppings < 3) {
            switch(numToppings) {
                case 1:
                    cost += 2.00;
                    break;
                case 2:
                    cost += 3.00;
                    break;
                case 0:
                    // do nothing
                    break;
                default: 
                    System.out.printf("Not a valid number of toppings.\n");
                    System.exit(1);
            }
        } else if (numToppings >= 3) {
            cost += (3.50 + (0.50 * (numToppings - 3)));
        } else {
            System.out.printf("Not a valid number of toppings.\n");
            System.exit(1);
        }
        
        // Display cost
        System.out.printf("The cost of the pizza is $%.2f\n", cost);
    }
}
