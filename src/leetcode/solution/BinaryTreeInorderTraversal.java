package leetcode.solution;

import java.util.ArrayList;

/**
 * Created by guo7711 on 4/14/2015.
 */
public class BinaryTreeInorderTraversal {

    public ArrayList<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> res = new ArrayList<Integer>();

        if(root==null) return res;

        helper(res,root);
        return res;


    }


    public void helper(ArrayList<Integer> res, TreeNode root)
    {
        if(root==null) return;
        else
        {
            helper(res,root.left);
            res.add(root.val);
            helper(res,root.right);
        }

        return;
    }
}
