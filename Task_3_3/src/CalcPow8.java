public class CalcPow8 {
    public static int[] CalculatePow8(int n){
        if(n <= 0) return new int[0];

        int[] arr = new int[n];
        arr[0] = 8;
        for (int i = 1; i < n; i++){
            arr[i] = arr[i-1] * 8;
        }

        return arr;
    }

    public static int[] CalculatePow8Shift(int n){
        if(n <= 0) return new int[0];

        int[] arr = new int[n];
        arr[0] = 8;
        for (int i = 1; i < n; i++){
            arr[i] = arr[i-1] << 3;
        }

        return arr;
    }
}
