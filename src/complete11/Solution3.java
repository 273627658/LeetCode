package complete11;

import java.util.Arrays;

/**
 * @author bo
 * @date Created in 22:40 2019/10/19
 * @description
 **/
public class Solution3 {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        for(int i=0;i<haystack.length();i++){
            int j=0;
            int tmp=i;
            while(tmp<haystack.length()&&j<needle.length()){
                if(haystack.charAt(tmp)==needle.charAt(j)){
                    i++;
                    j++;
                }else{
                    break;
                }
            }
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }
}
