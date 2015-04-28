package leetcode.solution;

import java.util.HashSet;

/**
 * Created by guo7711 on 4/28/2015.
 */
public class HappyNumber {

    public boolean isHappy(int n) {

        HashSet<Integer> numberSet = new HashSet<Integer>();
        int total = 0;

        while (n!=0) {
            while (n != 0) {
                int i = n % 10;
                total += i * i;
                n = n / 10;
            }
            if(numberSet.contains(total)) return false;
            else numberSet.add(total);
            if(total==1) return true;
            n = total;
            total = 0;
        }

        return false;

    }
}
