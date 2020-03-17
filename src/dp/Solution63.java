package dp;

/**
 * @author bo
 * @date Created in 20:37 2019/9/21
 * @description
 **/
public class Solution63 {
    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
    }
    public  static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][]dp=new int[m][n];
        for(int i=0;i<m;i++){
            if(obstacleGrid[i][0]==1){
                break;
            }else{
                dp[i][0]=1;
            }
        }
        for(int i=0;i<n;i++){
            if(obstacleGrid[0][i]==1){
                break;
            }else{
                dp[0][i]=1;
            }
        }
        for(int i=1;i<obstacleGrid.length;i++){
            for(int j=1;j<obstacleGrid[0].length;j++){
                if (obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
