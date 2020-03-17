package complete155;

import java.util.*;

/**
 * @author bo
 * @date Created in 10:56 2019/9/22
 * @description
 **/
public class Solution2 {
    public static int nthUglyNumber(int n, int a, int b, int c) {
        int size=0;
        Long[] arr=new Long[3];
        List<Long> list =new LinkedList<>();
        arr[0]=a*1L;
        arr[1]=b*1L;
        arr[2]=c*1L;
        Arrays.sort(arr);
        list.add(arr[0]);
        list.add(arr[1]);
        list.add(arr[2]);
        while(size<n){
            Arrays.sort(arr);
            Long count=arr[1]/arr[0];
            arr[0]+=arr[0]*count;
            if (!list.isEmpty()){
                int index=0;
                while(index++<list.size()){
                    if (arr[0]>list.get(0)){
                        size++;
                        if (size==n){
                            return list.get(0).intValue();
                        }
                        list.remove(0);
                    }
                }
            }
            size+=count;
        }
        return arr[0].intValue();
    }
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(1000000000,
                2,
                217983653,
                336916467));
    }
}
