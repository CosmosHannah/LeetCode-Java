package leetcode.solution;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by guo7711 on 6/5/2015.
 */
public class ContainsDuplicateIII {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        if(t<0||k<1||nums==null) return false;

        SortedSet<Long> set = new TreeSet<Long>();
        SortedSet<Long> subset = new TreeSet<Long>();
        for(int i=0;i<nums.length;i++)
        {

            subset = set.subSet((long)nums[i]-t, (long)nums[i]+t+1);
            if(!subset.isEmpty()) return true;

            if(i>=k) set.remove((long)nums[i-k]);

            set.add((long)nums[i]);
        }

        return false;

    }
}
