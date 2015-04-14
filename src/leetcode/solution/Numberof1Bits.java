package leetcode.solution;

/**
 * Created by guo7711 on 4/9/2015.
 */
public class Numberof1Bits {

    public int hammingWeight(int n) {

        //  int count =0;
        //while (n>0)
        //{
        //  if((n&1)==1) count++;
        //    n >>=1;
        //    }
        //  return count;

        return Integer.bitCount(n);
    }
}
