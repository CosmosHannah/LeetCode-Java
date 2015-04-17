package leetcode.solution;

import java.util.ArrayList;

/**
 * Created by guo7711 on 4/17/2015.
 */
public class GrayCode {

    public ArrayList<Integer> grayCode(int n) {

        if(n==0) {
            ArrayList<Integer> res = new ArrayList<Integer>();
            res.add(0);
            return res;
        }

        ArrayList<Integer> res = grayCode(n-1);
        int preSize = res.size();
        int add = 1 <<(n-1);
        for(int i=0;i<preSize;i++)
        {
            res.add(preSize+i,add+res.get(preSize-1-i));
        }
        return res;
    }
}
