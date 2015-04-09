package leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guo7711 on 4/9/2015.
 */
public class Combinations77 {

    public ArrayList<ArrayList<Integer>> combine(int n, int k) {

        ArrayList<Integer> item = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        dfs(n,k,1,item,result);

        return result;


    }

    public void dfs(int n, int k, int start, ArrayList<Integer> item, ArrayList<ArrayList<Integer>> res)
    {
        if(item.size()==k)
        {
            res.add(new ArrayList<Integer>(item));
            return;
        }

        for(int i=start;i<=n;i++)
        {
            item.add(i);
            dfs(n,k,i+1,item,res);
            item.remove(item.size()-1);
        }


    }

}
