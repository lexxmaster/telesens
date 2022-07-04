import java.util.Scanner;

public class FibonacсiNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(FibonacсiNum.CalcFibonacciCycle(n));

        System.out.println(FibonacсiNum.CalcFibonacciRec(n));
    }

    public static int CalcFibonacciCycle(int n){
        if(n == 0) return 0;
        int prevFib = 0;
        int newFib = 1;
        int temp = 0;
        for(int i = 2; i <=n; i++){
            temp = newFib + prevFib;
            prevFib = newFib;
            newFib = temp;
        }
        return newFib;
    }

    public static int CalcFibonacciRec(int n){
        if(n <= 2) return 1;
        return (FibonacсiNum.CalcFibonacciRec(n-1) + FibonacсiNum.CalcFibonacciRec(n - 2));
    }
}
