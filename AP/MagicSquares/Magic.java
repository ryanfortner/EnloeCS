public class Magic {
    
    public static boolean isItMagic(int[][] arr) {
        // Get initial row sum for comparison
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[0][i];
        }

        int sideLength = arr.length;
        int minorDiagonal = 0;
        int majorDiagonal = 0;
        for (int i = 0; i < sideLength; i++) {
            int row = 0;
            int column = 0;
            for (int j = 0; j < sideLength; j++) {
                row += arr[i][j];
                column += arr[j][i];
            }
            
            majorDiagonal += arr[i][sideLength - i - 1];
            minorDiagonal += arr[sideLength - i - 1][i];
            
            if (column != sum || row != sum) return false;
        }
        
        if (majorDiagonal != sum || minorDiagonal != sum) return false;
        
        return true;
    }
    
}
