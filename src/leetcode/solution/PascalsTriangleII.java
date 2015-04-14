package leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guo7711 on 4/14/2015.
 */
public class PascalsTriangleII {

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> array = new ArrayList<Integer>(rowIndex+1);
        if(rowIndex<0) return array;
        for(int i=0;i<rowIndex+1;i++)
        {
            array.add(1);
        }
        if(rowIndex>=2)
        {
            for(int i=2;i<=rowIndex;i++)
            {
                array.set(i,1);
                for(int j=i-1;j>0;j--)
                {
                    array.set(j,array.get(j)+array.get(j-1));
                }
            }
            array.set(0,1);
        }
        return array;

    }
}
