package leetcode.solution;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by guo7711 on 6/23/2015.
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();


        if(root == null) return result;
        else {
            queue.add(root);

            while (!queue.isEmpty()) {
                int num = queue.size();
                ArrayList<Integer> item = new ArrayList<Integer>();

                for (int i = 0; i < num; i++) {
                    TreeNode current = queue.removeFirst();
                    item.add(current.val);
                    if (current.left != null) queue.addLast(current.left);
                    if (current.right != null) queue.addLast(current.right);
                }
                result.add(new ArrayList<Integer>(item));
                item.clear();
            }


            for (int i = 0; i < result.size(); i++) {
                if (i % 2 == 1) Collections.reverse(result.get(i));
            }

        }


        return result;

    }

}
