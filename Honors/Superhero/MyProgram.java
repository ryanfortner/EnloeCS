public class MyProgram
{
    public static void main(String[] args)
    {
        Superhero batman = new Superhero("Batman", "Wealth", "Past Life");
        Superhero superman = new Superhero("Superman", "Flight", "Kryptonite");
        
        if (Superhero.getNumSuperheroes() > 1) {
            System.out.println(Superhero.getNumSuperheroes() + " total Superhero objects created.");
        } else {
            System.out.println(Superhero.getNumSuperheroes() + " Superhero object created.");
        }
        System.out.println();
        
        batman.menu();
        
        System.out.println();
        
        superman.menu();
        
    }
}
