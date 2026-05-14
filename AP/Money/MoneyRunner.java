import java.util.Scanner;

public class MoneyRunner {

	public static void main(String[] args) {
		/* 1. Create two Money objects.
		 * 		Construct one object with $100 and the other to $45.12.
		 * 		These represent the money used to pay for a purchase and
		 * 		the amount of the purchase.
		 * 		Using the methods in the Money class, calculate and
		 * 		print out the change.
		 */
		 
		Money a = new Money(100, 0);
		Money b = new Money(45, 12);
		 
		System.out.println(Money.sub(a, b).toString());
		
		
		/* 2. Create two Money objects
		 * 		Construct one object with $55.18 and the other to $30.99
		 * 		These represent two items to purchase.
		 * 		Calculate and display the total.
		 * 
		 */
		
		Money c = new Money(55, 18);
		Money d = new Money(30, 99);
		
		System.out.println(Money.add(c, d).toString());
	
		/* 3. Create two Money objects
		 * 		Construct object1 with $0 and the object2 to $10.50
		 * 		Use the setter to set object1 to the same value of object2
		 * 		using object2 accessor methods. DO NOT DIRECTLY SET OBJECT1 to $10.50!! 
		 * 		Add the two objects and display the resulting object.
		 */
		
		Money e = new Money();
		Money f = new Money();
		
		f.setMoney(10, 50);
		e.setMoney(f.getDollars(), f.getCents());
		
		System.out.println(Money.add(e, f).toString() + '0');
		
		/* 4. Create two Money objects
		 * 		Construct object1 with $110.80 which represents
		 * 		the purchase amount. Construct object2 with $100 which is the
		 * 		amount of money the buyer wants to use to purchase.
		 * 		Since object2<object1 print out a warning that the buyer
		 * 		does not have enough money to purchase
		 * 		What happens if you call the Money.sub(a,b) method if a<b?
		 */
		 
		Money g = new Money(110, 80);
		Money h = new Money(100, 0);
		
		if ((g.getDollars() + g.getCents() / 100) > (h.getDollars() + h.getCents() / 100)) {
		    System.out.println("Warning: purchase exceeds balance");
		} else {
		    System.out.println(Money.sub(h, g).toString());
		}
		    
		
		/* 5. Create two Money objects
		 * 		Construct one object with $15.18 and the other to $30.40
		 * 		These represent two items to purchase.
		 * 		Calculate and display the total. If the cents>50 ask the buyer
		 * 		if he wishes to round up his purchase to the nearest dollar amount and 
		 * 		donate the change. Display the new total and the amount donated to 
		 * 		charity
		 */
		 
		Money i = new Money(15, 18);
		Money j = new Money(30, 40);
		
		Money tempObj = Money.add(i, j);
		
		if (tempObj.getCents() > 50) {
		    Scanner sysin = new Scanner(System.in);
		    System.out.println(
		        "Would you like to round up your purchase of " 
		        + tempObj.toString()
		        + " to $"
		        + (tempObj.getDollars() + 1)
		        + ".00? (y/n)"
		    );
		    switch(sysin.next().charAt(0)) {
		        case 'y':
		        case 'Y': {
		            System.out.println(
		                "OK, your total is "
		                + Money.add(
		                    tempObj, 
		                    new Money(
		                        0, 
		                        (100 - tempObj.getCents())
		                    )
		                  ).toString()
		                + "0 ($0."
		                + (100 - tempObj.getCents())
		                + " donated)"
		            );
		            break;
		        }
		        case 'n':
		        case 'N': {
		            System.out.println(
		                "OK, no problem. Total is "
		                + tempObj.toString()
		            );
		            break;
		        }
		        default:
		            System.out.println("Invalid input");
		    }
		}
	}
}
