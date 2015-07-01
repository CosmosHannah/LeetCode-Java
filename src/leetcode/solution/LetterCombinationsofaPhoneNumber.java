package leetcode.solution;

import java.util.ArrayList;

/**
 * Created by guo7711 on 6/30/2015.
 */
public class LetterCombinationsofaPhoneNumber {

    public ArrayList<String> letterCombinations(String digits) {

        ArrayList<String> result = new ArrayList<String>();
        if(digits==null||digits.length()==0) return result;

        String[] phone = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String[] letters = new String[digits.length()];

        for(int i=0;i<digits.length();i++)
        {
            int num = Integer.parseInt(digits.substring(i,i+1));
            letters[i] = phone[num];
        }

        getCombinations(letters, 0, new char[digits.length()], result);

        return result;

    }

    public void getCombinations(String[] letters, int number, char[] item, ArrayList<String> result)
    {
        if(number==letters.length)
        {
            result.add(new String(item));
            return;
        }

        for(int i=0,j=number;i<letters[number].length();i++, j++)
        {
            item[j] = letters[number].charAt(i);
            getCombinations(letters, number+1, item, result);
            j--;
        }

        return;
    }
}
