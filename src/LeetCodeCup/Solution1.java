package LeetCodeCup;

/**
 * @author bo
 * @date Created in 21:26 2019/9/24
 * @description
 **/
public class Solution1 {
    public int game(int[] guess, int[] answer) {
        int result=0;
        for(int i=0;i<guess.length;i++){
            if(guess[i]==answer[i]){
                result++;
            }
        }
        return result;
    }
}
