package leetcode.solution;

import java.util.ArrayList;

/**
 * Created by guo7711 on 4/17/2015.
 */
public class GenerateParentheses {

    public ArrayList<String> generateParenthesis(int n) {

        if(n<=0) return null;

        ArrayList<String> res = new ArrayList<String>();

        dfs(res,"",n,n);

        return res;

    }


    public void dfs(ArrayList<String> res, String item, int left, int right)
    {
        if(left>right) return;

        if(left==0&&right==0)
        {
            res.add(item);
            return;
        }

        if(left>0) dfs(res,item+"(",left-1, right);
        if(right>0) dfs(res,item+")",left, right-1);
    }
}
