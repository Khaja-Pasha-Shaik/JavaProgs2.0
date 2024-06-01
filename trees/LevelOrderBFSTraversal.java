package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBFSTraversal {

    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(20);
        TreeNode t3 = new TreeNode(30);
        TreeNode t4 = new TreeNode(40);
        TreeNode t5 = new TreeNode(50);
        TreeNode t6 = new TreeNode(60);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;

        List<List<Integer>> res = levelOrderTraversal(t1);

        System.out.println(res);
    }

    private static List<List<Integer>> levelOrderTraversal(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ds = new ArrayList<>();
        if(root == null)
            return null;
        //add root to queue first
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new ArrayList<>();
            //levelNum defines no.of elements in each level
            //take root, root has 1 but in the next level it has 2, root.left and root.right
            //Keeping that in mind, just add those to queue, before adding check if they exist
            for(int i=0;i<levelNum;i++){
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);
                //poll removes the element also and returns it
                //After adding we will remove each level elements
                subList.add(queue.poll().data);
            }
            ds.add(subList);
        }
        return ds;
    }
}
