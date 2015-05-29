package leetcode.solution;

/**
 * Created by guo7711 on 5/29/2015.
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if(x<0)
            return false;

        int size = 1;

        while((x/(Math.pow(10.0, Double.valueOf(size)))>=1))
        {
            size++;
        }



        for(int i=0;i<size;i++)
        {

            if(size%2!=0&&i==(size-1)/2)
                x = x - (int)(x/Math.pow(10.0, Double.valueOf(size-1-i)))*(int)(Math.pow(10.0, Double.valueOf(size-1-i)));
            else
                x = x - (int)(x/Math.pow(10.0, Double.valueOf(size-1-i)))*(int)(Math.pow(10.0, Double.valueOf(size-1-i)))-(int)(x/Math.pow(10.0, Double.valueOf(size-i-1)))*(int)(Math.pow(10.0, Double.valueOf(i)));


        }

        if(x==0)
        {
            return true;
        }
        else return false;
    }
}
