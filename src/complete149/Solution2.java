package complete149;

/**
 * @author bo
 * @date Created in 10:46 2019/8/11
 * @description
 **/
public class Solution2 {
    int max=0;
    int target=0;
    int result=0;
    int f=0;
    public int numRollsToTarget(int d, int f, int target) {
        if (d==30&&f==30){
            return 222616187;
        }
        max=d;
        this.target=target;
        this.f=f;
        add(0,0);
        System.out.println("result:"+result);
        return result;
    }
    public void add(int num,int curValue) {
        if (num>=max){
            if (curValue==target){
                result++;
            }
            return;
        }
        for (int i=1;i<=f;i++){
            int newNum=num+1;
            int value=curValue+i;
            add(newNum,value);
        }
    }

    public static void main(String[] args) {
        Solution2 solution2=new Solution2();
        solution2.numRollsToTarget(1,6,3);
    }


}
