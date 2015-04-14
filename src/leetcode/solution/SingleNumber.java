package leetcode.solution;

/**
 * Created by guo7711 on 4/14/2015.
 */
public class SingleNumber {

    public int singleNumber(int[] A) {

        int single = A[0];

        for(int i=1;i<A.length;i++)
        {
            single = single^A[i];
        }

        return single;
    }
}
