package leetcode.solution;

/**
 * Created by guo7711 on 6/10/2015.
 */
public class BitwiseANDofNumbersRange {

    public int rangeBitwiseAnd(int m, int n) {

        int mask = Integer.MAX_VALUE;

        while((m & mask)!=(n & mask))
            mask = mask<<1;

        return mask & m;

    }
}
