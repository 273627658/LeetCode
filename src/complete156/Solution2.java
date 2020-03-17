package complete156;

/**
 * @author bo
 * @date Created in 10:41 2019/9/29
 * @description
 **/
public class Solution2 {
    public static int equalSubstring(String s, String t, int maxCost) {
        int length=Math.max(s.length(),t.length());
        int cur=0;
        int curMax=0;
        int curCost=maxCost;
        for(int j=0;j<length;j++){
            for(int i=j;i<length;i++){
                curCost-=Math.abs(s.charAt(i)-t.charAt(i));
                if (curCost>=0){
                    cur++;
                    curMax=Math.max(curMax,cur);
                }else{
                    curCost=maxCost;
                    cur=0;
                    break;
                }
            }
            curCost=maxCost;
            cur=0;
        }

        return curMax;
    }

    public static void main(String[] args) {
        System.out.println(equalSubstring("iktqzyazth", "havakbjzzc", 78));
    }
}
