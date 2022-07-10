import java.util.Scanner;

public class WordsRemoving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mainSrt = scanner.nextLine();
        String sequence = scanner.nextLine();

        String[] arrStr = mainSrt.split("\\s*(\\s|,|!|\\.)\\s*");

        for (int i = 0; i < arrStr.length; i++){
            if (arrStr[i].contains(sequence)){
                mainSrt = mainSrt.replace(arrStr[i], "");
            }
        }

        System.out.println(mainSrt);
    }
}
