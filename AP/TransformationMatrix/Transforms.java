public class Transforms {
    
    private static class Constants {
        final static int[][] xAxisReflection = {{1, 0},{0, -1}};
        final static int[][] yAxisReflection = {{-1, 0},{0, 1}};
        
        final static int[][] rotate90Degrees = {{0, -1}, {1, 0}};
        final static int[][] rotate180Degrees = {{-1, 0}, {0, -1}};
        final static int[][] rotate270Degrees = {{0, 1}, {-1, 0}};
    }
    
    // Multiply two matrices, a first
    public static int[][] mMultiply(int[][] a, int[][] b) {
        // Check for compatible dimensions
        if (a[0].length == b.length) {
            int[][] product = new int[a.length][b[0].length];
            
            for (int i = 0; i < product.length; i++) {
                for (int j = 0; j < product[0].length; j++) {
                    // Row i on A, column j on B
                    for (int k = 0; k < product.length; k++) {
                        product[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            
            return product;
        }
        return a; // if dimensions incompatible
    }
    
    // Dilate: multiply all coordinates by a scalar k
    public static int[][] dilate(int[][] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] *= k;
            }
        }
        return arr;
    }
    
    // Reflect over x or y axis
    public static int[][] reflect(int[][] arr, char plane) {
        switch(plane) {
            case 'x': {
                return mMultiply(Constants.xAxisReflection, arr);
            }
            case 'y': {
                return mMultiply(Constants.yAxisReflection, arr);
            }
            default: {
                return arr;
            }
        }
    }
    
    // Rotate counterclockwise about the origin (90 degree increments only)
    public static int[][] rotate(int[][] arr, int angle) {
        switch(angle) {
            case 90: {
                return mMultiply(Constants.rotate90Degrees, arr);
            }
            case 180: {
                return mMultiply(Constants.rotate180Degrees, arr);
            }
            case 270: {
                return mMultiply(Constants.rotate270Degrees, arr);
            }
            case 0:
            case 360:
            default: {
                return arr;
            }
        }
    }
    
    
}
