package complete7;

import com.sun.xml.internal.ws.util.StringUtils;
import test.Tree2;

import java.time.temporal.Temporal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author bo
 * @date Created in 22:37 2019/8/24
 * @description
 **/

public class FileSystem {
    public static void main(String[] args) {
        FileSystem fileSystem=new FileSystem();
        fileSystem.create("/a",1);
        System.out.println(fileSystem.get("/a"));
    }
    TreeNode root;
    class TreeNode {
        int val;
        HashMap<String,TreeNode> next=new HashMap<>();
        TreeNode(int x)
        {
            val = x;
        }
    }
    public FileSystem() {
         root=new TreeNode(-1);
    }

    public boolean create(String path, int value) {
        if(path==""||path=="/"){
            return false;
        }
        TreeNode cur=root;
        String[] split = path.split("/");
        for (int i=1;i<split.length-1;i++){
            if (cur.next.containsKey((split[i]))){
                cur=cur.next.get(split[i]);
            }
            else {
                return false;
            }
        }
        int n = split.length;
        if (cur.next.containsKey(split[n - 1])) {
            return false;
        }
        cur.next.put(split[n-1], new TreeNode(value));
        return true;
    }

    public int get(String path) {
        TreeNode cur=root;
        String[] split = path.split("/");
        for (int i=1;i<split.length;i++){
            if (cur.next.containsKey((split[i]))){
                cur=cur.next.get(split[i]);
            }
            else {
                return -1;
            }
        }
        return cur.val;
    }
}
