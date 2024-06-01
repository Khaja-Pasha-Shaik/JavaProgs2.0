package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerticalOrderTraversal {

    //Maintain a map with Integer and List<Integer>
    //key to hold the vertical line num
    //Value to hold list of values

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

        Map<Integer, List<Integer>> map = new HashMap<>();
        verticalOrderTraversal(t1, 0, map);
        map.forEach((k,v) -> {
            System.out.println(k+", "+v);
        });
    }

    private static void verticalOrderTraversal(TreeNode root, int verticalOrder, Map<Integer, List<Integer>> map) {

        if(root == null){
            return;
        }
        //verticalOrder is key in the map
        //If its not there, if its 1st time
        //create a new list
        if(!map.containsKey(verticalOrder)){
            map.put(verticalOrder, new ArrayList<>());
        }
        //If the vertical Order is there, add element to the list
        map.get(verticalOrder).add(root.data);

        verticalOrderTraversal(root.left, verticalOrder-1, map);
        verticalOrderTraversal(root.right, verticalOrder+1, map);

    }
}
