package leetcode.solution;

/**
 * Created by guo7711 on 5/29/2015.
 */
public class StringtoIntegeratoi {

    public int atoi(String str) {
        str = str.trim();
        if(str.equals("")) return 0;

        boolean positive = true;
        double value = 0;
        int start = 0;
        if(str.charAt(0)=='-')
        {
            positive = false;
            start = 1;
        }
        if(str.charAt(0)=='+')
        {
            start = 1;
        }

        while(start<str.length()&&str.charAt(start)>='0'&&str.charAt(start)<='9')
        {
            int element = str.charAt(start) - '0';
            value = value*10 + element;
            start++;
        }

        //if(start<str.length()) return 0;

        if(!positive) value = 0-value;

        if(value>Integer.MAX_VALUE) return 2147483647;
        if(value<Integer.MIN_VALUE) return -2147483648;

        return (int)value;

    }
}
