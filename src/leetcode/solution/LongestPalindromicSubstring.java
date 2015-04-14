package leetcode.solution;

/**
 * Created by guo7711 on 4/13/2015.
 */
public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {

        if (s == null || s.length() == 0 || s.length()==1) return s;

        String longest = "";
        int left = 0, right =0;

        for (int middlepoint = 0; middlepoint < s.length()*2; middlepoint++)
        {
            left = middlepoint/2;
            right = middlepoint/2;
            if(middlepoint%2==1) right++;

            String str = palidromeHelper(s,left,right);
            if(str.length()>longest.length())
            {
                longest = str;
            }
        }

        return longest;

    }

    public static String palidromeHelper(String s, int left, int right)
    {

        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }

        return s.substring(left+1,right);
    }
}
