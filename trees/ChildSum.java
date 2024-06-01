package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ChildSum {
    //Always the parent node to be sum of left and right child
    //You are allowed to increment the values of anything till you form a tree

    //******NOTE
    //Ignore all the other methods except  -- childSum
    //All these are added just to test

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

        List<List<Integer>> dsBefore = new ArrayList<>();
        showBefore(t1);
        showBeforeLevelOrder(t1,dsBefore);
        System.out.println();
        System.out.println("*********************");
        System.out.println(dsBefore);
        childSum(t1);
        System.out.println();
        System.out.println();
        List<List<Integer>> dsAfter = new ArrayList<>();
        show(t1);
        showBeforeLevelOrder(t1, dsAfter);
        System.out.println();
        System.out.println(dsAfter);
    }

    private static void showBeforeLevelOrder(TreeNode root, List<List<Integer>> dsBefore) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return;
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new ArrayList<>();
            for(int i=0;i<levelNum;i++){
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);
                subList.add(queue.poll().data);
            }
            dsBefore.add(subList);
        }
    }

    private static void showBefore(TreeNode root) {
        if(root == null)
            return;

        //Inorder
        showBefore(root.left);
        System.out.print(root.data+"  ");
        showBefore(root.right);
    }

    private static void show(TreeNode root) {
        if(root == null)
            return;

        //Inorder traversal (left,root,right)
        show(root.left);
        System.out.print(root.data+"  ");
        show(root.right);
    }

    private static void childSum(TreeNode root) {
        //base case
        if(root == null){
            return;
        }
        int currentNodeParentSum = 0;
        //Just calculate the sum of left and right with below 2 if conditions
        //If that is greater than the root - make root to that
        //If thats less - you cant divide that between left and right
        //Because those can have the child nodes, assign the values that parent has for now
        if(root.left != null)
            currentNodeParentSum = currentNodeParentSum +root.left.data;
        if(root.right != null)
            currentNodeParentSum = currentNodeParentSum +root.right.data;
        //Always root should have the highest, because it is at the top
        if(currentNodeParentSum >= root.data)
            root.data = currentNodeParentSum;
        else {
            if(root.left != null)
                root.left.data = root.data;
            if(root.right != null)
                root.right.data = root.data;
        }

        //go ahead repeat for all the nodes
        childSum(root.left);
        childSum(root.right);

        //Now after the iterations, you might want to fix the parents
        //Add up left and right now and assign to the parent
        //You went left, you went right and came back
        //This is the backtrack step, you have all the children what they want
        //Adding up and fixing the parents
        int tot =0;
        if(root.left != null)
            tot = tot + root.left.data;
        if(root.right != null)
            tot = tot + root.right.data;
        if(root.left != null || root.right != null)
            root.data = tot;
    }
}
