import java.util.Scanner;
public class Translator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder codeString = new StringBuilder(scanner.nextLine());

        int bracketsСount = 0;
        int current = 0;
        while (true){
            current = codeString.indexOf("(",current);
            if (current > 0) {
                bracketsСount++;
                codeString.replace(current, current + 1, "begin");
            } else {
                break;
            }
        }
        while (true){
            current = codeString.indexOf(")",current);
            if (current > 0) {
                bracketsСount--;
                codeString.replace(current, current + 1, "end");
            } else {
                break;
            }
        }

        if (bracketsСount != 0) {
            System.out.println("Brackets missing");
            return;
        }

        System.out.println(codeString);
    }
}
