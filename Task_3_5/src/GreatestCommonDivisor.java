public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(GreatestCommonDivisor.findGCD(27, 57));
    }

    public static int findGCD(int a, int b){
        if (a == b) {
            return a;
        } else{
            if(a > b){
                return GreatestCommonDivisor.findGCD(a - b, b);
            }else{
                return GreatestCommonDivisor.findGCD(a, b - a);
            }
        }
    }
}
