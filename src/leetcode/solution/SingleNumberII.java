package leetcode.solution;

/**
 * Created by guo7711 on 4/14/2015.
 */
public class SingleNumberII {

    public int singleNumber(int[] A) {

        int result = 0;

        int count[] = new int[32];
        for(int i=0;i<32;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                count[i]+=(A[j]>>i) & 1;
            }
        }

        for(int i=0;i<32;i++)
        {
            result += (count[i]%3)<<i;
        }

        return result;

    }
}
