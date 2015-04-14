package leetcode.solution;

/**
 * Created by guo7711 on 4/14/2015.
 */
public class RomantoInteger {

    public int getNumber(char c)
    {
        char[] roman = {'I','V','X','L','C','D','M'};
        int[] number = {1,5,10,50,100,500,1000};

        for(int i=0;i<roman.length;i++)
        {
            if (c==roman[i]) return number[i];
        }

        return 0;

    }
    public int romanToInt(String s) {

        if(s.length()==0||s==null) return 0;
        if(s.length()==1) return getNumber(s.charAt(0));

        int value = 0;
        int pre=0, current=0;


        for(int i=1;i<s.length();i++)
        {
            pre = getNumber(s.charAt(i-1));
            current = getNumber(s.charAt(i));

            if(pre>=current) value+=pre;
            else value = value - pre;
        }

        value = value + current;

        return value;

    }
}
