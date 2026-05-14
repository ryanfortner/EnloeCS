public class DishSpoonRunner
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat ("Philip", "Bach's Tocata and Fugue in D minor", 1);
        Cat cat2 = new Cat ("Sam", "Rolling Stones Paint it Black", 2);
        cat1.playFiddle();
        cat2.playFiddle();
        Cow cow1 = new Cow ("Rudolph", 10);
        Cow cow2 = new Cow ("Dasher", 13);
        
        System.out.println("1. " + cat1);
        System.out.println("2. " + cat2);
        System.out.println("3. " + cat1.compareTo(cat2));
        System.out.println("4. " + cat2.equals(cat1));
        System.out.println("5. " + Cat.getCount());
        
        System.out.println("6. " + cow1);
        System.out.println("7. " + cow2);
        cow1.jumpTheMoon();
        cow1.jumpTheMoon();
        System.out.println("8. " + cow1.getCount());
        System.out.println("9. " + cow1.compareTo(cow2));
        System.out.println("10. " + cow2.compareTo(cow1));
    }
}
