package leetcode.solution;

/**
 * Created by guo7711 on 4/16/2015.
 */
public class SortColors {

    public void sortColors(int[] A) {

        int[] count = new int[3];

        for(int i=0;i<A.length;i++)
        {
            count[A[i]]++;
        }

        for(int i=0,j=0;i<A.length&&j<3;)
        {
            if(count[j]>0) {
                A[i] = j;
                count[j]--;
                i++;
            }
            else j++;
        }

    }
}
