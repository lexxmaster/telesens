import java.util.Scanner;

public class CalcPiValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcPiValue.eps = scanner.nextDouble();
        System.out.println(CalcPiValue.CalcPiCycle());

        System.out.println(CalcPiValue.CalcPiRec());
    }

    public static double eps;

    public static double CalcPiCycle(){
        double pi = 3.0;
        int i = 1;
        double ai = 0;
        while(true){
            ai = 4.0/(2*i * (2*i + 1) * (2*i + 2));
            if(ai < eps) break;
            pi += ((i % 2 == 0)? -1: 1) * ai;
            i++;
        }

        return pi;
    }

    public static double CalcPiRec(){
        return 3 + CalcPiValue.CalcElem(1);
    }

    public static double CalcElem(int i){
        double ai = 4.0/(2*i * (2*i + 1) * (2*i + 2));
        if (ai < eps) {
            return 0;
        }
        return ((i % 2 == 0)? -1: 1) * ai + CalcPiValue.CalcElem(i + 1);
    }
}
