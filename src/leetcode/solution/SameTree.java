package leetcode.solution;

/**
 * Created by guo7711 on 4/14/2015.
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        else if(p==null||q==null) return false;
//        else
//        {
//            if(p.val==q.val)
//            {
//                if(isSameTree(p.left,q.left)&&isSameTree(p.right,q.right))
//                {
//                    return true;
//                }
//                else return false;
//            }
//            else return false;
//        }
        else if(p.val != q.val){
            return false;
        }
        else{
            if(isSameTree(p.left, q.left) && isSameTree(p.right, q.right)){
                return true;
            }
            else{
                return false;
            }
        }

    }
}
