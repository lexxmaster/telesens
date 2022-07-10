import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1,2,3},{5,6,7},{9,10,11},{4,8,7}};
        int[][] b = new int[][]{{9,8},{6,5},{7,5}};

        int[][] c = multiplyMatrix(a,b);
        for (int[] row: c){
            System.out.println(Arrays.toString(row));
        }

        int[][] c2 = multiplyMatrix(b,a);
        for (int[] row: c2){
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] multiplyMatrix(int[][] a, int[][] b){

        if (a[0].length != b.length) {
            System.out.println("Can not multiply same matrices");
            return new int[0][0];
        }

        int[][] res = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++){
                int cij = 0;
                for (int r = 0; r < b.length; r++){
                    cij = cij + a[i][r] * b[r][j];
                }
                res[i][j] = cij;
            }
        }
        return res;
    }
}
