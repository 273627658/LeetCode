package dp;

/**
 * @author bo
 * @date Created in 21:26 2019/9/15
 * @description
 **/
public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        int index=0;
        if (s.length()==0){
            return true;
        }
        for (int i=0;i<t.length();i++){
            if (s.charAt(index)==t.charAt(i)){
                index++;
            }
            if (s.length()==index){
                return true;
            }
        }
        return  false;
    }
}
