package leetcode.solution;

import java.util.HashMap;

/**
 * Created by guo7711 on 4/9/2015.
 */
public class MajorityElement {

    public int majorityElement(int[] num) {

        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        for(int i=0;i<num.length;i++)
        {
            if(result.get(num[i])==null) result.put(num[i],1);
            else
            {
                int occurance = result.get(num[i]);
                occurance++;
                result.put(num[i],occurance);
            }
            if(result.get(num[i])>num.length/2) return num[i];
        }


        return 0;

    }
}
