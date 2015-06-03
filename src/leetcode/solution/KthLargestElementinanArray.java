package leetcode.solution;

import java.util.Arrays;

/**
 * Created by guo7711 on 6/3/2015.
 */
public class KthLargestElementinanArray {

    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        return nums[nums.length-k];

    }

}
