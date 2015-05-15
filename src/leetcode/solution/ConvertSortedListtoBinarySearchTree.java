package leetcode.solution;

/**
 * Created by guo7711 on 5/15/2015.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ConvertSortedListtoBinarySearchTree {

        static ListNode p;
        public TreeNode sortedListToBST(ListNode head) {

            if(head==null) return null;
            p = head;
            int len =0;
            while(p!=null)
            {
                p = p.next;
                len++;
            }
            p = head;
            return buildBST(0,len-1);
        }

        public TreeNode buildBST(int start, int end){

            if(start>end) return null;
            int mid = (start+end)/2;
            TreeNode left = buildBST(start,mid-1);
            TreeNode root = new TreeNode(p.val);
            root.left = left;
            p = p.next;
            TreeNode right = buildBST(mid+1,end);
            root.right = right;
            return root;
        }

}
