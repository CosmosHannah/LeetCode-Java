package leetcode.solution;

/**
 * Created by guo7711 on 6/4/2015.
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal {

    public static TreeNode buildTree(int[] preorder, int[] inorder) {

        return buildSubTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);

    }

    public static TreeNode buildSubTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd)
    {
        if(preStart>preEnd||inStart>inEnd)
            return null;

        TreeNode root = new TreeNode(preorder[preStart]);
        int rootIndex = -1;

        for(int i=inStart;i<=inEnd;i++)
        {
            if(inorder[i]==root.val) {
                rootIndex = i;
                break;
            }
        }

        int subtreeLen = rootIndex - inStart;

        root.left = buildSubTree(preorder, preStart+1, preStart+subtreeLen, inorder, inStart, rootIndex-1);
        root.right = buildSubTree(preorder, preStart+1+subtreeLen, preEnd, inorder, rootIndex+1, inEnd);

        return root;

    }



    //Problem with the following code.

   /* public static TreeNode buildTree(int[] preorder, int[] inorder) {

        if(preorder==null||inorder==null||preorder.length<=0||inorder.length<=0) return null;
        if(preorder.length==1) return new TreeNode(preorder[0]);

        TreeNode root = new TreeNode(preorder[0]);
        int rootIndex = -1;

        int[] inleft = new int[inorder.length];
        int[] inright = new int[inorder.length];

        int[] preleft = new int[preorder.length];
        int[] preright = new int[preorder.length];

        for(int i=0;i<inorder.length;i++)
        {
            if(inorder[i]==root.val) rootIndex = i;

            if(rootIndex==-1||i<rootIndex) inleft[i] = inorder[i];
            else if(i>rootIndex) inright[i-rootIndex-1] = inorder[i];

        }

        for(int i=1;i<preorder.length;i++)
        {
            if(i<=rootIndex) preleft[i-1] = preorder[i];
            else preright[i-rootIndex-1] = preorder[i];
        }

        if(rootIndex == preorder.length-1) {
            preright = null;
            inright = null;
        }
        if(rootIndex == 0)
        {
            preleft = null;
            inleft = null;
        }

        root.left = buildTree(preleft, inleft);
        root.right = buildTree(preright, inright);

        return root;

    }*/

}
