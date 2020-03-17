package complete15;

/**
 * @author bo
 * @date Created in 22:26 2019/12/14
 * @description
 **/
public class Solution1 {
    public int findSpecialInteger(int[] arr) {
        if (arr.length==1){
            return arr[0];
        }
        int count=1;
        int curNum=arr[0];
        int maxCount=1;
        int maxNum=arr[0];
        for(int i=1;i<arr.length;i++){
            if (curNum==arr[i]){
                count++;
                if (count>maxCount){
                    maxCount=count;
                    maxNum=arr[i];
                }
            }else{
                curNum=arr[i];
                count=1;
            }
        }
        return maxNum;
    }
}
