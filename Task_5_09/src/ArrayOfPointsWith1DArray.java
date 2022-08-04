public class ArrayOfPointsWith1DArray extends AbstractArrayOfPoints{
    double[] xy;

    public ArrayOfPointsWith1DArray(){
        xy = new double[0];
    }

    @Override
    public void setPoint(int i, double x, double y) {
        if (i < count()) {
            xy[i * 2] = x;
            xy[i * 2 + 1] = y;
        }
    }

    @Override
    public double getX(int i) {
        if (i < count()) {
            return xy[i * 2];
        }
        return 0;
    }

    @Override
    public double getY(int i) {
        if (i < count()) {
            return xy[i * 2 + 1];
        }
        return 0;
    }

    @Override
    public int count() {
        return xy.length/2;
    }

    @Override
    public void addPoint(double x, double y) {
        double[] temp = new double[xy.length + 2];

        for (int i = 0; i < xy.length; i++){
            temp[i] = xy[i];
        }

        temp[xy.length] = x;
        temp[xy.length + 1] = y;

        xy = temp;
    }

    @Override
    public void removeLast() {
        if (xy.length == 0){
            System.out.println("Array is empty.");
            return;
        }
        double[] temp = new double[xy.length - 2];
        for (int i = 0; i < temp.length; i++){
            temp[i] = xy[i];
        }

        xy = temp;
    }

    @Override
    public void sortByX(){
        for (int i = 1; i < this.count(); i++) {
            for (int j = i; j > 0; j--) {
                if (getX(j) < getX(j - 1)) {
                    double x = getX(j);
                    double y = getY(j);

                    setPoint(j, getX(j - 1), getY(j - 1));

                    setPoint(j - 1, x, y);
                } else break;
            }
        }
    }

    public static void main(String[] args) {
        new ArrayOfPointsWith1DArray().test();
    }
}
