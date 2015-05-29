package leetcode.solution;

import java.util.Arrays;

/**
 * Created by guo7711 on 5/29/2015.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        // Solution 1: Time exceeded.
        // HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        // char[] arr = s.toCharArray();
        // int size = 0, max = 0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(!map.containsKey(arr[i]))
        //     {
        //         map.put(arr[i],i);
        //     }
        //     else
        //     {
        //         size = map.size();
        //         i = map.get(arr[i]);//get the repeated character index, next loop will restart from the repeated one.
        //         map.clear();
        //         max = Math.max(max, size);

        //     }
        // }
        // size = map.size();
        // max = Math.max(max, size);

        // return max;


        //Solution2.

        boolean[] flag = new boolean[256];
        Arrays.fill(flag, false);
        char[] arr = s.toCharArray();
        int size = 0, max = 0,start = 0;
        for(int i=0;i<arr.length;i++)
        {
            char current = arr[i];
            if(flag[current])
            {
                //exist
                size = Math.max(size, i-start);
                for(int j=start;j<i;j++)
                {
                    if(arr[j]==current)
                    {
                        start = j+1;
                        break;
                    }
                    flag[arr[j]] = false;
                }
                max = Math.max(max, size);
            }
            else
            {
                flag[current] = true;
            }


        }
        max = Math.max(arr.length-start, size);

        return max;





    }
}
