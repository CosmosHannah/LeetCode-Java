package leetcode.solution;

/**
 * Created by guo7711 on 4/14/2015.
 */
public class BestTimetoBuyandSellStockII {

    public int maxProfit(int[] prices) {

        if(prices==null||prices.length==0) return 0;
        int maxProfit = 0;
        int buy = prices[0];
        int sell = Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++)
        {
            //search for the change point for buy
            //when price stop to go down, buy
            while (i<prices.length&&prices[i]<prices[i-1])
            {
                i++;
            }
            buy = prices[i-1];

            while(i<prices.length&&prices[i]>prices[i-1])
            {
                i++;
            }
            sell= prices[i-1];
            maxProfit+=sell-buy;
        }

        return maxProfit;

    }
}
