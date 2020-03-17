package complete157;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author bo
 * @date Created in 10:50 2019/10/6
 * @description
 **/
public class Solution2 {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer,Integer> map= new HashMap<>();
        int maxLength=1;
        for(int i=0;i<arr.length;i++){
            int curValue=arr[i];
            if(map.containsKey(curValue)){
                int next=curValue+difference;
                if(map.containsKey(next)){
                    int tmpMax=Math.max(map.get(next),map.get(curValue)+1);
                    maxLength=Math.max(maxLength,tmpMax);
                    map.put(next,tmpMax);
                }else{
                    maxLength=Math.max(maxLength, map.get(curValue)+1);
                    map.put(next,  map.get(curValue)+1);
                }
            }else{
                int next=curValue+difference;
                if(!map.containsKey(next)){
                    map.put(next,1);
                }
            }
        }
        return maxLength;
    }
}
