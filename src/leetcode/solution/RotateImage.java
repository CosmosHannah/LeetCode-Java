package leetcode.solution;

/**
 * Created by guo7711 on 4/21/2015.
 */
public class RotateImage {

    public void rotate(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        if(m!=n) return;

        for(int k=0;k<n/2;k++)
        {
            for(int i=k;i<n-1-k;i++)
            {
                int temp = matrix[k][i];
                matrix[k][i]=matrix[n-1-i][k];
                matrix[n-1-i][k] = matrix[n-1-k][n-1-i];
                matrix[n-1-k][n-1-i] = matrix[i][n-1-k];
                matrix[i][n-1-k] = temp;
            }
        }

        return;

    }

}
