package test;

import java.util.*;
import java.util.stream.Collectors;


public class  solution1 {
    static List<String> set=new ArrayList<>();
    public static void main(String[] args) {
        int[] arr=new int[4];
        fullsort(arr,7);
        System.out.println(set.size());
    }

    public static void fullsort(int[] arr,int radix){
        while(true){
            int[] tmp=new int [4];
            for (int i = 0; i < 4 ; i++) {
                tmp[i]=arr[i];
            }
            Arrays.sort(tmp);
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i <4 ; i++) {
                stringBuffer.append(tmp[i]);
            }
            set.add(stringBuffer.toString());

            arr[3]++;
            if (arr[3]==radix){
                arr[3]=0;
                arr[2]++;
                if (arr[2]==radix){
                    arr[2]=0;
                    arr[1]++;
                    if (arr[1]==radix){
                        arr[1]=0;
                        arr[0]++;
                        if (arr[0]==radix){
                            break;
                        }
                    }
                }
            }
        }
    }
}
