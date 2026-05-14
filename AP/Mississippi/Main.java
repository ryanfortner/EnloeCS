import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;

public class Main
{
    private static ArrayList<Character> uniqueLetters(String input) {
        ArrayList<Character> uniqueList = new ArrayList<Character>();
        
        // ascii 65-90
        for (int i = 0; i < input.length(); i++) {
            for (int j = 65; j < 90; j++) {
                if (input.charAt(i) == j) {
                    boolean toAdd = true;
                    for (int k = 0; k < uniqueList.size(); k++) {
                        if (input.charAt(i) == uniqueList.get(k)) toAdd = false;
                    }
                    if (toAdd) {
                        uniqueList.add(input.charAt(i));
                    }
                    
                }
            }
        }
        
        return uniqueList;
    }
    
    private static void sSort(ArrayList<Character> list) {
        for (int j = 0; j < list.size(); j++) {
            int minIndex = j;
            for (int k = j + 1; k < list.size(); k++) {
                if (list.get(k) < list.get(minIndex)) {
                    minIndex = k;
                }
            }
            char temp = list.get(j);
            list.set(j, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
    
    private static int bSearch(ArrayList<Character> list, char target) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target < list.get(middle)) {
                right = middle - 1;
            } else if (target > list.get(middle)) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) throws FileNotFoundException
    {
        File data = new File("data.txt");
        
        Scanner s = new Scanner(data);
        
        while(s.hasNextLine()) {
            String input = s.nextLine();
            
            char target = input.charAt(input.length() - 1);
            target = Character.toUpperCase(target);
            
            input = input.substring(0, input.length() - 2);
            ArrayList<Character> cList = uniqueLetters(input.toUpperCase());
            
            System.out.println("Unsorted " + cList);
            sSort(cList);
            System.out.println("Sorted " + cList);
            
            int pos = bSearch(cList, target);
            
            System.out.println("Target " + target + " at pos " + pos);
        }
        
        s.close();
    }
}
