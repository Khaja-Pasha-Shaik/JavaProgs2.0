package trees;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestorBrute {

    //To find a lowest common ancestor
    //Find root to node path for the 2 elements. And then find the common elements

    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(8);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(7);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(6);
        TreeNode t6 = new TreeNode(9);
        TreeNode t7 = new TreeNode(4);
        TreeNode t8 = new TreeNode(1);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t4.left = t6;
        t5.left = t7;
        t5.right = t8;

        List<Integer> lca1 = new ArrayList<>();
        List<Integer> lca2 = new ArrayList<>();

        findRootToNodePath(t1,lca1,7);
        System.out.println(lca1);
        findRootToNodePath(t1,lca2,9);
        System.out.println(lca2);
        int common = 0;
        for(int i=0; i<Math.min(lca1.size(),lca2.size());i++){
            if(lca1.get(i) != lca2.get(i)){
                break;
            }
            common = lca1.get(i);
        }
        System.out.println("Common Ancestor is ::"+common);

    }

    private static boolean findRootToNodePath(TreeNode root, List<Integer> ds, int node) {
        if(root == null){
            return false;
        }
        ds.add(root.data);
        if(root.data == node){
            return true;
        }
        if(findRootToNodePath(root.left, ds, node) || findRootToNodePath(root.right, ds,node)){
            return true;
        }
        ds.removeLast();
        return false;
    }
}
