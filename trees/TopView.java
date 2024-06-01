package trees;

import java.util.HashMap;
import java.util.Map;

public class TopView {

    //Do a vertical order traversal and only print the first element
    //Then we will get a top view

    //can do it by level order traversal and print the first and last elements

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

        Map<Integer, Integer> map = new HashMap<>();

        topView(t1,0,map);

        System.out.println(map);
    }

    private static void topView(TreeNode root, int verticalOrder, Map<Integer, Integer> map) {

        //base case
        if(root == null){
            return;
        }
        map.putIfAbsent(verticalOrder, root.data);

        topView(root.left, verticalOrder-1, map);
        topView(root.right, verticalOrder+1, map);
    }
}
