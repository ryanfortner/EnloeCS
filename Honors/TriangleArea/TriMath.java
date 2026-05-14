public class TriMath {
    public static double degreesToRadians(double degrees) {
        return (degrees * Math.PI) / 180;
    }
    
    public static double findArea(double a, double b) {
        return (0.5 * a * b);
    }
    
    public static double findArea(double a, double b, double angleDegrees) {
        return (0.5 * a * b * Math.sin(degreesToRadians(angleDegrees)));
    }
}
