public class GreatestCommonDivisor {
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
