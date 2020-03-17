package complete157;

/**
 * @author bo
 * @date Created in 10:43 2019/10/6
 * @description
 **/
public class Solution3 {
    public int getMaximumGold(int[][] grid) {
        int result=0;
        int[][] arr=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            if (grid[i][j]!=0){
                result=Math.max(result,dfs(grid,arr,i,j,0));
            }
        }
    }
        return result;
}
    public int dfs(int[][] grid,int[][]arr,int x,int y,int value){
        if(x<0||x>=grid.length||y<0||y>=grid[x].length||grid[x][y]==0||arr[x][y]==1){
            return value;
        }
        arr[x][y]=1;
        int maxValue=0;
        maxValue=Math.max(maxValue,dfs(grid,arr,x+1,y,value+grid[x][y]));
        maxValue=Math.max(maxValue,dfs(grid,arr,x-1,y,value+grid[x][y]));
        maxValue=Math.max(maxValue,dfs(grid,arr,x,y+1,value+grid[x][y]));
        maxValue=Math.max(maxValue,dfs(grid,arr,x,y-1,value+grid[x][y]));
        arr[x][y]=0;
        return maxValue;
    }
}
