package complete11;

/**
 * @author bo
 * @date Created in 22:54 2019/10/19
 * @description
 **/
public class Solution4 {
    public int maximizeSweetness(int[] sweetness, int K) {
        int sum=0;
        for(int i=0;i<sweetness.length;i++){
            sum+=sweetness[i];
        }
        int avg=sum/K;
        int cur=0;
        int curMin=Integer.MAX_VALUE;
        for(int i=0;i<sweetness.length;i++){
            cur+=sweetness[i];
            if (cur>avg){
                curMin=Math.min(curMin,cur);
                cur=0;
            }
        }
        return curMin;
    }
}
