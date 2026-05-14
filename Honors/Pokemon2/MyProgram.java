public class MyProgram
{
    public static void main(String[] args)
    {
        Pokemon p1 = new Pokemon("Charizard");
        p1.menu();
        
        Pokemon p2 = new Pokemon("Pikachu");
        p2.menu();
        
        System.out.println();
        
        if (p1.getHealth() > p2.getHealth()) {
            System.out.println(p1.getName() + " has more health than " + p2.getName());
        } else if (p1.getHealth() < p2.getHealth()) {
            System.out.println(p2.getName() + " has more health than " + p1.getName());
        } else {
            System.out.println(p1.getName() + " has the same health as " + p2.getName());
        }
        
        if (p1.getExperience() > p2.getExperience()) {
            System.out.println(p1.getName() + " has more experience than " + p2.getName());
        } else if (p1.getExperience() < p2.getExperience()) {
            System.out.println(p2.getName() + " has more experience than " + p1.getName());
        } else {
            System.out.println(p1.getName() + " has the same experience as " + p2.getName());
        }        
    }
}
