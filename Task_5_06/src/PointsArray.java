import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Scanner;

public class PointsArray {
    private Point[] arr;

    public int getSize(){
        return arr.length;
    }

    public PointsArray(){
        arr = new Point[0];
    }

    public PointsArray(Point p){
        arr = new Point[1];
        arr[0] = p;
    }

    public PointsArray(int x, int y){
        arr = new Point[1];
        arr[0] = new Point(x, y);
    }

    public void addPoint(Point p){
        Point[] arr2 = new Point[arr.length + 1];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        arr2[arr.length] = p;
        arr = arr2;
    }

    public void addPoint(int x, int y){
        Point[] arr2 = new Point[arr.length + 1];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        arr2[arr.length] = new Point(x, y);
        arr = arr2;
    }

    public Point getPoint(int i){
        if (i >= arr.length) throw new IndexOutOfBoundsException();
        return arr[i];
    }

    public void deleteLastPoint(){
        if (arr.length == 0) return;
        Point[] arr2 = new Point[arr.length - 1];
        if (arr2.length > 0){
            System.arraycopy(arr, 0, arr2, 0, arr2.length);
        }
        arr = arr2;
    }

    public int getLength(){
        return arr.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y,ans;
        ans = 1;
        PointsArray arr = new PointsArray();
        while(ans != 0)  {
            System.out.print("Enter values of point coordinates:");
            x = scanner.nextInt();
            y = scanner.nextInt();
            arr.addPoint(x,y);

            System.out.print("Enter zero to exit:");
            ans = scanner.nextInt();
        }

        System.out.println(arr.getPoint(arr.getLength() - 1));

        while (arr.getLength() > 0){
            arr.deleteLastPoint();
        }

        System.out.println("Size is " + arr.getLength());
    }
}

class Point{
    int x,y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(){
        x = 0;
        y = 0;
    }

    public String toString(){
        return "" + x + ":" + y;
    }
}