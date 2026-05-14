public class Line {
    private Coordinate A;
    private Coordinate B;
    
    public Line(){
        A = new Coordinate();
        B = new Coordinate();
    }
    
    public Line (int x1, int x2, int y1, int y2) {
        A = new Coordinate(x1, y1);
        B = new Coordinate(x2, y2);
    }
    
    public Line(Coordinate A, Coordinate B){
        this.A = A;
        this.B = B;
    }
    
    public String toString(){
        String out = String.format("(%d, %d) -> (%d, %d)", 
            A.getX(), A.getY(), B.getX(), B.getY()
        );
        return out;
    }
    
    public double distance(){
        return Math.sqrt(
            Math.pow(A.getX()-B.getX(), 2) + Math.pow(A.getY()-B.getY(), 2)
        );
    }
    public double findSlope(){
        double slope = 0;
        try{
            slope = (B.getY() - A.getY()) / (B.getX() - A.getX());
        }catch (ArithmeticException e) {
            System.out.println("Slope is undefined (vertical line)");
        }
        return slope;
    }
}
