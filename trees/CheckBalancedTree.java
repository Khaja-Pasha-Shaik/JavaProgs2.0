package trees;

import java.util.ArrayList;
import java.util.List;

public class CheckBalancedTree {
    //Balanced Tree is a tree
    //that at every node - the left height and right height should not be greater than 1

    public static void main(String[] args) {

        //we can follow the same approach get the left height and right
        //and at any point of time, if the diff is greater than 1, return false

        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(20);
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

        int  res = checkForBalancedTree(t1);

        if(res ==-1){
            System.out.println("Not a balanced tree");
        } else {
            System.out.println("Balanced Tree");
        }
    }

    private static int checkForBalancedTree(TreeNode node) {
        if(node == null)
            return 0;

        int lh = checkForBalancedTree(node.left);
        int rh = checkForBalancedTree(node.right);

        if(lh==-1) return -1;
        if(rh==-1) return -1;
        if(Math.abs(lh-rh) > 1)
            return -1;
        return 1+ Math.max(lh,rh);
    }
}
