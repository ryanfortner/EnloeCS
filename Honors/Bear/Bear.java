/* Mr. Shaw
 * April 8th 2024
 * Commenting Activity
 Find and label the following vocabulary in the bear class:
 
 -class name
 -Access modifier
 -instance variables - include definition
 -state
 -static variable
 -constructor - include definition
 -default constructor 
 behavior
 -Accessor methods
 Mutator methods
 
 Find and label the following in the MyProgram runner class:
 
 Creating an object
 Calling a static variable
 Calling a public non-static method
 */

public class Bear { // Bear: name of class
    public double height;
    private double weight; // private instance variable: cannot be accessed outside the class
    public String furColor; // public instance variable: can be used by other programs
    public String type;
    
    public static int count; // static variable
    
    public Bear(double h, double w, String f, String t){ // constructor: called when creating an object
        height = h;
        weight = w;
        furColor = f;
        if(furColor.equals("brown")){
            type = "brown";
        }
        //type = t;
        
        count++;
    }
    
    public Bear(){ // default constructor
        height = 0; // state
        weight = 0;
        furColor = "clear";
        type = "ugly";
        
        count++;
    }
    
    // behavior
    
    public double getHeight(){ // accessor method
        return height;
    }
    public double getWeight(){ // access modifier: public
        return weight;
    }
    public String getFurColor(){
        return furColor;
    }
    public String getType(){
        return type;
    }

    public void eatFood(){ // mutator method
        weight += 10;
    }
    public void poop(){
        weight -= 5;
    }

    public void setWeight(double x){
        weight = x;
    }
    
    public String toString(){
        String output = "A " + furColor + " " + type + " who weighs " + weight + " pounds and is " + height + " inches tall.";
        return output;
        }
}
