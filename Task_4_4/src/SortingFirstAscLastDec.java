import java.util.Random;
import java.util.Arrays;

public class SortingFirstAscLastDec {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) arr[i] = random.nextInt();

        System.out.println(Arrays.toString(arr));
        SortingFirstAscLastDec.sortFirstLast(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortFirstLast(int[] arr){
        int t = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++){
                if (arr[j] > arr[j + 1]){
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        for (int i = arr.length - 4; i < arr.length; i++){
            for (int j = arr.length - 4; j < arr.length - 1; j++){
                if (arr[j] < arr[j + 1]){
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
}
