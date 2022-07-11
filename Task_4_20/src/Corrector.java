import java.util.Scanner;

public class Corrector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s{2,}", " ");
        String[] arr = str.split("\\s*(\\s|,|!|\\.)\\s*");
        int currentIndex = 0;

        for (int i = 0; i < arr.length; i++){
            currentIndex = str.indexOf(arr[i], currentIndex);
            if (Character.isUpperCase(arr[i].charAt(0)) && i > 0) {
                if (str.charAt(currentIndex - 1) != '.' && str.charAt(currentIndex - 2) != '.') {
                    str = str.substring(0, currentIndex - 1) + "." + str.substring(currentIndex - 1);
                    currentIndex++;
                }
            }

            str = str.substring(0, currentIndex) + arr[i].substring(0,1) + arr[i].substring(1).toLowerCase() + str.substring(currentIndex + arr[i].length());
            currentIndex += arr[i].length();
        }

        System.out.println(str);
    }
}
