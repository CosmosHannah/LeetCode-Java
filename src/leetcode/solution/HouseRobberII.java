package leetcode.solution;

/**
 * Created by guo7711 on 6/26/2015.
 */
public class HouseRobberII {

    public int rob(int[] nums) {

        if(nums==null||nums.length==0) return 0;
        if (nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);

        return Math.max(calrob(nums,0,nums.length-2), calrob(nums,1,nums.length-1));

    }

    public int calrob(int[] num, int start, int end)
    {
        int dp[] = new int[num.length];
        dp[start] = num[start];
        dp[start+1] = Math.max(num[start], num[start+1]);

        for(int i=start+2;i<=end;i++)
        {
            dp[i] = Math.max(dp[i-1], dp[i-2]+num[i]);
        }

        return dp[end];
    }
}
