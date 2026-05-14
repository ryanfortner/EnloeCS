import java.util.Scanner;
import java.util.Random;

public class Superhero {
    private static int numSuperheroes = 0;
    
    private int health = 100;
    private String name;
    private String superpower;
    private String weakness;
    
    public Superhero(String name, String superpower, String weakness) {
        numSuperheroes++;
        
        this.name = name;
        this.superpower = superpower;
        this.weakness = weakness;
        
        System.out.println(name + " has been created. His superpower is " + superpower + " and his weakness is " + weakness + ".");
    }
    
    public String getName() {
        return name;
    }
    
    public String getSuperPower() {
        return superpower;
    }
    
    public String getWeakness() {
        return weakness;
    }
    
    public int getHealth() {
        return health;
    }
    
    public static int getNumSuperheroes() {
        return numSuperheroes;
    }
    
    public String toString() {
        return (name + " has " + health + " health.");
    }
    
    public void sleep() {
        System.out.println(name + " slept overnight. +5 health");
        health += 5;
    }
    
    public void battle() {
        Random rand = new Random();
        int randomNum = rand.nextInt(2);
        if (randomNum == 0) {
            System.out.println(name + " lost: -10 health");
            health -= 10;
        } else if (randomNum == 1) {
            System.out.println(name + " won: +10 health");
            health += 10;
        }
        
    }
    
    public void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("[Playing for " + name + "]");
        System.out.println("Options");
        System.out.println("1: Display Stats");
        System.out.println("2: Battle");
        System.out.println("3: Sleep");
        System.out.println("4: Exit");
        outerloop: while (true) {
            if (health <= 0) {
                System.out.println(name + " is dead (0 health).");
            } else if (health > 100) {
                health = 100;
            }
            
            int x = input.nextInt();
            switch(x) {
                case 1:
                    System.out.println(toString());
                    break;
                
                case 2:
                    if (numSuperheroes == 1) {
                        System.out.println("There is no one to battle...");
                        break;
                    }
                    battle();
                    break;
                    
                case 3:
                    System.out.println(name + " is sleeping...");
                    sleep();
                    break;
                    
                case 4:
                    System.out.println("Exiting...");
                    break outerloop;
                
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
