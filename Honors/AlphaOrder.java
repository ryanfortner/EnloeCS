import java.util.Scanner;

public class AlphaOrder
{
    public static void main(String[] args)
    {
        // create scanner object
        Scanner input = new Scanner(System.in);
        
        // read in two words from user
        System.out.printf("Enter two words which only contain letters.\n");
        String word1 = input.next();
        String word2 = input.next();
        
        // check if words contain numbers
        if (word1.matches(".*\\d.*") || word2.matches(".*\\d.*")) {
            System.out.printf("Error: one or more of the words you entered contains a number.\n");
            System.exit(1);
        }
        
        // change each word to lowercase
        word1 = word1.toLowerCase(); 
        word2 = word2.toLowerCase();
        
        // determine alphabetical order of words
        if (word1.equals(word2)) {
            System.out.printf("The given words are the same.\n");
            System.exit(0);
        } else if (word1.compareTo(word2) > 0) {
            System.out.printf("The ordered words are: %s %s\n", word2, word1);
        } else {
            System.out.printf("The ordered words are: %s %s\n", word1, word2);
        }
        
        // generate code word
        String codeword = word2.substring(0, word2.length() / 2) + word1.substring(word1.length() / 2, word1.length());
        System.out.printf("The code word is: %s\n", codeword);
    }
}
