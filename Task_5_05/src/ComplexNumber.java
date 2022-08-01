public class ComplexNumber {
    private double real, imaginary;

    @Override
    public String toString(){
        return "" + real + ((imaginary < 0)?("-i" + (-imaginary)):("+i"  + imaginary));
    }

    public ComplexNumber(){
        real = 0;
        imaginary = 0;
    }

    public ComplexNumber(double r, double im){
        real = r;
        imaginary = im;
    }

    public static ComplexNumber sum(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber(a.real + b.real, a.imaginary + b.imaginary);
    }

    public static ComplexNumber subtract(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber(a.real - b.real, a.imaginary - b.imaginary);
    }

    public static ComplexNumber multiply(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber(a.real * b.real - a.imaginary * b.imaginary, a.real * b.imaginary + a.imaginary * b.real);
    }

    public static ComplexNumber divide(ComplexNumber a, ComplexNumber b){
        double r, i;
        r = (a.real * b.real + a.imaginary * b.imaginary)/(b.real * b.real + b.imaginary * b.imaginary);
        i = (a.imaginary * b.real - a.real * b.imaginary)/(b.real * b.real + b.imaginary * b.imaginary);
        return new ComplexNumber(r, i);
    }

    public void multiply(double x){
        real *= x;
        imaginary *= x;
    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(4,-5);
        ComplexNumber b = new ComplexNumber(2, 6);

        System.out.println(ComplexNumber.sum(a, b));
        System.out.println(ComplexNumber.subtract(a, b));
        System.out.println(ComplexNumber.multiply(a, b));
        System.out.println(ComplexNumber.divide(a, b));

        a.multiply(5);
        System.out.println(a);
    }
}
