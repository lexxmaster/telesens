import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for(int i = a; i <= b; i++){
            if(PrimeNumbers.isPrime(i)){
                System.out.println(i);
            }
        }
    }


    public static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
