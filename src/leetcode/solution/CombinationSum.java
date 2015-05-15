package leetcode.solution;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by guo7711 on 5/15/2015.
 */
public class CombinationSum {

    public void dfs(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> item, int index, int target, int[] candidates)
    {
        if(target<0) return;
        if(target==0&&!res.contains(item)) {
            res.add(new ArrayList<Integer>(item));
            return;
        }

        for(int i=index;i<candidates.length;i++)
        {
           item.add(candidates[i]);
           dfs(res, item, i, target-candidates[i],candidates);
           item.remove(item.size()-1);
        }



    }

    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(candidates==null||candidates.length==0)  return res;
        Arrays.sort(candidates);

        dfs(res, new ArrayList<Integer>(), 0, target,candidates);
        return res;
    }
}
