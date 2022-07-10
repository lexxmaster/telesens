import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String common = "";

        System.out.print("Enter count of string: ");
        int n = scanner.nextInt();
        String[] arrString = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++){
            System.out.print("Enter string: ");
            arrString[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(arrString));
        Arrays.sort(arrString);
        System.out.println(Arrays.toString(arrString));

        for (int i = 0; i < n; i++){
            common += arrString[i].replaceAll(" ","");
        }

        System.out.println(common);
    }
}
