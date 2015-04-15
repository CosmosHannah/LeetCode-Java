package leetcode.solution;

/**
 * Created by guo7711 on 4/15/2015.
 */
public class ConvertSortedArraytoBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] num) {

        TreeNode root = buildSubtree(num, 0, num.length-1);
        return root;

    }


    public TreeNode buildSubtree(int[] num, int low, int high)
    {
        if(low>high) return null;
        int index = (low+high)/2;

        TreeNode root = new TreeNode(num[index]);

        root.left = buildSubtree(num, low, index-1);
        root.right = buildSubtree(num, index+1, high);

        return root;
    }

}
