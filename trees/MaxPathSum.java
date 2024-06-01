package trees;

public class MaxPathSum {

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

        int[] res = new int[1];
        calculateMaxPathSum(t1, res);
        System.out.println(res[0]);
    }

    private static int calculateMaxPathSum(TreeNode node, int[] res) {

        if(node == null){
            return 0;
        }
        //if negative, return zero. Because negative makes no max sum
        int leftSum = Math.max(0, calculateMaxPathSum(node.left, res));
        int rightSum = Math.max(0, calculateMaxPathSum(node.right, res));

        res[0] = Math.max(res[0], node.data+leftSum+rightSum);
        //Below we should take max of left,sum (Not adding them because)
        //We have to choose the path which is giving us the max sum
        //path to choose right or left
        return Math.max(leftSum,rightSum) + node.data;
    }
}
