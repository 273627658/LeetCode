package test;

import javax.xml.bind.annotation.XmlAnyAttribute;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author bo
 * @date Created in 21:47 2019/8/19
 * @description
 **/
public class test {
    public static void main(String[] args) {
        isPossibleDivide(new int[]{1,2,3,3,4,4,5,6},4);
    }
    public static boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length%k!=0){
            return false;
        }
        Arrays.sort(nums);
        LinkedList<Integer> list=new LinkedList<>();
        for (int num:nums){
            list.add(num);
        }
        while(list.size()>=k){
            int cur=list.get(0);
            List<Integer>indexList=new ArrayList();
            indexList.add(0);
            int preSize=list.size();
            for(int i=1;i<list.size();i++) {
                if (list.get(i)==cur+1){
                    indexList.add(i);
                    cur=list.get(i);

                    if (indexList.size()==k){
                        for(int j=indexList.size()-1;j>-1;j--){
                            list.remove(indexList.get(j));
                        }
                        break;
                    }
                }
            }
            if (preSize==list.size()){
                break;
            }
        }
        if (list.size()==0){
            return true;
        }else{
            return false;
        }
    }
}
