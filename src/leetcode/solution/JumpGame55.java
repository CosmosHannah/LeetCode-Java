package leetcode.solution;

/**
 * Created by guo7711 on 4/13/2015.
 */
public class JumpGame55 {

    public boolean canJump(int[] A) {

        if(A==null||A.length==0) return false;
        if(A.length==1) return true;

        int maxCover = A[0];

        for(int i=0;i<A.length;i++)
        {
            if(i+A[i]>maxCover) maxCover=i+A[i];
            if(maxCover>=A.length-1) return true;
            if(maxCover<=i) return false;
        }

        return false;
    }
}
