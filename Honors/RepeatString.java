public class RepeatString
{
    public static String repeater(String s, int x) {
        if (s.length() < 1 || x >= s.length()) {
            return "ERROR";
        }
        
        String output = "";
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                output += s.charAt(j);
            }
        }
        
        return output;
    }
    
    public static void main(String[] args)
    {
        System.out.println(repeater("doghouse", 3));
        System.out.println(repeater("computer", 2));
        System.out.println(repeater("Wither", 4));
        System.out.println(repeater("Computer", 3));
    }
}
