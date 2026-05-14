public class MyProgram
{
    public static void main(String[] args)
    {
        Coordinate s1 = new Coordinate(0, 0);
        Coordinate s2 = new Coordinate(0, 3);
        Coordinate s3 = new Coordinate(4, 0);
        
        Triangle tri = new Triangle(s1, s2, s3);
        
        System.out.println(tri.getPerimeter());
        System.out.println(tri.getArea());
        tri.printInfo();
    }
}
