import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class MaxAmongMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        if (m <= 0) return;
        int n = scanner.nextInt();
        if (n <= 0) return;
        int[][] arr = new int[m][n];
        Random random = new Random();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = random.nextInt(100);
            }
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println(MaxAmongMin.FindMaxAmongMin(arr));
    }

    public static int FindMaxAmongMin(int[][] arr){
        int[] arrMin = new int[arr.length];
        int res;

        for (int i = 0; i < arr.length; i++){
            arrMin[i] = arr[i][0];
            for (int j = 1; j < arr[i].length; j++){
                if (arrMin[i] > arr[i][j]) {
                    arrMin[i] = arr[i][j];
                }
            }
        }
        res = arrMin[0];
        for (int i = 1; i < arrMin.length; i++){
            if (res < arrMin[i]) {
                res = arrMin[i];
            }
        }
        return res;
    }
}
