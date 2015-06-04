package leetcode.solution;

import java.util.HashSet;

/**
 * Created by guo7711 on 6/4/2015.
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        if(nums==null) return false;
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hash.contains(nums[i])) return true;
            else hash.add(nums[i]);
        }

        return false;

    }
}
