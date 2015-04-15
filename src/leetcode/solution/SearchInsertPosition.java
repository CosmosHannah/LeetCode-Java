package leetcode.solution;

/**
 * Created by guo7711 on 4/15/2015.
 */
public class SearchInsertPosition {

    public int searchInsert(int[] A, int target) {

        if(A==null||A.length==0) return 0;

        for(int i=0;i<A.length;i++)
        {
            if(target<=A[i]) return i;
        }

        return A.length;
    }
}
