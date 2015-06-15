package leetcode.solution;

import java.util.ArrayList;

/**
 * Created by guo7711 on 6/15/2015.
 */
public class PathSumII {

    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {


        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if(root==null) return result;
        else helper(root, sum, new ArrayList<Integer>(), result);

        return result;


    }

    public void helper(TreeNode root, int sum, ArrayList<Integer> item, ArrayList<ArrayList<Integer>> result)
    {
        if(root==null) return;
        else
        {
            item.add(root.val);
            sum = sum - root.val;
            if(root.left==null&&root.right==null) {
                if (sum == 0) {
                    result.add(new ArrayList<Integer>(item));
                }
            }
            if(root.left!=null)helper(root.left, sum, item, result);
            if(root.right!=null)helper(root.right, sum, item, result);
            item.remove(item.size()-1);
        }


    }
}
