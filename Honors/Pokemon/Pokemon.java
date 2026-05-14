import java.util.Scanner;
import java.util.Random;

public class Pokemon {
    private String name;
    private int health;
    private int xp;
    
    public Pokemon(String name) {
        this.name = name;
        xp = 0;
        health = 100;
    }
    
    public String getName() {
        return name;
    }
    
    public int getHealth() {
        return health;
    }
    
    public int getExperience() {
        return xp;
    }
    
    public String toString() {
        return String.format("[%s] XP: %d  HEALTH: %d\n", name, xp, health);
    }
    
    public void rest() {
        System.out.println("Resting...");
        health += 10;
        xp -= 5;
    }
    
    public void fight() {
        Random random = new Random();
        int num = random.nextInt(3);
        switch(num) {
            case 0:
                // lose
                xp += 5;
                health -= 15;
                break;
            case 1:
                // tie
                xp += 10;
                health -= 10;
                break;
            case 2:
                // win
                xp += 15;
                health -= 5;
                break;
            default:
                break;
        }
    }
    
    public void menu() {
        outerloop:
        while (true) {
            
            Scanner input = new Scanner(System.in);
            System.out.println("Choose from the following menu of activities:");
            System.out.println("0 - display data, 1 - rest, 2 - fight, 3 - exit");
            int s = input.nextInt();
            
            switch(s) {
                case 0:
                    System.out.println(toString());
                    break;
                case 1:
                    rest();
                    System.out.println(toString());
                    break;
                case 2:
                    fight();
                    break;
                case 3:
                    System.out.println(name + " has a health of " + health + " and experience " + xp + ".");
                    break outerloop;
                default:
                    System.out.println("Unsupported argument, try again.");
                    break;
            }
            
            if (health > 100) health = 100;
            if (xp < 0) xp = 0;
            
            if (health <= 0) {
                System.out.println(name + " has fainted!");
                break outerloop;
            }
            if (xp >= 100) {
                System.out.println(name + " has evolved!");
                break outerloop;
            }
            
            System.out.println();
        }
    }
    
}
