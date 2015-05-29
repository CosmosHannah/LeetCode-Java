package leetcode.solution;
import java.util.ArrayList;

/**
 * Created by guo7711 on 5/29/2015.
 */
public class UniqueBinarySearchTreesII {

    public ArrayList<TreeNode> generateTrees(int n) {

        return generateTrees(1,n);

    }

    public ArrayList<TreeNode> generateTrees(int start, int end)
    {
        ArrayList<TreeNode> res = new ArrayList<TreeNode>();
        if(start>end)
        {
            res.add(null);
            return res;
        }

        for(int i=start;i<=end;i++)
        {
        ArrayList<TreeNode> left = generateTrees(start, i-1);
        ArrayList<TreeNode> right = generateTrees(i+1, end);

            for(int l=0;l<left.size();l++)
                for(int r=0;r<right.size();r++) {
                    TreeNode root = new TreeNode(i);
                    root.left = left.get(l);
                    root.right = right.get(r);
                    res.add(root);

                }
        }

        return res;
    }
}
