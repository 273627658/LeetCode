package complete152;

/**
 * @author bo
 * @date Created in 10:29 2019/9/1
 * @description
 **/
public class Solution1 {
    public static int numPrimeArrangements(int n) {
        int[] arr=new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,Integer.MAX_VALUE};
        int zhishu=0;
        int heshu=0;
        for (int i=0;i<arr.length;i++){
            if (n<arr[i]){
                zhishu=i;
                break;
            }
        }
        heshu=n-zhishu;
        System.out.println("质数:"+zhishu);
        System.out.println("合数:"+heshu);
        int result=(int)(jiecheng(zhishu)%1000000007 * jiecheng(heshu)%1000000007 %1000000007);
        return result;

    }
    private  static  Long jiecheng(int num){
        Long result=1L;
        for (int i=1;i<=num;i++){
            result *=i;
            result %=1000000007;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numPrimeArrangements(100));
    }
}
