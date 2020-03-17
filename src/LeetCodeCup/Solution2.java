package LeetCodeCup;

import java.util.Arrays;

/**
 * @author bo
 * @date Created in 21:32 2019/9/24
 * @description
 **/
public class Solution2 {
    public static int[] fraction(int[] cont) {
        int[] result=new int[2];
        result[1]=1;
        int i;
        for(i=cont.length-1;i>=0;i--){
            result[0]+=cont[i]*result[1];
            if (i!=0){
                int tmp=result[0];
                result[0]=result[1];
                result[1]=tmp;
            }
        }
        int[] arr=new int [2];
        arr[0]=result[0];
        arr[1]=result[1];
            Arrays.sort(result);
            while(true){
                int tmp=result[1]%result[0];
                if(tmp==0){
                    return new int[]{ arr[0]/result[0],arr[1]/result[0]};
                }else{
                    result[1]=result[0];
                    result[0]=tmp;
                }
            }
    }

    public static void main(String[] args) {
        int[] arr=fraction(new int[]{0,0,3});
        for(int num:arr){
            System.out.println(num);
        }
    }
}
