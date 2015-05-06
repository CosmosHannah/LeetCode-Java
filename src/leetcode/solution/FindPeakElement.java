package leetcode.solution;

/**
 * Created by guo7711 on 5/6/2015.
 */
public class FindPeakElement {

    public int findPeakElement(int[] nums) {

        if(nums==null||nums.length==0) return -1;

        int low =0, high = nums.length-1;

        while(low<=high)
        {
            if(low==high) return low;
            int mid = (low+high)/2;
            if(nums[mid]>nums[mid+1])
            {
                high = mid;
            }
            else
            {
                low = mid + 1;
            }
        }

        return -1;

    }
}
