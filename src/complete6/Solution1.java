package complete6;

/**
 * @author bo
 * @date Created in 22:30 2019/8/10
 * @description
 **/
public class Solution1 {
    public boolean isMajorityElement(int[] nums, int target) {
        int num=0;
        for (int i=0;i<nums.length;i++){
            if (target==nums[i]){
                num++;
            }
        }
        if (num>nums.length/2){
            return true;
        }else{
            return false;
        }
    }
}
