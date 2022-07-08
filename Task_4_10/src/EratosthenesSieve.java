import java.util.Arrays;

public class EratosthenesSieve {
    public static void main(String[] args) {
        int[] arr = new int[300];

        for (int i = 0; i < 300; i++){
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(EratosthenesSieve.findPrimaryNumbers(arr)));
    }

    public static int[] findPrimaryNumbers(int[] arr){
        for (int i = 1; i < arr.length; i++){
            if(arr[i] < 0) continue;
            int baseValue = arr[i];
            for (int j = 2; (j * baseValue - 1) < arr.length; j++){
                if (arr[j * baseValue - 1] % baseValue == 0) {
                    arr[j * baseValue - 1] = -1;
                }
            }
        }

        int countPrimary = 0;
        for (int i:arr){
            if (i > 0) countPrimary++;
        }

        int[] res = new int[countPrimary];

        for (int i = 0, j = 0; i < arr.length; i++){
            if (arr[i] > 0) {
                res[j] = arr[i];
                j++;
            }
        }
        return res;
    }
}
