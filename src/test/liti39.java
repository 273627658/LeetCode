package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author bo
 * @date Created in 17:06 2019/8/10
 * @description
 **/
public class liti39 {
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        int avg=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        avg=sum/n;
        int result=0;
        for(int i=0;i<n;i++){
            if(arr[i]%avg!=0)
            {
                System.out.println(-1);
                return ;
            }
            if(arr[i]<avg){
                result+=Math.abs(avg-arr[i]);
            }
        }
        System.out.println(result/2);
    }

}
