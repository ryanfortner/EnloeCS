public class ShapeOperations {
    public static double triangleArea(double a, double b, double c) {
        double s = findPerimeter(a, b, c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    public static double rectangleArea(double a, double b) {
        return a * b;
    }
    
    public static double findPerimeter(double a, double b, double c) {
        return a + b + c;
    }
    
    public static double findPerimeter(double a, double b) {
        return (2 * a) + (2 * b);
    }
}
