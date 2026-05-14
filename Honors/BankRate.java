import java.util.Scanner;

public class BankRate
{
    public static void main(String[] args)
    {
        // create scanner object
        Scanner input = new Scanner(System.in);
        
        // ask user for amount of money in the account
        System.out.printf("How much money is in the account?\n");
        
        // read in variable as double
        double p = input.nextDouble();
        
        double r;
        
        if (p >= 10000) { // If principal greater than or equal to 10,000
            // Rate is 3%
            r = 3;
        } else if (p >= 5000 && p < 10000) { // Else if principal is greater or equal to 5000 and less than 10000
            // Interest rate is 2.5%
            r = 2.5;
        } else if (p >= 200 && p < 5000) { // Else if principal is greater or equal to 200 and less than 5000
            // Rate is 1.75%
            r = 1.75;
        } else {
            // Rate is 0%
            r = 0;
            // Principal is 15 lower
            p -= 15;
            double l = p * (1 + (r/100));
            System.out.printf("$%.2f at 0 percent interest with a $15 penalty yields $%.2f\n", p, l);
            System.exit(0);
        }
            
        // calculate final balance
        double l = p * (1 + (r/100));
        
        // print final balance
        System.out.printf("$%.2f at %.2f percent interest yields $%.2f\n", p, r, l);
    }
}
