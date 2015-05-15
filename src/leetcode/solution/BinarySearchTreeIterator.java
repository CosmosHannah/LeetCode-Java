package leetcode.solution;

import sun.reflect.generics.tree.Tree;

import java.util.Stack;

/**
 * Created by guo7711 on 5/8/2015.
 */
public class BinarySearchTreeIterator {
    /**
     * Definition for binary tree
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */

}

// public class BSTIterator {
//
//    Stack<TreeNode> stack;
//
//    public BSTIterator(TreeNode root) {
//        stack = new Stack<TreeNode>();
//        TreeNode t = root;
//
//        while(t!=null)
//        {
//            stack.push(t);
//            t = t.left;
//        }
//
//    }
//
//    /** @return whether we have a next smallest number */
//    public boolean hasNext() {
//        return !stack.isEmpty();
//    }
//
//    /** @return the next smallest number */
//    public int next() {
//
//        TreeNode node = stack.pop();
//        if(node.right!=null)
//        {
//            stack.push(node.right);
//            while(node.left!=null)
//            {
//                stack.push(node.left);
//                node = node.left;
//            }
//        }
//        return node.val;
//
//    }
//}
