import java.util.ArrayList;

public class MyProgram
{
    
    private static String flames(String x1, String x2) {
        x1 = x1.toUpperCase();
        x2 = x2.toUpperCase();
        
        String name1 = "";
        String name2 = "";
        
        // Remove characters found in both strings
        for (int i = 0; i < x1.length(); i++) {
            if (!x2.contains(x1.substring(i, i+1))) {
                name1 += x1.substring(i, i+1);
            }
        }
        
        for (int i = 0; i < x2.length(); i++) {
            if (!x1.contains(x2.substring(i, i+1))) {
                name2 += x2.substring(i, i+1);
            }
        }
        
        // Convert both to ArrayLists
        ArrayList<Character> n1List = new ArrayList<Character>();
        ArrayList<Character> n2List = new ArrayList<Character>();

        for (int i = 0; i < name1.length(); i++) {
            n1List.add(name1.charAt(i));
        }
        
        for (int i = 0; i < name2.length(); i++) {
            n2List.add(name2.charAt(i));
        }
        
        // Total number of remaining letters
        int n = n1List.size() + n2List.size();
        
        String f = "FLAMES";
        ArrayList<Character> flames = new ArrayList<Character>();
        for (int i = 0; i < f.length(); i++) {
            flames.add(f.charAt(i));
        }
        
        int index = 0;
        int counter = 1;
        while (flames.size() > 1) {
            
            if (counter == n) {
                counter = 1;
                flames.remove(index);
                index--;
            } else {
                counter++;
            }
            
            index++;
            if (index >= flames.size()) {
                index = 0;
            }
            
        }


        String result = "The future relationship between " + name1 + " and " + name2 + " is ";
        
        if (flames.get(0) == 'F') {
            result += "Friendship.";
        } else if (flames.get(0) == 'L') {
            result += "Lovers.";
        } else if (flames.get(0) == 'A') {
            result += "Affectionate.";
        } else if (flames.get(0) == 'M') {
            result += "Marriage.";
        } else if (flames.get(0) == 'E') {
            result += "Enemies.";
        } else {
            result += "Seeing each other.";
        }
        return result;
        
    }
    
    public static void main(String[] args)
    {
        System.out.println(flames("ROHAN", "LENNA"));
    }
}
