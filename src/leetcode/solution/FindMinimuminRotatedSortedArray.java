package leetcode.solution;

import java.util.List;

/**
 * Created by guo7711 on 4/15/2015.
 */
public class FindMinimuminRotatedSortedArray {

    public int findMin(List<Integer> nums) {

        int low, high, mid;
        low = 0;
        high = nums.size()-1;

        while(low<high)
        {
            mid = (low + high)/2;
            if(nums.get(mid)>nums.get(high))
            {
                low = mid+1;
            }
            else
            {
                high = mid;
            }
        }
        return nums.get(high);


    }
}
