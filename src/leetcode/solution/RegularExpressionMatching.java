package leetcode.solution;

/**
 * Created by guo7711 on 5/29/2015.
 */
public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {

        return helper(s,p,0,0);

    }


    public boolean helper(String s, String p, int i, int j)
    {
        if(j==p.length()) return i==s.length();

        if(j==p.length()-1||p.charAt(j+1)!='*')
        {
            if(i==s.length() || s.charAt(i)!=p.charAt(j) && p.charAt(j)!='.')
                return false;
            else return helper(s,p,i+1,j+1);
        }

        if(p.charAt(j+1)=='*')
        {
            while(i<s.length() && (p.charAt(j)=='.' || p.charAt(j)==s.charAt(i)))
            {
                if(helper(s,p,i,j+2)) return true;
                i++;
            }
        }


        return helper(s,p,i,j+2);

    }
}
