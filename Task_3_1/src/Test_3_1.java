public class Test_3_1 {
    public static void main(String[] args) {
        QuadraticEquation equation = new QuadraticEquation(4,4,1);
        double solve[] = equation.getSolve();
        System.out.println(solve[0]);
        System.out.println(solve[1]);
    }
}
