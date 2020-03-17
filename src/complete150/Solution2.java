package complete150;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author bo
 * @date Created in 10:45 2019/8/18
 * @description
 **/
public class Solution2 {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public int maxLevelSum(TreeNode root) {
            int rowNum=0;
            int curRow=0;
            int result=0;
            int sum=0;
            int max=0;
            Queue<TreeNode> queue=new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()){
                if (rowNum==0){
                    rowNum=queue.size();
                    if (sum>max){
                        max=sum;
                        result=curRow;
                    }
                    sum=0;
                    curRow++;
                }
                TreeNode treeNode = queue.poll();
                if (treeNode!=null){
                    sum+=treeNode.val;
                    queue.add(treeNode.left);
                    queue.add(treeNode.right);
                }
                rowNum--;
            }
            return result;
        }
    }
}
