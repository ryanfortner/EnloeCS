public class Shape {
    private Coordinate s1;
    private Coordinate s2;
    private Coordinate s3;
    public Shape(){
        s1 = null;
        s2 = null;
        s3 = null;
    }
    public Shape(Coordinate s1, Coordinate s2, Coordinate s3){
        this.s1=s1;
        this.s2 = s2;
        this.s3=s3;
    }
    
    public static double distance(int x1, int y1, int x2, int y2){
        double dis = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        return dis;
    }
    public static double distance(Coordinate a, Coordinate b){
        double dis = Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(),2));
        return dis;
    }
    
    public double perimeter(){
        return 0;
    }
}
