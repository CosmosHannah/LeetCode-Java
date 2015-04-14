package leetcode.solution;

/**
 * Created by guo7711 on 4/14/2015.
 */
public class IntegertoRoman {

    public String intToRoman(int num) {
        int base[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String roman[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        String result = "";
        for(int i=0;i<base.length;i++)
        {
            int basenum = base[i];
            int count = 0;
            count = num/basenum;
            num = num%basenum;

            while(count>0)
            {
                result += roman[i];
                count--;
            }
        }

        return result;

    }
}
