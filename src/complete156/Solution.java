package complete156;

import java.util.HashSet;
import java.util.Set;

/**
 * @author bo
 * @date Created in 10:30 2019/9/29
 * @description
 **/
public class Solution {
    public static boolean uniqueOccurrences(int[] arr) {
        int[] count=new int[2002];
        for(int i=0;i<arr.length;i++){
            count[arr[i]+1000]++;
        }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<count.length;i++){
            if (set.contains(count[i])&&count[i]!=0){
                return false;
            }
            set.add(count[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        uniqueOccurrences(new int []{1,2});
    }
}
