package leetcode.solution;

/**
 * Created by guo7711 on 6/12/2015.
 */
public class Powxn {

    public double myPow(double x, int n) {

        if(n==0) return 1;
        if(n==1) return x;


        boolean pos = n>0?true:false;
        double v = 0;

        if(pos)
            v = myPow(x, n/2);
        else
        {v = 1/(myPow(x,-n/2)); x= 1/x;}

        if(n%2==0)
        {
            return v*v;
        }
        else return v*v*x;

    }
}
