import java.util.*;

public class LetterFinder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter a word:\n");
        String word = input.next();
        System.out.printf("Enter a letter:\n");
        String letter = input.next();
        
        word = word.toLowerCase();
        letter = letter.toLowerCase();
        
        if (word.indexOf(letter) == -1) {
            System.out.printf("Error: this letter is not present in this word.\n");
            System.exit(1);
        }

        if (word.indexOf(letter) > word.length() / 2) {
            System.out.printf("The first appearance of %s is in the second half of %s\n", letter, word);
        } else if (word.indexOf(letter) == word.length() / 2) {
            System.out.printf("The first appearance of %s is in the middle of %s\n", letter, word);
        } else {
            System.out.printf("The first appearance of %s is in the first half of %s\n", letter, word);
        }
    }
}
