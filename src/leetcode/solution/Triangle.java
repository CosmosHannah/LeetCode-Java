package leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guo7711 on 6/2/2015.
 */
public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {

        if(triangle.size()==1) return triangle.get(0).get(0);

        ArrayList<Integer> dp = new ArrayList<Integer>();

        for(int i=0;i<triangle.get(triangle.size()-1).size();i++)
        {
            dp.add(triangle.get(triangle.size()-1).get(i));
        }

        for(int i=triangle.size()-2;i>=0;i--)
            for(int j=0;j<triangle.get(i).size();j++)
                dp.set(j,Math.min(dp.get(j),dp.get(j+1))+triangle.get(i).get(j));


        return dp.get(0);

    }
}
