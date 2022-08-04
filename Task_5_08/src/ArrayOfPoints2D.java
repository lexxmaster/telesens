import java.util.Arrays;

public class ArrayOfPoints2D extends AbstractArrayOfPoints{
    private double[][] xy;

    public ArrayOfPoints2D(){
        xy = new double[0][2];
    }

    @Override
    public void setPoint(int i, double x, double y) {
        if (i < count()) {
            xy[i][0] = x;
            xy[i][1] = y;
        }
    }

    @Override
    public double getX(int i) {
        if (i < count()) {
            return xy[i][0];
        } else {
            return 0;
        }
    }

    @Override
    public double getY(int i) {
        if (i < count()) {
            return xy[i][1];
        } else {
            return 0;
        }
    }

    @Override
    public int count() {
        return xy.length;
    }

    @Override
    public void addPoint(double x, double y) {
        double[][] temp = new double[xy.length + 1][2];
        for (int i = 0; i < xy.length; i++){
            temp[i][0] = xy[i][0];
            temp[i][1] = xy[i][1];
        }
        temp[xy.length][0] = x;
        temp[xy.length][1] = y;

        xy = temp;
    }

    @Override
    public void removeLast() {
        if (xy.length == 0){
            System.out.println("Array is empty.");
            return;
        }
        double[][] temp = new double[xy.length - 1][2];
        for (int i = 0; i < temp.length; i++){
            temp[i][0] = xy[i][0];
            temp[i][1] = xy[i][1];
        }

        xy = temp;
    }

    public static void main(String[] args) {
        new ArrayOfPoints2D().test();
    }
}
