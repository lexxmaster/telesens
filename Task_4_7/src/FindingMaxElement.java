import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class FindingMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = scanner.nextInt();
        if (m <= 0) return;
        int n = scanner.nextInt();
        if (n <= 0) return;
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = random.nextInt(-100,100);
            }
        }

        for (int i = 0; i < m; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println(FindingMaxElement.findAbsMax(arr));
    }

    public static int findAbsMax(int[][] arr){
        int max = Math.abs(arr[0][0]);
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if (max < Math.abs(arr[i][j])) max = Math.abs(arr[i][j]);
            }
        }
        return max;
    }
}
