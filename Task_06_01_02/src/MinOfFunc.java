interface MinSearch{
    double findMin(double left, double right, double step);
};

public class MinOfFunc {
    public double function(double x){
        return 3 * x * x - 4 * x + 5;
    }

    public double findMin(double left, double right, double step){

        MinSearch min = new MinSearch() {
            @Override
            public double findMin(double left, double right, double step) {
                double min = function(left);
                for (int i = 1; left + i * step <= right; i++) {
                    double y = function(left + i * step);
                    if (y < min) {
                        min = y;
                    }
                }
                return min;
            }
        };

        return min.findMin(left, right, step);
    }
    public static void main(String[] args) {
        MinOfFunc myFunc = new MinOfFunc();

        System.out.println(myFunc.findMin(-5.0, 5.0,0.1));
    }


}
