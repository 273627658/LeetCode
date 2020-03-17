package dp;

/**
 * @author bo
 * @date Created in 21:15 2019/9/15
 * @description
 **/
public class Solution53 {
    public int maxSubArray(int[] nums) {
        int cur=nums[0];
        int curMax=0;
        for (int i=1;i<nums.length;i++){
            if (cur<0){
                cur=0;
            }
            cur+=nums[i];
            curMax=Math.max(curMax,cur);
        }
        return curMax;
    }
}
