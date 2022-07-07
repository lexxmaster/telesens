import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class SubArrayNegativeElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = scanner.nextInt();
        if (count <= 0) return;
        double[] arr = new double[count];
        for (int i = 0; i < count; i++) arr[i] = random.nextDouble(-100,100);
        System.out.println(Arrays.toString(SubArrayNegativeElements.GetArrayNegativeElements(arr)));
    }

    public static double[] GetArrayNegativeElements(double [] arr){
        int countNegative = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0) countNegative++;
        }
        double[] res = new double[countNegative];
        for (int i = 0, j = 0; i < arr.length; i++){
            if (arr[i] < 0) {
                res[j] = arr[i];
                j++;
            }
        }
        return res;
    }
}
