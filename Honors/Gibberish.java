import java.util.*;

public class Gibberish
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Please enter two words separated by a space.\n");
        String word1 = input.next();
        String word2 = input.next();
        
        String output = word1.substring(0, (word1.length() / 2)) + word2 + word1.substring(word1.length() / 2);
        System.out.println(output);
    }
}
