package leetcode.solution;

/**
 * Created by guo7711 on 4/14/2015.
 */
public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        else if(root.left == null && root.right == null) return 1;
        else return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
}
