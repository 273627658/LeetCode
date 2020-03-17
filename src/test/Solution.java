package test;

import java.util.Stack;

/**
 * @author bo
 * @date Created in 13:58 2019/8/19
 * @description
 **/
public class Solution {
    public static void main(String[] args) {
        String str="London you are zhougengzhi jgjgwfgrjpgreo vbjlecb";
        char[] chars = str.toCharArray();
        reverse(chars);
        System.out.println(chars);
    }
    public static void reverse(char[] str){
        int i=0;
        int j=str.length-1;
        while(i<j){
            char tmp=str[i];
            str[i]=str[j];
            str[j]=tmp;
            i++;
            j--;
        }

        int start=0;
        int end=0;
        boolean flag=true;
        for(int a=0;a<str.length;a++){
            if(str[a]!=' '&& flag){
                start=a;
                flag=false;
            }
            //字符为空格,单词结束
            if (str[a]==' '){
                end=a-1;
                while(start<end){
                    char tmp=str[start];
                    str[start]=str[end];
                    str[end]=tmp;
                    start++;
                    end--;
                }
                flag=true;
            }
            //字符串结束时
            if (a==str.length-1){
                end=a;
                while(start<end){
                    char tmp=str[start];
                    str[start]=str[end];
                    str[end]=tmp;
                    start++;
                    end--;
                }
                flag=true;
            }
        }
    }
}