package complete7;

/**
 * @author bo
 * @date Created in 22:29 2019/8/24
 * @description
 **/
public class Solution1 {
    public int calculateTime(String keyboard, String word) {
        int [] chars=new int [keyboard.length()];
        for (int i=0;i<keyboard.length();i++){
            chars[keyboard.charAt(i)-'a']=i;
        }
        int result=0;
        int index=0;
        for (int i=0;i<word.length();i++){
            result+=Math.abs(chars[word.charAt(i)-'a']-index);
            index=chars[word.charAt(i)-'a'];
        }
        return result;
    }
}
