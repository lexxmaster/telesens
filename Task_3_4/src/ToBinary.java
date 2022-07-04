import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte b = scanner.nextByte();
        byte t;
        boolean leedZero = true;
        for (int i = 7; i >= 0; i--) {
            t = (byte)(1 & (b >> i));
            if(leedZero && t == 0){
                continue;
            }else{
                leedZero = false;
            }
            System.out.print(t);
        }
    }
}
