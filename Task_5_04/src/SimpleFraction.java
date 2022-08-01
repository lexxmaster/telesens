import java.util.Scanner;

public class SimpleFraction {
    private int numerator, denominator;

    public SimpleFraction(int n, int d){
        numerator = n;
        denominator = d;
    }

    public String toString(){
        return numerator + "/" + denominator;
    }

    public static SimpleFraction multiply(SimpleFraction a, SimpleFraction b){
        int num = a.numerator * b.numerator;
        int den = a.denominator * b.denominator;

        int gcd = GreatestCommonDivisor.findGCD(num, den);
        if (gcd > 1) {
            num = num/gcd;
            den = den/gcd;
        }

        return new SimpleFraction(num, den);
    }

    public void pown(int n){
        numerator = (int) Math.pow(numerator, n);
        denominator = (int) Math.pow(denominator, n);

        int gcd = GreatestCommonDivisor.findGCD(numerator, denominator);
        if (gcd > 1) {
            numerator = numerator/gcd;
            denominator = denominator/gcd;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num/denom:");
        int n = scanner.nextInt();
        int d = scanner.nextInt();

        SimpleFraction fract1 = new SimpleFraction(n, d);

        System.out.println("Enter second num/denom:");
        n = scanner.nextInt();
        d = scanner.nextInt();
        SimpleFraction fract2 = new SimpleFraction(n, d);

        System.out.println("Enter number of power");
        int p = scanner.nextInt();

        System.out.println(fract1);
        System.out.println(fract2);
        System.out.println("a * b = " + multiply(fract1, fract2));
        fract1.pown(p);
        System.out.println("a * b = " + fract1);
    }
}
