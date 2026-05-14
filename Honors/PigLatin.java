import java.util.Scanner;

public class PigLatin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter a word: \n");
        String word = input.next();

        word = word.toLowerCase();

        if (!(word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u')) {
            if (!(word.charAt(1) == 'a' || word.charAt(1) == 'e' || word.charAt(1) == 'i' || word.charAt(1) == 'o' || word.charAt(1) == 'u')) {
                if (!(word.charAt(2) == 'a' || word.charAt(2) == 'e' || word.charAt(2) == 'i' || word.charAt(2) == 'o' || word.charAt(2) == 'u')) {
                    String output = word.substring(3, word.length()) + word.charAt(0) + word.charAt(1) + word.charAt(2) + "ay";
                    System.out.printf("%s -> %s\n", word, output);
                } else {
                    String output = word.substring(2, word.length()) + word.charAt(0) + word.charAt(1) + "ay";
                    System.out.printf("%s -> %s\n", word, output);
                }
            } else {
                String output = word.substring(1, word.length()) + word.charAt(0) + "ay";
                System.out.printf("%s -> %s\n", word, output);
            }
        } else {
            String output = word + "yay";
            System.out.printf("%s -> %s\n", word, output);
        }
    }
}
