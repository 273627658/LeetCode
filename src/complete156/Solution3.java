package complete156;

/**
 * @author bo
 * @date Created in 10:39 2019/9/29
 * @description
 **/
public class Solution3 {
    public String removeDuplicates(String s, int k) {
        if (s.length()==1){
            return  s;
        }
        int index=0;
        int curNum=1;
        char curChar=s.charAt(index++);
        while(index<s.length()){
           if(curChar==s.charAt(index)){
               curNum++;
           }else{
               curChar=s.charAt(index);
               curNum=1;
           }
           if (curNum==k){
               StringBuffer stringBuffer=new StringBuffer();
               for(int i=0;i<k;i++){
                   stringBuffer.append(curChar);
               }
               s=s.replaceAll(stringBuffer.toString(),"");
               curNum=0;
               index=0;
           }
        }
        return s;
    }
}
