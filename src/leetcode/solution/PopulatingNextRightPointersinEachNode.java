package leetcode.solution;

/**
 * Created by guo7711 on 4/15/2015.
 */
public class PopulatingNextRightPointersinEachNode {

    public void connect(TreeLinkNode root) {

        if(root==null) return;
        else helper(root);

    }

    public void helper(TreeLinkNode root)
    {
        if(root==null) return;
        if(root.left==null||root.right==null) return;

        if(root.left!=null&&root.right!=null) {
            root.left.next = root.right;

            if(root.next!=null&&root.next.left!=null)
            {
                root.right.next = root.next.left;
            }

            helper(root.left);
            helper(root.right);
        }


    }
}
