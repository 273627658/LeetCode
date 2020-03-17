package complete154;

import javax.crypto.KeyGenerator;
import java.util.ArrayList;

/**
 * @author bo
 * @date Created in 10:59 2019/9/15
 * @description
 **/
public class Solution3 {
    public static int kConcatenationMaxSum(int[] arr, int k) {
        if (arr.length==0){
            return 0;
        }
        int n=arr.length;
        int leftMax=0;
        int rightMax=0;
        int sum=0;
        long ans=0;
        int mod=1000000007;
        for (int i = 0,cur=0; i < n; i++) {
           cur+=arr[i];
           leftMax=Math.max(leftMax,cur);
           sum +=arr[i];
        }
        for(int i=n-1,cur=0;i>=0;i--){
            cur+=arr[i];
            rightMax=Math.max(rightMax,cur);
        }
        long cur=0;
        for (int i=0;i<n;i++){
            cur+=arr[i];
            if (cur<0){
                cur=0;
            }
            ans=Math.max(ans,cur);
        }
        if (k==1){
            return (int)ans%mod;
        }
        ans=Math.max(ans,sum*k);
        ans=Math.max(ans,Math.max(sum*(k-1)+leftMax,sum*(k-1)+rightMax));
        if (k>=2){
            ans=Math.max(ans,(k-2)*sum+leftMax+rightMax);
            ans=Math.max(ans,leftMax+rightMax);
        }
        ans %= mod;
        return (int)ans;
    }

    public static void main(String[] args) {
        kConcatenationMaxSum(new int[]{-5,4,-4,-3,5,-3},3);
    }
}
