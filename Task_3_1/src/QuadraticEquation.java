public class QuadraticEquation {
    double a;
    double b;
    double c;

    // ax^2 + bx + c = 0
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation(double a, double b){
        this.a = a;
        this.b = b;
        this.c = 0;
    }

    public QuadraticEquation(double a){
        if (a == 0){
            System.out.println("\"a\" can't be zero");
            throw new ArithmeticException();
        }
        this.a = a;
        this.b = 0;
        this.c = 0;
    }

    public double[] getSolve(){
        double[] solve = new double[2];
        double d = calcD();
        if (d < 0){
            System.out.println("Equation hasn't solve in real numbers");
            throw new ArithmeticException();
        }

        solve[0] = (-b + Math.sqrt(d))/(2 * a);
        solve[1] = (-b - Math.sqrt(d))/(2 * a);

        return solve;
    }

    private double calcD(){
        double d = 0;
        d = Math.pow(b, 2) - 4 * a * c;
        return d;
    }
}
