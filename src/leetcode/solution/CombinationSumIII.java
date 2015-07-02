package leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guo7711 on 7/2/2015.
 */
public class CombinationSumIII {

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(k<=0||n<1) return result;

        helper(k,n,1,new ArrayList<Integer>(),result);
        return result;


    }

    public void helper(int left, int target,int start, ArrayList<Integer> item, List<List<Integer>> result)
    {
        if(left==0&&target==0)
        {
            result.add(new ArrayList<Integer>(item));
            return;
        }

        else if(target<0||left<=0)
        {
            return;
        }

        for(int i=start;i<10&&i<=target;i++)
        {
            item.add(i);
            helper(left-1,target-i,i+1,item, result);
            item.remove(item.size()-1);
        }
    }
}
