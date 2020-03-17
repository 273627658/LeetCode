package complete155;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bo
 * @date Created in 10:31 2019/9/22
 * @description
 **/
public class Solution1 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
                List<Integer> list =new ArrayList<Integer>();
                list.add(arr[i]);
                list.add(arr[i+1]);
                if (result.isEmpty()){
                    result.add(list);
                }else{
                    if( Math.abs(result.get(0).get(0)-result.get(0).get(1))>Math.abs(arr[i]-arr[i+1])){
                        result.clear();
                        result.add(list);
                    }else if (Math.abs(result.get(0).get(0)-result.get(0).get(1))==Math.abs(arr[i]-arr[i+1])){
                        result.add(list);
                    }
                }
        }
        return  result;
    }
}
