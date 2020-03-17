package complete7;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;


/**
 * @author bo
 * @date Created in 22:43 2019/8/24
 * @description
 **/
public class Solution3 {
    public static void main(String[] args) {
        int[] arr=new int[]{3354,4316,3259,4904,4598,474,3166,6322,8080,9009};
        System.out.println(connectSticks(arr));
    }
    public static int connectSticks(int[] sticks) {
        int result=0;
        Queue<Integer> queue=new PriorityQueue<>();
        for (int i=0;i<sticks.length;i++){
            queue.add(sticks[i]);
        }
        while (queue.size()>=2){
            int a=queue.poll();
            int b=queue.poll();
            result+=(a+b);
            queue.add(a+b);
        }
        return result;
    }
}
