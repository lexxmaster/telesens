import java.util.Scanner;

public class SumPositiveElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        if (size <= 0) return;

        double[] array = new double[size];
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextDouble();
        }

        System.out.println(SumPositiveElements.CalsSumPositiveCycle(array));
        System.out.println(SumPositiveElements.CalsSumPositiveRec(array));
    }

    public static double CalsSumPositiveCycle(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static double CalsSumPositiveRec(double[] arr){
        if (arr.length == 1){
            return (arr[0] > 0)? arr[0]:0;
        } else {
            double[] subArr = new double[arr.length - 1];
            System.arraycopy(arr, 1, subArr,0, subArr.length);
            return ((arr[0] > 0)? arr[0]:0) + CalsSumPositiveRec(subArr);
        }
    }
}
