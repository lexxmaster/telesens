import java.util.Arrays;

public class NamedMatrix implements Cloneable{
    private String name;
    private int[][] matrix;

    public String getName(){
        return name;
    }

    public void setMatrixItem(int i, int j, int value){
        if (i >= matrix.length) return;
        if (j >= matrix[i].length) return;

        matrix[i][j] = value;
    }


    public NamedMatrix(String name, int sizeM, int sizeN){
        this.name = name;
        matrix = new int[sizeM][sizeN];
    }

    @Override
    public String toString(){
        return "\"" + name + "\"" + Arrays.deepToString(matrix);
    }

    @Override
    public boolean equals(Object obj){
        NamedMatrix m = (NamedMatrix) obj;
        if (!name.equals(m.name)) {
            return false;
        }
        if (!Arrays.deepEquals(matrix, m.matrix)) {
            return false;
        }

        return true;
    }

    @Override
    public NamedMatrix clone() throws CloneNotSupportedException{
        NamedMatrix m = new NamedMatrix(name, matrix.length, matrix[0].length);
        for (int i = 0; i < matrix.length; i ++) {
            m.matrix[i] = matrix[i].clone();
        }
        return m;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        NamedMatrix a = new NamedMatrix("first", 3, 4);

        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 4; j ++) {
                a.setMatrixItem(i,j, i * j);
            }
        }

        NamedMatrix b = new NamedMatrix("second", 4, 4);

        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j ++) {
                a.setMatrixItem(i,j, i * j);
            }
        }

        System.out.println("a = b: " + a.equals(b));

        NamedMatrix c = new NamedMatrix("second", 3, 4);

        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j ++) {
                a.setMatrixItem(i,j, i * j);
            }
        }

        System.out.println("a = c: " + a.equals(c));

        try {
            NamedMatrix d = a.clone();
            System.out.println("a = d: " + a.equals(d));
        } catch (CloneNotSupportedException exc){
            System.out.println(exc.toString());
        }





    }
}
