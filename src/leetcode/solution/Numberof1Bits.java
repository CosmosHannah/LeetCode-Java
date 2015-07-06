package leetcode.solution;

/**
 * Created by guo7711 on 4/9/2015.
 */
public class Numberof1Bits {
    // public int hammingWeight(int n) {
    //     return Integer.bitCount(n);
    // }
    public int hammingWeight(int n) {
        char [] a = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        for(int i = 0; i< a.length; i++){
    	    if(a[i] == '1') count++;
        }
        return count;
    }
}
