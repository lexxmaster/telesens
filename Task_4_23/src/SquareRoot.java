import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        double x = scanner.nextDouble();
        System.out.print("Enter accuracy: ");
        eps = scanner.nextDouble();

        System.out.println(calcSquareRoot(x));
    }

    static double eps;

    public static double calcSquareRoot(double x){
        double solve = 1;
        return calcSquareRoot(x, solve);
    }

    public static double calcSquareRoot(double x, double prevSolve){
        double newSolve = (prevSolve + x/prevSolve)/2;
        if (Math.abs(newSolve - prevSolve) < eps) {
            return newSolve;
        } else {
            return calcSquareRoot(x, newSolve);
        }
    }
}
