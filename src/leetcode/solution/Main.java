package leetcode.solution;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //    int[] num = new int[1];
      //  num[0] = 1;
        //Permutations.permute(num);

        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(9);
        tree.right = new TreeNode(20);
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(7);
        BinaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(tree);
    }
}
