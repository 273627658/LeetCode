package complete150;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import test.Tree2;

import java.util.*;

/**
 * @author bo
 * @date Created in 10:54 2019/8/18
 * @description
 **/
public class Solution4
{
    public String lastSubstring(String s) {
        TreeMap<Integer,String> map=new TreeMap<>();
        char max=0;
        for (int i=0;i<s.length();i++){
           // if (s.charAt(i))
        }



//        String max=set.last();
////        for (int i = 0; i < s.length(); i++)
////        {
////            if (String.valueOf(s.charAt(i)).equals(max)){
////                for (int j = s.length(); j >0; j--)
////                {
////                    if (i<j){
////                        set.add(s.substring(i,j));
////                    }
////                }
////            }else {
////                continue;
////            }
////        }
////        return set.pollLast();
        return "";
    }

    public static void main(String[] args) {
        Solution4 solution4=new Solution4();
        System.out.println(solution4.lastSubstring("leetcode"));
    }
}
