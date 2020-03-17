package dp;

/**
 * @author bo
 * @date Created in 21:19 2019/9/15
 * @description
 **/
public class Solution121 {
    public int maxProfit(int[] prices) {
        int cur=0;
        if (prices.length==0){
            return 0;
        }
        int min=prices[0];
        int max=0;
        for (int i=1;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            max=Math.max(max,prices[i]-min);
        }
        return max;
    }
}
