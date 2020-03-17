package complete153;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author bo
 * @date Created in 11:33 2019/9/8
 * @description
 **/
public class Solution3 {
    public int maximumSum(int[] arr) {
        int curMax=Integer.MIN_VALUE;
        int curValue =0;
        boolean flag=false;
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if (arr[i]<0){
                queue.add(i);
            }
            curValue+=arr[i];
            curMax=curValue>curMax?curValue:curMax;
            if (curValue<0){
                curValue=0;
            }
        }
        return curMax;
    }
}
