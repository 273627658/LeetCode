package complete9;

import java.util.Arrays;

/**
 * @author bo
 * @date Created in 22:38 2019/9/21
 * @description
 **/
public class Solution1 {
    public int maxNumberOfApples(int[] arr) {
        int max=5000;
        int result=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            max-=arr[i];
            if(max>0){
                result++;
            }else{
                return result;
            }
        }
        return result;
    }
}
