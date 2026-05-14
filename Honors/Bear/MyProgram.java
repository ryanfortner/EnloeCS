/* Mr. Shaw
 * April 8th 2024
 * Commenting Activity
 Find and label the following vocabulary in the bear class:
 
 class name
 Access modifier
 instance variables - include definition
 state
 static variable
 constructor - include definition
 default constructor 
 behavior
 Accessor methods
 Mutator methods
 
 Find and label the following in the MyProgram runner class:
 
 Creating an object
 Calling a static variable
 Calling a public non-static method
 */
public class MyProgram
{
    public static void main(String[] args)
    {
        // Creating an object
        Bear b1 = new Bear(69, 420, "Brown", "Polar Bear");
        Bear b2 = new Bear(60, 400, "Black", "Panda");
        
        System.out.println(b1.height);
        System.out.println(b2.height);
        //System.out.println(b1.weight);
        System.out.println(b1.furColor);
        
        System.out.println(Bear.count);
        
        System.out.println(b1.getWeight());
        b1.eatFood();
        System.out.println(b1.getWeight());
        b1.poop();
        System.out.println(b1.getWeight());
        
        System.out.println(b1);
        
        Bear b3 = new Bear();
        System.out.println(b3);
    }
}
