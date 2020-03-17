package complete150;

/**
 * @author bo
 * @date Created in 10:30 2019/8/18
 * @description
 **/
public class Solution1 {
    public int countCharacters(String[] words, String chars) {
        int[] arr=new int[26];
        int result=0;
        for (int i=0;i<chars.length();i++){
            arr[chars.charAt(i)-'a']++;
        }
        for (int i=0;i<words.length; i++){
            int[] tmp=new int[26];
            int j;
            for (j=0;j<words[i].length();j++){
                tmp[words[i].charAt(j)-'a']++;
                if (tmp[words[i].charAt(j)-'a']>arr[words[i].charAt(j)-'a']){
                    break;
                }
            }
            if (j==words[i].length()){
                result+=words[i].length();
            }
        }
        return result;
    }
}
