import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        System.out.println("In the beginning there are " + BankAccount.counter + " number of accounts");
		System.out.println("The overdrawn penalty is " + BankAccount.OVERDRAWN_PENALTY);
		
		// Create an instance of the BankAccount class as an object called "josh"
		BankAccount josh = new BankAccount("hamburger1", 2000);
		josh.deposit("hamburger1", 100);
		double money = josh.getBalance();//indirect
		System.out.println ("\nJosh's balance is " + money);
		
		
		System.out.println("\n# of accounts is "+ BankAccount.counter);
		
		BankAccount ben = new BankAccount("sandwich2", 3400);
		System.out.println("Josh's balance is "+ josh.getBalance());
		System.out.println("Ben's balance is " + ben.getBalance());
		
		BankAccount mary = new BankAccount();
		mary.setUpAccount("bananas", 5025.13);
		mary.deposit("bananas", 25.35);
		mary.deposit("bananas", 18);
		System.out.println("Mary's balance is "+ mary.getBalance());
		
		//notice there is no "new" keyword here.
		//patrick is a null reference to an object of the BankAccount class
		BankAccount patrick;
		System.out.println("\nThe number of accounts is before Patrick "+ BankAccount.counter);	
		patrick = new BankAccount("yogurt", 4500);	
		System.out.println("Patrick's balance is " + patrick.getBalance());
		System.out.println("The number of accounts is after Patrick "+ BankAccount.counter);
		
		josh.deposit("hamburger1", 500);
		System.out.println("\nJosh's balance with deposit is "+ josh.getBalance());
		
		ben.withdraw("sandwich2", 4000);
		System.out.println("Ben's balance with withdrawal is " + ben.getBalance());
		
		BankAccount better = BankAccount.whoHasMore(josh,ben);
		System.out.println("Of Josh and Ben,the account with the largest balance has $" + better.getBalance());
		
		ben.deposit("sandwich2", 745.37);
		System.out.println("\nBen's new balance is " + ben.getBalance());
		
	
    }
}
