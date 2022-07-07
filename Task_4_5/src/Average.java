import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) return;
        int[] arr = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Average.calcAverage(arr));
    }

    public static double calcAverage(int[] arr){
        int sum = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i += 2){
            if (arr[i] % 2 == 0) {
                count++;
                sum += arr[i];
            }
        }
        if (count == 0) {
            return 0;
        }

        return (double) sum/count;
    }
}
