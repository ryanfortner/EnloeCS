import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What shape are you looking at?");
        System.out.printf("0 = triangle\n1 = parallelogram\n2 = rectangle\n3 = square\n");
        int selector = s.nextInt();
        
        double a, b, c;
        switch(selector) {
            case 0:
                System.out.println("Enter the side lengths of your triangle:");
                a = s.nextDouble();
                b = s.nextDouble();
                c = s.nextDouble();
                System.out.printf("Perimeter: " + ShapeOperations.findPerimeter(a, b, c));
                System.out.printf("Area: %.2f\n", ShapeOperations.triangleArea(a, b, c));
                break;
            case 1:
                System.out.println("Enter base, side length, and height of parallelogram:");
                a = s.nextDouble();
                b = s.nextDouble();
                c = s.nextDouble();
                System.out.println("Perimeter: " + ShapeOperations.findPerimeter(a, c));
                System.out.printf("Area: %.2f\n", ShapeOperations.rectangleArea(a, c));
                break;
            case 2:
                System.out.println("Enter sides of the rectangle:");
                a = s.nextDouble();
                b = s.nextDouble();
                System.out.println("Perimeter: " + ShapeOperations.findPerimeter(a, b));
                System.out.println("Area: " + ShapeOperations.rectangleArea(a, b));
                break;
            case 3:
                System.out.println("Enter square side length:");
                a = s.nextDouble();
                System.out.println("Perimeter: " + ShapeOperations.findPerimeter(a, a));
                System.out.println("Area: " + ShapeOperations.rectangleArea(a, a));
                break;
        }
    }
}
