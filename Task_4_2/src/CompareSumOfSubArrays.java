import java.util.Random;
import java.util.Scanner;

public class CompareSumOfSubArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size <= 0) return;
        int k = scanner.nextInt();
        if (k <= 0 || size <= k) return;
        Random random = new Random();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) arr[i] = random.nextInt();

        System.out.println(CompareSumOfSubArrays.CalcSumAndCompare(arr, k));
    }

    public static boolean CalcSumAndCompare(int[] arr, int k){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++){
            if (i <= k){
                sum1 += arr[i];
            }else {
                sum2 += arr[i];
            }
        }
        System.out.println("Sum of 0..k elements: " + sum1);
        System.out.println("Sum of k+1..N elements: " + sum2);
        if (sum1 > sum2){
            return true;
        } else {
            return false;
        }
    }
}
