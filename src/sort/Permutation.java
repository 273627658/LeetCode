package sort;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author bo
 * @date Created in 16:52 2019/12/1
 * @description
 **/
public class Permutation {
    static int result=0;
    public static void main(String[] args) {
        Perm(new int[]{1,2,3,4,5,6,7,8,9},0,9);
        System.out.println(result/6);
    }
    public static void check(int[]arr){
        if(arr[0]+arr[1]+arr[3]+arr[5] ==arr[0]+arr[2]+arr[4]+arr[8]
                &&arr[0]+arr[1]+arr[3]+arr[5]==arr[5]+arr[6]+arr[7]+arr[8]){
            result++;
        }
    }
    //全排列递归算法
    public static void Perm(int[]arr, int start ,int end)
    {
        //arr数组存放排列的数，start表示层 代表第几个数，end表示数组的长度
        if(start==end)
        {
            check(arr);
        }
        for(int i=start;i<end;i++)
            {
                swap(arr,i,start);
                Perm(arr,start+1,end);
                swap(arr,i,start);
            }
    }
    public static  void swap(int[] nums,int a , int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
/* 输出效果:
144
 */
