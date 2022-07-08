import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) return;
        int[] arr = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }

        SelectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minI = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[minI] > arr[j]) {
                    minI = j;
                }
            }
            if (minI != i) {
                int t = arr[minI];
                arr[minI] = arr[i];
                arr[i] = t;
            }
        }
    }
}
