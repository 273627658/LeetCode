package complete9;

import test.Tree2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author bo
 * @date Created in 22:41 2019/9/21
 * @description
 **/
public class Solution3 {
    public int smallestCommonElement(int[][] mat) {
        if(mat.length==1){
            return mat[0][0];
        }
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<mat[0].length;i++){
            set.add(mat[0][i]);
        }
        for(int i=1;i<mat.length;i++){
            ArrayList<Integer>list=new ArrayList<>();
            for(int j=0;j<mat[0].length;j++){
                if(set.contains(mat[i][j])){
                    list.add(mat[i][j]);
                }
            }
            set=ReSet(set,list);
        }
        if (set.isEmpty()){
            return -1;
        }else{
            return set.first();
        }
    }
    public TreeSet ReSet(TreeSet set, ArrayList<Integer> list){
        set.clear();
        for (int num:list){
            set.add(num);
        }
        return set;
    }
}
