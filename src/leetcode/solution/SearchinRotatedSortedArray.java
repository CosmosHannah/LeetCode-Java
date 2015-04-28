package leetcode.solution;

/**
 * Created by guo7711 on 4/28/2015.
 */
public class SearchinRotatedSortedArray {

    public int search(int[] nums, int target) {

        if(nums==null||nums.length==0) return -1;
        if(nums.length==1&&nums[0]==target) return 0;

        int index = -1;
        int low = 0;
        int high = nums.length-1;

        while(low<=high)
        {
            int mid = (low + high)/2;
            if(target==nums[mid]) return mid;
            else if(target<nums[mid])
            {
                if(nums[mid]<nums[high])
                {
                    high = mid - 1;
                }
                else
                {
                    //nums[mid]>nums[high]
                    if(nums[low]==target) return low;
                    else if(nums[low]<target)
                    {
                        high = mid-1;
                    }
                    else
                    {
                        low = mid+1;
                    }

                }
            }
            else
            {
                //target>nums[mid]
                if(nums[mid]<nums[low])
                {
                    if(nums[high]==target) return high;
                    else if(nums[high]<target)
                    {
                        high = mid-1;
                    }
                    else
                    {
                        low = mid+1;
                    }
                }
                else
                {
                    low = mid + 1;
                }

            }

        }

        return index;



    }
}
