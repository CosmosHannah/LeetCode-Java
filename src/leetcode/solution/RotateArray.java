package leetcode.solution;

/**
 * Created by guo7711 on 4/9/2015.
 */
public class RotateArray {

    public static void rotate(int[] nums, int k) {

        if(nums.length==0) return;
        if(k>=nums.length) k=k%nums.length;
        if(k==0) return;
        reverseArray(nums,nums.length-k,nums.length-1);//4,6
        reverseArray(nums,0,nums.length-k-1);//0,3
        reverseArray(nums,0,nums.length-1);//0,6
    }

    public static int[] reverseArray(int[] num, int start, int end)
    {
        for(int i=0;i<(end-start+1)/2;i++)
        {
            int temp = 0;
            temp = num[start+i];
            num[start+i] = num[end-i];
            num[end-i] = temp;
        }

        return num;

    }
}
