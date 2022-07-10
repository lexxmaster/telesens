import java.util.Arrays;
import java.util.Scanner;
public class AlphabetSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = "";

        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++){
            if (Character.isDigit(arr[i])) {
                continue;
            }
            result += arr[i];
        }

        System.out.println(result);
    }
}
