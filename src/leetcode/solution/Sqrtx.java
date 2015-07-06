package leetcode.solution;

/**
 * Created by Rachel on 7/5/15.
 */
public class Sqrtx {

    public int sqrt(int x) {

        if(x<0) return -1;
        if(x==0) return 0;
        if(x==1) return 1;


        return half(x,1,x);


    }

    public int half(int x, int small, int large)
    {
        if(x<0) return -1;
        if(x==0) return 0;
        if(x==1) return 1;

        double mid = Math.floor(((double)(large)+(double)(small))/2);
        double result = mid*mid;

        //  if(count<10)
        //{
        //System.out.println("mid="+mid+" Current Result="+result);
        //count++;
        //}

        double next = (mid+1)*(mid+1);

        if(result<=x&&next>x) return (int)mid;
        else if(result<x) return half(x,(int)mid,large);
        else if(result>x)return half(x,(int)small,(int)mid);

        return 0;

    }

}
