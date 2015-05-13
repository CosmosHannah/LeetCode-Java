package leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by guo7711 on 5/12/2015.
 */
public class Subsets {

    public void dfs(int[] nums, int start, ArrayList<Integer> item, ArrayList<ArrayList<Integer>> result)
    {
        for(int i=start;i<nums.length;i++)
        {
            item.add(nums[i]);
            result.add(new ArrayList<Integer>(item));
            dfs(nums, i+1, item, result);
            item.remove(item.size()-1);
        }

    }

    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        result.add(new ArrayList<Integer>());

        if(nums==null||nums.length==0) return result;

        Arrays.sort(nums);

        dfs(nums, 0, new ArrayList<Integer>(), result);

        return result;
    }
}
