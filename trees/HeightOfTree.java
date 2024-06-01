package trees;

public class HeightOfTree {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 =  new TreeNode(20);
        TreeNode t3 = new TreeNode(30);
        TreeNode t4 = new TreeNode(40);
        TreeNode t5 = new TreeNode(50);
        TreeNode t6 = new TreeNode(60);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;

        //For height - you can do a level order traversal
        //The no.of levels will be height
        //Or at any given node 1+max(l,r) -> will be height
        // l -> no.of elements to left | r -> no.of elements to right
        // if no elements, then return zero. This should be our base case

        int res = heightOfTree(t1);
        System.out.println(res);
    }

    private static int heightOfTree(TreeNode node) {
        //base case
        //if any node is null return zero, because it cannot have a left or right
        if(node == null)
            return 0;
        //get the left height
        int lh = heightOfTree(node.left);
        //get the right height
        int rh = heightOfTree(node.right);

        return 1+Math.max(lh,rh);
    }

}
