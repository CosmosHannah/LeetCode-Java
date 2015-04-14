package leetcode.solution;

/**
 * Created by guo7711 on 4/14/2015.
 */
public class ReverseInteger {

    public int reverse(int x) {

        if(x==0) return 0;
        boolean negative = false;
        if(x<0)
        {
            negative = true;
            x = 0-x;
        }



        String s = Integer.toString(x);
        StringBuffer result = new StringBuffer();
        boolean start = false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='0')
                start = true;

            if(start)
                result = result.append(s.charAt(s.length()-1-i));
        }

        int r = Integer.valueOf(result.toString());
        if(negative) r = 0-r;

        return r;

    }
}
