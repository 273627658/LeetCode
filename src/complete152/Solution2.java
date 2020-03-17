package complete152;

/**
 * @author bo
 * @date Created in 11:54 2019/9/1
 * @description
 **/
public class Solution2 {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int curCost=0;
        int result=0;
        for (int i=0;i<k-1;i++){
            curCost+=calories[i];
       }
        for (int i=k-1;i<calories.length;i++){
            curCost+=calories[i];
            if (curCost<lower){
                result--;
            }
            if (curCost>upper){
                result++;
            }
            curCost-=calories[i-k+1];
        }
        return result;
    }
}
