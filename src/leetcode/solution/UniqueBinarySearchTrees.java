package leetcode.solution;

/**
 * Created by guo7711 on 4/14/2015.
 */
public class UniqueBinarySearchTrees {

    public int numTrees(int n) {
        if(n==1) return 1;
        int[] ways = new int[n+1];

        ways[0] = 1;
        ways[1] = 1;
        ways[2] = 2;

        for(int i=3;i<=n;i++)
        {
            int current = i;
            int number = 0;

            while(current!=0)
            {
                number += ways[current-1]*ways[i-current];
                current--;
            }

            ways[i] = number;

        }

        return ways[n];


    }
}
