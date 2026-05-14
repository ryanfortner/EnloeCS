import java.util.ArrayList;

public class ALUtil {
    public static boolean push(ArrayList<ComplexNum> list, ComplexNum node) {
        return list.add(node);
    } 
    
    // Stacks are last in, first out
    public static ComplexNum popS(ArrayList<ComplexNum> list) {
        ComplexNum node = list.get(list.size() - 1);
        
        list.remove(list.size() - 1);
        
        return node;
    }
    
    // Queues are first in, first out
    public static ComplexNum popQ(ArrayList<ComplexNum> list) {
        ComplexNum node = list.get(0);
        
        list.remove(0);
        
        return node;
    }
    
    public static void reverse(ArrayList<ComplexNum> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.remove(list.size() - 1));
        }
    }
}
