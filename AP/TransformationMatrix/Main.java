public class Main
{
    public static void printArr(int [][] arr){
        for (int [] row : arr){
            for (int item : row){
                System.out.printf("%4d", item);
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args)
    {
        int [][] m1 = {{1,3,1},{2,4,8}};
        int [][] m2 = {{6,8,10,6},{5,4,9,8}};
        int [][] m3 = {{-6,-5,-3,-3,-5},{3,4,4,2,1}};
        
        int [][] m4 = Transforms.dilate(m1,4);
        System.out.println("*** test 1 ***");
        printArr(m4);
        
        int [][] m5 = Transforms.reflect(m2,'x');
        System.out.println("*** test 2 ***");
        printArr(m5);
        
        int [][] m6 = Transforms.rotate(m3,90);
        System.out.println("*** test 2 ***");
        printArr(m6);
        
        
        // // Testing method functionality
        // System.out.println();
        // int[][] test1 = {{2, 3}, {1, 5}};
        // int[][] test2 = {{-4, 3}, {-4, 2}};
        // printArr(Transforms.dilate(test1, 3));
        // printArr(Transforms.reflect(test2, 'x'));
        // printArr(Transforms.reflect(test2, 'y'));
    }
}
