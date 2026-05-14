// Blueprint for making BankAccount objects
public class BankAccount {
    // All our instance variables
    // Encapsulation: can't access instance variables directly
    private String password; 
	private double myBalance; 
	private static double iRate = .04;
	public static final double OVERDRAWN_PENALTY = 20.22; 
	public static int counter = 0; 

    // Constructors
	public BankAccount() 
	{
		password = "";
		myBalance = 0;
		counter++;
	}
	public BankAccount(String pw, double balance) 
	{ 
		password = pw;
		myBalance = balance;
		counter++;
	}
	
	// Public setter methods to set up accounts
	// Password and balance are formal parameters, void return type
	public void setUpAccount(String password, double balance)
	{ 
		this.password = password;
		myBalance = balance;
		return;
	}
	public void setUpAccount(String password, int balance){
		this.password = password;
		myBalance = (double)balance;
		System.out.println ("in the integer method");
		return;
	}
	
	//Public getter method. non-void return type, has no formal parameters
	public double getBalance ()
	{ 
		return myBalance;
	}
	
	
	public void deposit(String pw, int amount)
	{
		if (pw.equals(password)){
			myBalance +=amount;
			myBalance += addInterest(iRate);
		}
		
	}
	
	//void return type, always has parameters
	public void deposit (String pw, double amount) 
	{
		if (pw.equals(password)){
			myBalance +=amount;
			myBalance += addInterest(iRate);
		}
	}
	public void withdraw (String pw, int amount)
	{
		if (pw.equals(password))
			myBalance -=amount;	
		
		if (myBalance <0)
		{
			myBalance -=OVERDRAWN_PENALTY;
		}
	}
	private double addInterest (double rate){
		double interest  = myBalance * (rate);
		return interest ;
	}
	public static BankAccount whoHasMore(BankAccount b1, BankAccount b2)
	{
		BankAccount moreMoney;
		if (b1.getBalance()>b2.getBalance())
			moreMoney = b1;
		else
			moreMoney=b2;
		return moreMoney;
}
}
