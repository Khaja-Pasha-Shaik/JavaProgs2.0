package trees;

import java.util.ArrayList;
import java.util.List;

public class RootToNodePath {

    //An element will be given, we need to track the path from root to the given node
    //1. If root.data = node.data  return true
    //2. Traverse left and right. If you find null - return false
    //3. At any point if either left or right gives true return true
    //4. Dont forget to remove the last element. This is the leaf node

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 =  new TreeNode(20);
        TreeNode t3 = new TreeNode(30);
        TreeNode t4 = new TreeNode(40);
        TreeNode t5 = new TreeNode(50);
        TreeNode t6 = new TreeNode(60);
        TreeNode t7 = new TreeNode(70);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t6.left = t7;

        //Need a ds to store the path
        List<Integer> ds = new ArrayList<>();

        boolean res = rootToNodePath(t1,ds,20);
        System.out.println(ds);
    }

    private static boolean rootToNodePath(TreeNode root, List<Integer> ds, int node) {
        if(root == null){
            //Because cannot find the given node
            return false;
        }
        ds.add(root.data);
        if(root.data == node){
            return true;
        }
        //If any left or right finds data return true
        if(rootToNodePath(root.left,ds,node) || rootToNodePath(root.right,ds,node)){
            return true;
        }

        //Remove the last element.THis is the leaf node
        ds.removeLast();
        return false;
    }
}
