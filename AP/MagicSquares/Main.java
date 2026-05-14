public class Main
{
    public static void main(String[] args)
    {
        int [][] sq1 = {{2,9,4}, {7,5,3},{6,1,8}};
        int [][] sq2 = {{13, 8, 12, 1}, {2,11,7,14},{3,10,6,15},{16,5,9,4}};
        int [][] sq3 = {{51, 72,3,24,45},{69,15,21,42,48},{12,18,39,60,66}, {30,36,57,63,9},{33,54,75,6,27}};
        
        int [][] sq4 = {{2,8,4}, {17,5,3},{6,10,8}};
        int [][] sq5 = {{13, 5, 12, 2}, {8,11,7,14},{7,10,6,2},{16,5,9,4}};
        int [][] sq6 = {{51, 72,3,24,45},{6,15,21,42,48},{12,1,39,60,66}, {3,6,57,63,9},{33,54,7,6,27}};
        
        System.out.println("1. " + Magic.isItMagic(sq1));
        System.out.println("2. " + Magic.isItMagic(sq2));
        System.out.println("3. " + Magic.isItMagic(sq3));       
        System.out.println("4. " + Magic.isItMagic(sq4));
        System.out.println("5. " + Magic.isItMagic(sq5));
        System.out.println("6. " + Magic.isItMagic(sq6));

    }
}
