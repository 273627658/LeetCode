package complete11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author bo
 * @date Created in 23:01 2019/10/19
 * @description
 **/
public class Solution2 {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        List<Integer>list=new ArrayList<>();
        Arrays.sort(slots1, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        Arrays.sort(slots2, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int i=0,j=0;
        while(i<slots1.length&&j<slots2.length){
            int start= Math.max(slots1[i][0],slots2[j][0]);
            int end= Math.min(slots1[i][1],slots2[j][1]);
            if (end-start>=duration){
                list.add(start);
                list.add(start+duration);
                return list;
            }else{
                if (end==slots1[i][1]){
                    i++;
                }else{
                    j++;
                }
            }
        }
        return list;
    }
}
