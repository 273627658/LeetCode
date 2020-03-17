package complete148;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bo
 * @date Created in 11:33 2019/8/4
 * @description
 **/
public class SnapshotArray {
    private int[] arr;
    private static int num;
    private Map<Integer,int[]> map;
    public SnapshotArray(int length) {
        arr=new int[length];
        num=0;
        map=new HashMap<>();
    }

    public void set(int index, int val) {
        arr[index]=val;
    }

    public int snap() {
        num++;
        int[] tmp=arr.clone();
        map.put(num-1,tmp);
        return num-1;
    }

    public int get(int index, int snap_id) {
        int[] tmp=map.get(snap_id);
        return tmp[index];
    }

    public static void main(String[] args) {
        SnapshotArray obj = new SnapshotArray (3);
        obj.set(0,5);
        int param_2 = obj.snap();
        obj.set(0,6);
        int param_3 = obj.get(0,0);
        System.out.println(param_2);
        System.out.println(param_3);
    }
}
