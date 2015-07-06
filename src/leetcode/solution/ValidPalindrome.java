package leetcode.solution;

/**
 * Created by Rachel on 7/5/15.
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        if(s==null||s.isEmpty()) return true;

        int start = 0, end = s.length()-1;
        while (start<end)
        {
            if(!((s.charAt(start)>='A'&&s.charAt(start)<='Z')||(s.charAt(start)>='a'&&s.charAt(start)<='z')||(s.charAt(start)>='0'&&s.charAt(start)<='9')))
            {
                start++;
                continue;
            }

            if(!((s.charAt(end)>='A'&&s.charAt(end)<='Z')||(s.charAt(end)>='a'&&s.charAt(end)<='z')||(s.charAt(end)>='0'&&s.charAt(end)<='9')))
            {
                end--;
                continue;
            }


            if (s.substring(start, start+1).equalsIgnoreCase(s.substring(end, end+1))) {
                start++;
                end--;
            } else return false;



        }

        return true;

    }
}
