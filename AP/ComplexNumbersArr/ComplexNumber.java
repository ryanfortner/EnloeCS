public class ComplexNumber {
    
    private double magnitude;
    private double a;
    private double b;
    
    public ComplexNumber(double magnitude, double a, double b) {
        this.magnitude = magnitude;
        this.a = a;
        this.b = b;
    }
    public ComplexNumber(double a, double b) {
        this.magnitude = calcMagnitude(a, b);
        this.a = a;
        this.b = b;
    }
    public ComplexNumber(String i) {
        this.magnitude = calcMagnitudeFromString(i);
        this.a = getAFromString(i);
        this.b = getBFromString(i);
    }
    
    public static double getAFromString(String s) {
        String[] split = s.split(" ");
        
        return Double.parseDouble(split[0]);
    }
    
    public static double getBFromString(String s) {
        String[] split = s.split(" ");
        
        return Double.parseDouble(split[1]);
    }
    
    public static double calcMagnitudeFromString(String s) {
        String[] sSplit = s.split(" ");
        
        return calcMagnitude(
            Double.parseDouble(sSplit[0]), 
            Double.parseDouble(sSplit[1])
        );
    }
    
    public static double calcMagnitude(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    
    public String toString() {
        String n = b < 0 
        ? String.format("%.1f-%.1fi", a, Math.abs(b))
        : String.format("%.1f+%.1fi", a, b);
        
        return n;
    }
    
    public double getMagnitude() {
        return magnitude;
    }
}
