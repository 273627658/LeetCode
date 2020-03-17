package complete152;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bo
 * @date Created in 11:07 2019/9/1
 * @description  过不了时间
 **/
public class Solution3 {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        List<Boolean> list =new ArrayList<>();
        for (int i=0;i<queries.length;i++){
            String str = s.substring(queries[i][0], queries[i][1]+1);
            int[] chars=new int[26];
            for (int j=0;j<str.length();j++){
                chars[str.charAt(j)-'a']++;
            }
            int one=0;
            for (int j=0;j<chars.length;j++){
                if (chars[j]%2!=0){
                   one++;
                }
            }

            one-=queries[i][2]*2;
            System.out.println("one:"+one);
            if (one>1){
                list.add(false);
            }else if(one==1&& str.length()%2!=0){
                list.add(true);
            }else if (one==0){
                list.add(true);
            }else if (one == -1&&str.length()%2!=0){
                list.add(true);
            }else if (one<-1&& one%2==-1&&str.length()%2!=0){
                list.add(true);
            }else if (one<-1&& one%2==0){
                list.add(true);
            }else {
                list.add(false);
            }
        }
        return list;
    }
}
