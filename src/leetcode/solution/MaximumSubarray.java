package leetcode.solution;

/**
 * Created by guo7711 on 4/14/2015.
 */
public class MaximumSubarray {

    public int maxSubArray(int[] A) {
        if(A==null||A.length==0) return 0;
        if(A.length==1) return A[0];

        int result = A[0], max = A[0];

        for(int i=1;i<A.length;i++)
        {
            max = Math.max(max+A[i],A[i]);
            if(max>result) result = max;
        }

        return result;
    }

}
