public class SumInfinityEps {
    public static double calcSum(double eps){
        double sum = 0;
        int i = 1;
        while(1.0/i >= eps){
            sum += 1.0/i;
            i++;
        }
        return sum;
    }
}
