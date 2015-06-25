package leetcode.solution;

/**
 * Created by guo7711 on 6/25/2015.
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {

        if(root==null) return root;
        return swap(root);

    }

    public TreeNode swap(TreeNode root)
    {
        if(root.left==null&&root.right==null) return root;

        if(root.left!=null) root.left = swap(root.left);
        if(root.right!=null) root.right = swap(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;

    }
}
