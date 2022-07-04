import java.util.Scanner;

public class ToBinaryReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte b = scanner.nextByte();

        boolean leedZero = true;
        for (int i = 0; i <= 7; i++) {
            System.out.print((byte)(1 & (b >> i)));
        }
    }
}
