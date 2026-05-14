import java.util.Scanner;

public class ChangeMaker
{
    
    public static void exitWithError(String msg, int code) {
        System.out.println(msg);
        System.exit(1);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter amount: $");
        double val = 100 - input.nextDouble();
        
        // check conditions
        if (val > 100) exitWithError("Amount > $100", 1);
        
        int bills[] = {50, 20, 10, 5, 1};
        
        int temp = 0;
        for (int bill : bills) {
            temp = (int)(val / bill);
            System.out.println(temp + " " + bill + " dollar bills");
            val -= (temp * bill);
        }
        
        double coins[] = {0.25, 0.1, 0.05, 0.01};
        String coinNames[] = {
          "quarters",
          "dimes",
          "nickels",
          "pennies"
        };
        
        for (int i = 0; i < 4; i++) {
            temp = (int)(val / coins[i]);
            System.out.println(temp + " " + coinNames[i]);
            val -= (temp * coins[i]);
        }
    }
}
