package leetcode.solution;

/**
 * Created by guo7711 on 4/15/2015.
 */
public class UniquePaths {

    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        if(m==0||n==0) return 0;
        if(m==1||n==1) return 1;


        for(int i=0;i<m;i++)
            dp[i][0] = 1;

        for(int i=0;i<n;i++)
            dp[0][i] = 1;

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                dp[i][j] = dp[i-1][j] + dp[i][j-1];

        return dp[m-1][n-1];

    }
}
