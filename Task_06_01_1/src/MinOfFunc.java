public class MinOfFunc {
    public double function(double x){
        return 3 * x * x - 4 * x + 5;
    }
    public static void main(String[] args) {
        MinOfFunc myFunc = new MinOfFunc();

        Min minFounf = myFunc.new Min(-5.0, 5.0, 0.1);
        System.out.println(minFounf.findMin());
    }

    class Min{
        double left, right, step;
        public Min(double left, double right, double step){
            this.left = left;
            this.right = right;
            this.step = step;
        }
        public double findMin(){
            double min = function(left);
            for (int i = 1; left + i * step <= right; i++) {
                double y = function(left + i * step);
                if (y < min) {
                    min = y;
                }
            }
            return min;
        }
    }
}
