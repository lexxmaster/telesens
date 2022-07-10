import java.util.Scanner;

public class Abbreviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String res = "";

        String[] arr = str.split("\\s*(\\s|,|!|\\.)\\s*");
        for (String s:arr){
            res += Character.toUpperCase(s.charAt(0));
        }

        System.out.println(res);
    }
}