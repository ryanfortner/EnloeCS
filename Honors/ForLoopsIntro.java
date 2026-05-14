//for loops introduction

public class ForLoopsIntro
{
    public static void main(String[] args)
    {
        /*
        why: to repeat code
        the for loop has three parts, separated by semicolons
            1) initializer: gives a starting value to the loop variable
            2) condition: must be true for the loop to repeat
            3) changer (iterator/change): changes the loop variable in some way
        */
        
        //example 1:
            //intializer: the loop variable i will start with a value of 0
            //condition: the loop will repeat if i < 10
            //changer: the loop variable will increment each time the loop runs 
        //explore/change/play with this code
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        
        //traversing strings
        
        String word = "with any string";
        int len = word.length();
        
        for(int i = 0; i < len; i++){
            System.out.println("index " + i + ": ");
            System.out.println(word.substring(i, i + 1));
        }
        
        /* While loops have the same three parts, they're just in different places
        While and for loops are always interchangeable
        The syntax is different, so some would prefer to use a while loop when they don't know when the loop will end
        */
        
        // initializer: place it before the while loop
        int i = 0;
        // condition
        while (i < 10) {
            System.out.println(i);
            // changer: has to be in the while loop, typically at the end
            i++;
        }
    }
}
