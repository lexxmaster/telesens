import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayShifting {
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
        ArrayShifting.ShiftCycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void ShiftCycle(int[] arr){
        int t = arr[0];
        for (int i = 0; i < arr.length - 1; i++)
            arr[i] = arr[i + 1];
        arr[arr.length - 1] = t;
    }
}
