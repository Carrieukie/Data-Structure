import java.util.Arrays;

public class ReShapeMatrix {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(matrixReshape(new int[][]{{1, 2, 3}, {4, 5, 6}}, 6, 1)));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        if ((mat.length * mat[0].length) != r * c) return mat;

        int ans[][] = new int[r][c];
        int row = 0;
        int col = 0;

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {

                if (col >= c){
                    row ++;
                    col = 0;
                }

                ans[row][col++] = mat[i][j];

            }

        }
        return ans;
    }


}
