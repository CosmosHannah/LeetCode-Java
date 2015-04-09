package leetcode.solution;

/**
 * Created by guo7711 on 4/9/2015.
 */
public class FactorialTrailingZeroes172 {

    /*public int trailingZeroes(int n) {

        int count = 0;
        if(n/5<1) return 0;
        else
        {
            count = n/5+trailingZeroes(n/5);
        }
        return count;

    }
    */
    public int trailingZeroes(int n)
    {
        int result = 0;
        while(n>1)
        {
            result += n/5;
            n = n/5;
        }
        return result;
    }
}
