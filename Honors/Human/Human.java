public class Human {
    private double height;
    private double weight;
    private int age;
    private String name;
    
    public Human(String name, double height, double weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public int getAge() {
        return age;
    }
    
    public void addOneYear() {
        age++;
    }
    
    public void loseTenPounds() {
        weight -= 10;
    }
    
    public String toString() {
        return (name + " is " + weight + " lbs, " + height + " inches tall, and " + age + " years old.");
    }
}
