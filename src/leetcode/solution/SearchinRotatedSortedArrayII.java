package leetcode.solution;

/**
 * Created by guo7711 on 4/28/2015.
 */
public class SearchinRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {

        if(nums==null||nums.length==0) return false;
        if(nums.length==1&&nums[0]==target) return true;


        int low = 0;
        int high = nums.length-1;

        while(low<=high)
        {
            int mid = (low + high)/2;
            if(target==nums[mid]) return true;
            else if(target<nums[mid])
            {
                if(nums[mid]<nums[high])
                {
                    high = mid - 1;
                }
                else if(nums[mid]==nums[high])
                {
                    high--;
                }
                else
                {
                    //nums[mid]>nums[high]
                    if(nums[low]==target) return true;
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
                    if(nums[high]==target) return true;
                    else if(nums[high]<target)
                    {
                        high = mid-1;
                    }
                    else
                    {
                        low = mid+1;
                    }
                }
                else if(nums[mid]==nums[low])
                {
                    low++;
                }
                else
                {
                    low = mid + 1;
                }

            }

        }

        return false;



    }
}
