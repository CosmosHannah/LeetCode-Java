package leetcode.solution;

/**
 * Created by guo7711 on 5/6/2015.
 */
public class Searcha2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {


        if(matrix==null) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        if(m==0||n==0) return false;

        int low = 0, high = m*n-1, mid = 0;
        while(low<=high)
        {
            mid = (low+high)/2;
            int row = mid/n;
            int column = mid%n;
            if(matrix[row][column]==target) return true;
            else if(matrix[row][column]<target)
            {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return false;

    }
}
