package trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightView {

    //Do a level order traversal and print the last elements of each level

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

        List<List<Integer>> ds = new ArrayList<>();

        rightView(t1, ds);
        for(List<Integer> ul : ds){
            System.out.print(ul.getLast()+" ");
        }
    }

    private static void rightView(TreeNode root, List<List<Integer>> ds) {

        Queue<TreeNode> queue = new LinkedList<>();
        //base case
        if(root == null){
            return;
        }
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new ArrayList<>();
            for(int i=0; i<levelNum;i++){
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);
                subList.add(queue.poll().data);
            }
            ds.add(subList);
        }
    }
}
