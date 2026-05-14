import java.util.*;

public class RestaurantCoupon
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("What is the cost of the bill?\n");
        double cost = input.nextDouble();
        System.out.printf("What is the size of the party?\n");
        int partySize = input.nextInt();
        System.out.printf("What time did the dinner start?\n");
        double time = input.nextDouble();
        
        if (partySize <= 6 || cost < 180) {
            cost -= (0.10) * cost;
        }
        
        if (time < 5.00) {
            cost -= (0.10) * cost;
        }
        
        System.out.printf("The coupon has been applied, final cost is $%.2f\n", cost);
    }
}
