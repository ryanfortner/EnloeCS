public class Money {
    private int dollars; // represents dollars
    private int cents; // represents cents
    
    // constructor
    public Money() {
        dollars = 0;
        cents = 0;
    }
    
    // constructor
    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }
    
    // mutator
    public void setMoney(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }
    
    // returns a string with the current $ value
    public String toString() {
        return ("$" + dollars + "." + cents);
    }
    
    // accessor
    public int getDollars() {
        return dollars;
    }
    
    public int getCents() {
        return cents;
    }
    
    // adds two money objects and returns the sum
    // in a money object
    public static Money add(Money a, Money b) {
        int d = a.dollars + b.dollars;
        int c = a.cents + b.cents;
        if (c >= 100) {
            d = d + c / 100;
            c = c % 100;
        }
        Money sum = new Money(d, c);
        return sum;
    }
    
    // subtracts two money objects and returns the
    // difference in a money object
    // precondition: object a must be greater than object b
    public static Money sub(Money a, Money b) {
        int d = a.dollars - b.dollars;
        int c = a.cents - b.cents;
        
        if (c < 0) {
            d = d - 1;
            c = 100 + c;
        }
        
        Money diff = new Money(d, c);
        return diff;
    }
}
