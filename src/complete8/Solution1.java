package complete8;

import java.util.HashSet;
import java.util.Set;

/**
 * @author bo
 * @date Created in 22:38 2019/9/7
 * @description
 **/
public class Solution1 {
    public int countLetters(String S) {
        Set<String> set =new HashSet<>();
        String cur="";
        char curChar='A';
        for(int i=0;i<S.length();i++){
            if(curChar!=S.charAt(i)){
                curChar=S.charAt(i);
                cur=String.valueOf(S.charAt(i));
            }else{
                cur+=S.charAt(i);
            }
            set.add(cur);
        }
        return set.size();
    }
}