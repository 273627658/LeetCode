package complete148;

/**
 * @author bo
 * @date Created in 10:33 2019/8/4
 * @description
 **/
public class Solution1 {
    public static int movesToMakeZigzag(int[] nums) {
        int ji=0,ou=0;
        int[] other=new int [nums.length];
        for (int i=0;i<nums.length;i++){
            other[i]=nums[i];
            System.out.print(other[i]+" ");
        }
        for(int i=0;i<nums.length;i++){
            //ji

            if (i%2!=0){
                if (i+1<nums.length){
                    if (nums[i]<=nums[i-1]||nums[i]<nums[i+1]){
                        while (nums[i]<=nums[i-1]){
                            nums[i-1]--;
                            ji++;
                        }
                        while (nums[i]<=nums[i+1]){
                            nums[i+1]--;
                            ji++;
                        }
                    }
                }else{
                    if (nums[i]<=nums[i-1]){
                        while (nums[i]<=nums[i-1]){
                            nums[i-1]--;
                            ji++;
                        }
                    }
                }
            }
        }
        for (int i=0;i<other.length;i++)
        { //ou
            if (i%2==0) {
                if (i != 0 && i + 1 < other.length) {
                    if (other[i] <= other[i - 1] || other[i] <= other[i + 1]) {
                        while (other[i] <= other[i - 1]) {
                            other[i - 1]--;
                            ou++;
                        }
                        while (other[i] <= other[i + 1]) {
                            other[i + 1]--;
                            ou++;
                        }
                    }
                } else {
                    if (i == 0) {
                        if (other[i] <= other[i + 1]) {
                            while (other[i] <= other[i + 1]) {
                                other[i + 1]--;
                                ou++;
                            }
                        }
                    } else {
                        if (other[i] <= other[i - 1]) {
                            while (other[i] <= other[i - 1]) {
                                other[i - 1]--;
                                ou++;
                            }
                        }

                    }
                }
            }
        }
        return Math.min(ji,ou);
    }

    public static void main(String[] args) {
        movesToMakeZigzag(new int[]{2,1,2});
    }
}
