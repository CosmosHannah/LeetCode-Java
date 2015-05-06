package leetcode.solution;

/**
 * Created by guo7711 on 5/6/2015.
 */
public class RemoveDuplicatesfromSortedArrayII {

    public int removeDuplicates(int[] nums) {

        if(nums==null||nums.length==0) return 0;
        if(nums.length==1||nums.length==2) return nums.length;

        int prev2 = 0, prev1 = 1, current = 2, len = nums.length;
        while (current<nums.length)
        {
            if(nums[current]==nums[prev1]&&nums[current]==nums[prev2])
            {
                current++;
                len--;
            }
            else {
                prev1++;
                nums[prev1] = nums[current];
                prev2++;
                current++;
            }
        }

        return len;

    }

    //More concise code
    //http://www.cnblogs.com/springfor/p/3889632.html
    public int removeDuplicatesbetter(int[] A) {
                 if (A.length <= 2)
                         return A.length;

                 int prev = 1; // point to previous
                 int curr = 2; // point to current

                 while (curr < A.length) {
                         if (A[curr] == A[prev] && A[curr] == A[prev - 1]) {
                                 curr++;
                             } else {
                                 prev++;
                                 A[prev] = A[curr];
                                 curr++;
                             }
                     }

                 return prev + 1;
    }

}
