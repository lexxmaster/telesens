import static java.lang.Math.*;

public class QuadraticEquation {
    private double a,b,c,x1,x2;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean solve(){
        double d = calcD();
        if (d < 0) {
            return false;
        }

        x1 = (-b + sqrt(d))/2;
        x2 = (-b - sqrt(d))/2;

        return true;
    }

    private double calcD(){
        return b * b - 4 * a * c;
    }

    public String toString(){
        return a + "x^2" + (b < 0? "": "+") + b + (c < 0? "": "+") + c + " solve: x1 = " + x1 + " x2 = " + x2;
    }

    public static void main(String[] args) {
        QuadraticEquation equat1 = new QuadraticEquation(2,5,-4);
        if (equat1.solve()){
            System.out.println(equat1);
        }else {
            System.out.println("There is no solution");
        }
    }
}
