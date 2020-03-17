package test;

import com.sun.deploy.panel.ITreeNode;

import java.util.*;

/**
 * @author bo
 * @date Created in 22:55 2019/8/18
 * @description
 **/
public class map {
    public static void main(String[] args) {
        System.out.println(2<<3);;
        Scanner sc = new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        Iterator<Integer> iterator = list.iterator();

        String str=sc.nextLine();
        String[] split = str.split(",");
        split[0]=split[0].replace("[","");
        split[split.length-1]=split[split.length-1].replace("]","");
        for (int i=0;i<split.length;i++){
            list.add(Integer.parseInt(split[i]));
        }
        Collections.sort(list);
        System.out.println(list.toString());
    }
}
