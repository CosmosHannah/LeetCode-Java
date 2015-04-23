package leetcode.solution;

import java.util.ArrayList;

/**
 * Created by guo7711 on 4/23/2015.
 */
public class Permutations {

    public static ArrayList<ArrayList<Integer>> permute(int[] num) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> item = new ArrayList<Integer>();

        if(num.length==0||num==null) return res;

        boolean[] visited = new boolean[num.length];

        helper(res,item,visited,num);

        return res;
    }


    public static void helper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> item, boolean[] visited, int[] num)
    {
        if(item.size()==num.length)
        {
            res.add(new ArrayList<Integer>(item));
            return;
        }

        for(int i=0;i<num.length;i++)
        {
            if(!visited[i])
            {
                item.add(num[i]);
                visited[i] = true;
                helper(res,item,visited,num);
                item.remove(item.size()-1);
                visited[i] = false;
            }
        }
    }
}
