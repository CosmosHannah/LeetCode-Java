package leetcode.solution;

/**
 * Created by guo7711 on 4/9/2015.
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {

        int result = 0;
        for(int i=0;i<s.length();i++)
        {
            int single = s.charAt(i)-'A'+1;
            result = result*26+single;
        }
        return result;
    }
}
