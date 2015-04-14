package leetcode.solution;

/**
 * Created by guo7711 on 4/14/2015.
 */
public class ImplementstrStr {

    public int strStr(String haystack, String needle) {

        if(needle==null||haystack==null||needle.length()>haystack.length()) return -1;
        if(needle.length()==0) return 0;

        int j=0;
        for(int i=0;i<haystack.length()&&(haystack.length()-i>=needle.length()-j);i++)
        {
            if(haystack.charAt(i)==needle.charAt(j))
            {
                if(j==needle.length()-1) return i-needle.length()+1;
                else j++;
            }
            else
            {
                //if(j!=needle.length()-1) i--;//
                if(j!=0) i = i-j;
                j=0;

            }
        }

        return -1;
    }
}
