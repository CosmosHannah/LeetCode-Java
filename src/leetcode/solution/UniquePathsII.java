package leetcode.solution;

/**
 * Created by guo7711 on 5/15/2015.
 */
public class UniquePathsII {

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        if(obstacleGrid==null||obstacleGrid.length==0||obstacleGrid[0].length==0) return 0;

        if(obstacleGrid[0][0]==1||obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1) return 0;

        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];

        for(int i=0;i<obstacleGrid[0].length;i++)
        {
            if(obstacleGrid[0][i]==0)
            dp[0][i] = 1;
            else dp[0][i] = 0;
        }

        for(int i=0;i<obstacleGrid.length;i++)
        {
            if(obstacleGrid[i][0]==0)
            dp[i][0] = 1;
            else dp[i][0] = 0;
        }

        for(int i=1;i<obstacleGrid.length;i++)
            for(int j=1;j<obstacleGrid[0].length;j++)
            {
                if(obstacleGrid[i][j]==0)
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
                else dp[i][j] = 0;
            }

        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];

    }
}
