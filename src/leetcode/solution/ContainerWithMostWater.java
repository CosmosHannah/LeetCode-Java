package leetcode.solution;

/**
 * Created by guo7711 on 4/20/2015.
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int maxArea = 0;
        int left = 0;
        int right = height.length-1;
        int shortest = Math.min(height[left],height[right]);
        maxArea = shortest*(right-left);

        while(left<right)
        {
            if(height[left]>height[right])
                right--;
            else left++;

            shortest = Math.min(height[left],height[right]);
            if(maxArea<shortest*(right-left))
                maxArea = shortest*(right-left);

        }

        return maxArea;


    }

}
