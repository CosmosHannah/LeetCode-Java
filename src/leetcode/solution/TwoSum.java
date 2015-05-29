package leetcode.solution;

import java.util.HashMap;

/**
 * Created by guo7711 on 5/29/2015.
 */
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[2];


        for(int i=0;i<numbers.length;i++)
        {
            if(!map.containsKey(target-numbers[i]))
            {
                map.put(numbers[i],i);
            }
            else
            {
                res[0] = map.get(target-numbers[i]) + 1;
                res[1] = i+1;
                break;
            }
        }


        return res;

    }
}
