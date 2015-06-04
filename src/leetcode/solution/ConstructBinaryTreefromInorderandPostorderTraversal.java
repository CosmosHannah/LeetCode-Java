package leetcode.solution;

/**
 * Created by guo7711 on 6/4/2015.
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal {

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        return buildSubtree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);


    }

    public TreeNode buildSubtree(int[] inoder, int inStart,  int inEnd, int[] postorder, int postStart, int postEnd)
    {
        if(inStart>inEnd||postStart>postEnd) return null;

        TreeNode root = new TreeNode(postorder[postEnd]);
        int rootIndex = -1;

        for(int i=inStart;i<=inEnd;i++)
        {
            if(inoder[i]==postorder[postEnd]) {
                rootIndex = i;
                break;
            }
        }

        int len = rootIndex - inStart;

        root.left = buildSubtree(inoder, inStart, inStart+len, postorder, postStart, postStart+len);
        root.right = buildSubtree(inoder, rootIndex+1, inEnd, postorder, postStart+len, postEnd-1);

        return root;
    }

}
