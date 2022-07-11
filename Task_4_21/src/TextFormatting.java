import java.util.Scanner;

public class TextFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text:");
        String str = scanner.nextLine();
        System.out.println("Enter number of symbols:");
        int n = scanner.nextInt();

        FormatText(str, n);
    }

    public static void FormatText(String str, int n){
        CorrectText(str);
        String[] arr = str.split("\\s*(\\s|,|!|\\.)\\s*");
        int currentLine = 0;
        for (int i = 0; i < arr.length; i++) {
            if (currentLine == 0) {
                System.out.print(arr[i]);
                if (arr[i].length() >= n) {
                    System.out.println();
                } else {
                    currentLine = arr[i].length();
                }
            } else {
                if ((currentLine + 1 + arr[i].length()) > n) {
                    System.out.println();
                    System.out.print(arr[i]);
                    currentLine = arr[i].length();
                } else {
                    System.out.print(" " + arr[i]);
                    currentLine += 1 + arr[i].length();
                }
            }
        }
    }

    public static void CorrectText(String str){
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
    }
}
