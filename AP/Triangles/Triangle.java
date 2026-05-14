public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    
    private double perimeter;
    private double area;
    
    public Triangle() {
        super();
        perimeter = 0;
        area = 0;
    }
    
    public Triangle(Coordinate s1, Coordinate s2, Coordinate s3) {
        super(s1, s2, s3);
        
        // Store the three values from the calculation of the 3 sides
        side1 = Shape.distance(s1, s2);
        side2 = Shape.distance(s2, s3);
        side3 = Shape.distance(s3, s1);
        
        // Store the value from the calculation of the perimeter
        perimeter = perimeter(side1, side2, side3);
        
        // Store the value from the calculation of the area
        area = heronsFormula(side1, side2, side3);

    }
    
    public double perimeter(double a, double b, double c) {
        return a + b + c;
    }
    
    public double heronsFormula(double a, double b, double c) {
        double s = perimeter(a, b, c) / 2.0;
        
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    public double getPerimeter() {
        return perimeter;
    }
    
    public double getArea() {
        return area;
    }
    
    public void printInfo() {
        System.out.print("Area: " + area + ", ");
        System.out.println("Perimeter: " + perimeter);
        System.out.print("Side 1: " + side1 + ", Side 2: " + side2 + ", Side 3: " + side3);
    }
}
