package leetcode.solution;

/**
 * Created by guo7711 on 4/9/2015.
 */
public class CountAndSay38 {

    public String countAndSay(int n) {

        if(n<1) return "";
        String current = "1";

        for(int start=1;start<n;start++)
        {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int i=1;i<current.length();i++)
            {
                if(current.charAt(i)==current.charAt(i-1)) count++;
                else
                {
                    sb.append(count);
                    sb.append(current.charAt(i-1));
                    count = 1;
                }
            }

            sb.append(count);
            sb.append(current.charAt(current.length()-1));

            current = sb.toString();
        }

        return current;

    }
}
