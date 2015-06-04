package leetcode.solution;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //    int[] num = new int[1];
      //  num[0] = 1;
        //Permutations.permute(num);

        int[] pre = new int[3];
        pre[0] = 1;
        pre[1] = 2;
        pre[2] = 3;

        int[] in = new int[3];
        in[0] = 2;
        in[1] = 3;
        in[2] = 1;
        ConstructBinaryTreefromPreorderandInorderTraversal.buildTree(pre, in);
    }
}
