package complete154;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author bo
 * @date Created in 10:40 2019/9/15
 * @description
 **/
public class Solution2 {
    public static String reverseParentheses(String s) {
        Stack<Character> stack =new Stack<>();
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)!=')'){
                stack.push(s.charAt(i));
            }else{
                Queue<Character> tmp =new LinkedList<>();
                while(stack.peek()!='('){
                    tmp.add(stack.pop());
                }
                //弹出"("
                stack.pop();
                while(!tmp.isEmpty()){
                    stack.push(tmp.poll());
                }
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        while(!stack.empty()){
            stringBuilder.append(stack.pop());
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseParentheses("(u(love)i)"));
    }
}
