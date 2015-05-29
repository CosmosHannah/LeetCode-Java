package leetcode.solution;

/**
 * Created by guo7711 on 5/29/2015.
 */
public class SearchforaRange {

    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];

        int index = binarySearch(nums,target);
        if(index==-1)
        {
            result[0] = -1;
            result[1] = -1;
            return result;
        }
        else
        {
            result[0] = binarySearchBoundary(nums, target, 0, index, true);
            result[1] = binarySearchBoundary(nums, target, index, nums.length-1, false);
        }

        return result;


    }

    public int binarySearchBoundary(int[] nums, int target, int start, int end, boolean left)
    {
        while(start<end)
        {
            int mid = (start+end)/2;
            if(left)
            {
                if(target==nums[mid])
                {
                    end = mid-1;
                }
                else start = mid+1;

            }
            else
            {
                if(target==nums[mid])
                {
                    start = mid+1;
                }
                else
                {
                    end = mid-1;
                }
            }
        }

        if(left)
        return end;
        else return start;

    }

    public int binarySearch(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length-1;

        while(start<end)
        {
            int mid = (start+end)/2;
            if(target==nums[mid]) return mid;
            else if(target<nums[mid])
            {
                end = mid-1;
            }
            else start = mid+1;
        }

        return -1;
    }
}
