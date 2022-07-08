import java.util.Random;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int n;
        for (int i = 0; i < 10; i++){
            n = random.nextInt(1,92);
            System.out.println(n + "-" + FibonacciNumbers.getFibonacciNumber(n));
        }
    }

    public static long[] fibonacciArray;
    public static int last;
    static {
        fibonacciArray = new long[92];
        fibonacciArray[0] = 1;
        fibonacciArray[1] = 1;
        last = 2;
    }

    public static long getFibonacciNumber(int n){
        if (n < 1 || n > 92) return 0;
        if (n <= last) return fibonacciArray[n - 1];
        for (int i = last - 1; i < n; i++) {
            fibonacciArray[last] = fibonacciArray[last - 1] + fibonacciArray[last - 2];
            last++;
        }
        return fibonacciArray[n - 1];
    }
}
