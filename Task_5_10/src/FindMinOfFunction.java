public abstract class FindMinOfFunction {
    public abstract double calculateValueOfFunction(double x);

    public double findMin(double x1, double x2, double step){
        double min = calculateValueOfFunction(x1);
        for (int i = 0; x1 + step * i <= x2; i++) {
            double y = calculateValueOfFunction(x1 + step * i);
            if (y < min) {
                min = y;
            }
        }

        return min;
    }
}
