package complete150;

/**
 * @author bo
 * @date Created in 11:12 2019/8/18
 * @description
 **/
public class Solution3 {
    public int maxDistance(int[][] grid) {
        int max=Integer.MIN_VALUE;
        for (int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if (grid[i][j]==0){
                    max=Math.max(max, findNearLand(grid, i, j));
                }
            }
        }
        if (max==Integer.MAX_VALUE||max==Integer.MIN_VALUE){
            return -1;
        }
        return max;
    }
    public int findNearLand(int [][]grid,int index,int jar){
        int minValue=Integer.MAX_VALUE;
        for (int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if (grid[i][j]==1){
                    minValue=Math.min(minValue,Math.abs(i-index)+Math.abs(j-jar));
                }
            }
        }
        return minValue;
    }
}
