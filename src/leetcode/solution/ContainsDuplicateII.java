package leetcode.solution;

import java.util.HashMap;

/**
 * Created by guo7711 on 6/4/2015.
 */
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if(nums==null||k<=0) return false;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i])) map.put(nums[i], i);
            else
            {
                int current = map.get(nums[i]);
                if(i-current<=k) return true;
                else map.put(nums[i],i);
            }
        }

        return false;

    }
}
