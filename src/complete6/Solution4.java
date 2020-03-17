package complete6;

/**
 * @author bo
 * @date Created in 14:29 2019/8/11
 * @description
 **/
public class Solution4
{
    public boolean canConvert(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        }
        boolean[] strBool1=new boolean[26];
        boolean[] strBool2=new boolean[26];
        int atn1=0;
        int atn2=0;
        for (int i=0;i<str1.length();i++){
            if (!strBool1[str1.charAt(i)-'a']){
                strBool1[str1.charAt(i)-'a']=true;
                atn1++;
            }
            if (!strBool2[str2.charAt(i)-'a']){
                strBool2[str2.charAt(i)-'a']=true;
                atn2++;
            }
        }
        if (atn1==26&& atn2==26){
            return false;
        }
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        boolean flag=true;
        for (int i=0;i<str1.length();i++){
            if (arr1[str1.charAt(i)-'a']==0 || arr1[str1.charAt(i)-'a']==str2.charAt(i)-'a'+1){
                arr1[str1.charAt(i)-'a']=str2.charAt(i)-'a'+1;
            }else{
                flag=false;
            }
        }
        return flag;
    }
}
