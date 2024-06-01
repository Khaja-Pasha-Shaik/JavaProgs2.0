package trees;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {

    //Boundary traversal comprises of
    //1. All left most nodes exclude leaf nodes (As we have this in step-2)
    //2. All Leaf nodes
    //3. All right most nodes [from bottom to top] - exclude leaf nodes (As we have this in step-2)

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

        List<Integer> ans = new ArrayList<>();
        ans.add(t1.data);
        //All left Nodes
        addLeftNodes(t1, ans);
        addLeafNodes(t1, ans);
        addRightNodes(t1, ans);
        System.out.println(ans);
    }

    private static void addRightNodes(TreeNode node, List<Integer> ans) {
        List<Integer> temp = new ArrayList<>();
        TreeNode cur = node.right;
        while(cur != null){
            if(!isLeaf(cur))
                temp.add(cur.data);
            if(cur.right != null)
                cur = cur.right;
            else
                cur = cur.left;
        }
        for(int i = temp.size()-1; i>=0; i--){
            ans.add(temp.get(i));
        }
    }

    private static void addLeafNodes(TreeNode node, List<Integer> ans) {
        //preorder traversal, do any tree traversal and get the leaf nodes
        if(isLeaf(node)){
            ans.add(node.data);
            return;
        }
        if(node.left != null)
            addLeafNodes(node.left, ans);
        if(node.right != null)
            addLeafNodes(node.right, ans);
    }

    private static void addLeftNodes(TreeNode node, List<Integer> ans) {
        TreeNode cur = node.left;
        while(cur != null){
            if(!isLeaf(cur))
                ans.add(cur.data);
            if(cur.left != null)
                cur = cur.left;
            else
                cur = cur.right;
        }
    }

    private static boolean isLeaf(TreeNode cur) {
        return (cur.left == null) && (cur.right == null);
    }


}
