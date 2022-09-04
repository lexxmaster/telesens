interface MinSearch{
    double findMin(double left, double right, double step);
};

public class MinOfFunc {
    public static double function(double x){
        return 3 * x * x - 4 * x + 5;
    }

    public static void main(String[] args) {

        MinSearch findM = (left, right, step) ->{
            double min = function(left);
            for (int i = 1; left + i * step <= right; i++) {
                double y = function(left + i * step);
                if (y < min) {
                    min = y;
                }
            }
            return min;
        };

        System.out.println(findM.findMin(-5.0,5.0,0.1));
    }


}
