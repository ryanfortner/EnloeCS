import java.util.*;

public class StringSearch
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Please input a string.\n");
        String s = input.nextLine();
        System.out.printf("Please input first character\n");
        char c1 = input.next().charAt(0);
        System.out.printf("Please input second character.\n");
        char c2 = input.next().charAt(0);
        
        if (s.indexOf(c1) == -1 || s.indexOf(c2) == -1) {
            System.out.printf("This program cannot run.\n");
            System.exit(1);
        }
        
        System.out.printf("The first character \'%c\' is located at position %d\n", c1, s.indexOf(c1));
        System.out.printf("The second character \'%c\' is located at position %d\n", c2, s.indexOf(c2));
        
        if (s.indexOf(c1) > s.indexOf(c2)) {
            System.out.printf("\'%c\' does NOT come before \'%c\'\n", c1, c2);
        } else {
            System.out.printf("\'%c\' comes before \'%c\'\n", c1, c2);
        }
        
        System.out.printf("\'%c\' + \'%c\' is %d\n", c1, c2, s.indexOf(c1) + s.indexOf(c2));
        
        System.out.printf("The length of the string is %d\n", s.length());
        
        if(s.length() < s.indexOf(c1) + s.indexOf(c2)) {
            System.out.printf("I cannot output letter number %d since the length is %d\n", s.indexOf(c1) + s.indexOf(c2), s.length());
        } else {
            System.out.printf("The character at %d is \'%c\'\n", s.indexOf(c1) + s.indexOf(c2), s.charAt(s.indexOf(c1) + s.indexOf(c2)));
        }
    }
}
