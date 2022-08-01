import static java.lang.Math.*;
public class Point3D {
    private double x,y,z;

    public Point3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(){
        return Math.sqrt(x*x + y*y + z*z);
    }

    public static double distance(Point3D p1, Point3D p2){
        return sqrt(pow((p2.x - p1.x),2) + pow((p2.y - p1.y),2) + pow((p2.z - p1.z),2));
    }

    public static void main(String[] args) {
        Point3D p1 = new Point3D(1,3,1);
        System.out.println(p1.distance());
        Point3D p2 = new Point3D(4,2,3);
        System.out.println(p2.distance());
        System.out.println(distance(p1,p2));
    }
}
