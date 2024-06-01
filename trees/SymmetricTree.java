package trees;

public class SymmetricTree {
    //If at root a mirror is kept both the actual and reflection should be same
    //The below is a symmetric tree

    //              10
    //         20         20
    //      30     40  40     30

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        TreeNode t2 = new TreeNode(20);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(30);
        TreeNode t5 = new TreeNode(40);
        TreeNode t6 = new TreeNode(30);
        TreeNode t7 = new TreeNode(40);

        root.left = t2;
        root.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t7;
        t3.right = t6;

        boolean res = isSymmetricTree(root.left, root.right);
        System.out.println(res);
    }

    private static boolean isSymmetricTree(TreeNode left, TreeNode right) {
        if(left == null && right == null)
            return true;
        if(left.data != right.data)
            return false;
        return isSymmetricTree(left.left, right.right)
                && isSymmetricTree(left.right, right.left);
    }

}
