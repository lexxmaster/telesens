import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ZeroElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        if (m <= 0) return;
        int n = scanner.nextInt();
        if (n <= 0) return;
        int[][] arr = new int[m][n];
        Random random = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                arr[i][j] = random.nextInt(10);    // fore more probability zero elements
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println();
        System.out.println(ZeroElements.calcZeroElements(arr));
    }

    public static int calcZeroElements(int[][] arr){
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++){
                if (arr[i][j] == 0) {
                    res++;
                }
            }
        }
        return res;
    }

}
