package complete6;

import java.util.LinkedList;
import java.util.List;

/**
 * @author bo
 * @date Created in 22:33 2019/8/10
 * @description
 **/
public class Solution2 {
    public int minSwaps(int[] data) {
       List<Integer> daijiaList=new LinkedList<>();
       int onenum=0;
       for (int i=0;i<data.length;i++){
           if (data[i]==1){
               onenum++;
           }
       }
       int left=0;
       int right=0;
       int curZero=0;
       for (int i=0;i<data.length&&right<data.length;i++, right++){
            if (right-left<onenum){
                if (data[i]==0){
                    curZero++;
                }
            }else{
                daijiaList.add(curZero);
                if (data[right]==0){
                    curZero++;
                }
                if (data[left++]==0){
                    curZero--;
                }
            }
       }
       int min=Integer.MAX_VALUE;
       for(int num:daijiaList){
           if (min>num){
               min=num;
           }
       }
        return min;
    }
}
