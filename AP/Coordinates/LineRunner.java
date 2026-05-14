import java.util.Scanner;

public class LineRunner {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first coordinate (x1, y1)");
        String firstCoordinateStr = input.nextLine();
        
        System.out.println("Enter second coordinate (x2, y2)");
        String secondCoordinateStr = input.nextLine();
        
        firstCoordinateStr = firstCoordinateStr.replaceAll("[()]", "");
        secondCoordinateStr = secondCoordinateStr.replaceAll("[()]", "");
        String[] first = firstCoordinateStr.split(",");
        String[] second = secondCoordinateStr.split(",");
        
        Line newLine = new Line(
            new Coordinate(Integer.parseInt(first[0].trim()), Integer.parseInt(first[1].trim())),
            new Coordinate(Integer.parseInt(second[0].trim()), Integer.parseInt(second[1].trim()))
        );
        
        System.out.println("Line: " + newLine.toString());
        System.out.println("Distance: " + newLine.distance());
        System.out.println("Slope: " + newLine.findSlope());
    }
}
