package leetcode.solution;

import java.util.*;

/**
 * Created by guo7711 on 7/1/2015.
 */
public class CombinationSumII {

    public static ArrayList<List<Integer>> combinationSum2(int[] candidates, int target) {

        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        if(candidates==null||candidates.length==0||target<0) return result;
        Arrays.sort(candidates);
        getCombinations(candidates, target,0, new ArrayList<Integer>(), result);

        HashSet<List<Integer>> set = new HashSet<List<Integer>>(result);
        result.clear();
        result.addAll(set);
        return result;


    }

    public static void getCombinations(int[] candidates, int target, int start, ArrayList<Integer> item, ArrayList<List<Integer>> result)
    {
        if(target==0)
        {
            result.add(new ArrayList<Integer>(item));
            return;
        }

        if(target<0 || start>=candidates.length)
            return;

        for(int i=start;i<candidates.length;i++)
        {
            if(target<candidates[i]) break;

            item.add(candidates[i]);
            getCombinations(candidates,target-candidates[i],i+1,item,result);
            item.remove(item.size() - 1);
        }
    }
}
