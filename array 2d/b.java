import java.util.ArrayList;
import java.util.List;

public class b {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return l;

        int a = matrix.length;
        int b = matrix[0].length;

        int c = 0, d = a - 1;
        int e = 0, f = b - 1;

        while (c <= d && e <= f) {
            for (int j = e; j <= f; j++) {
                l.add(matrix[c][j]);
            }
            for (int i = c + 1; i <= d; i++) {
                l.add(matrix[i][f]);
            }
            if (c < d) {
                for (int j = f - 1; j >= e; j--) {
                    l.add(matrix[d][j]);
                }
            }
            if (e < f) {
                for (int i = d - 1; i > c; i--) {
                    l.add(matrix[i][e]);
                }
            }
            c++;
            d--;
            e++;
            f--;
        }
        return l;
    }
}


