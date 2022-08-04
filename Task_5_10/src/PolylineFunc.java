public class PolylineFunc extends  FindMinOfFunction{
    double a, b, c;

    public PolylineFunc(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double calculateValueOfFunction(double x) {
        return a * x * x - b * x + c;
    }

    public static void main(String[] args) {
        PolylineFunc fx = new PolylineFunc(5, -7, 3);
        System.out.println(fx.findMin(-10, 10, 0.01));
    }
}
