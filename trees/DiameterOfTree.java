package trees;

public class DiameterOfTree {

    //A Tree's diameter is defined by the longest distance between 2 nodes
    //It can either pass by root or it doesn't matter

    //So the intuition is, at every node just get the left height and right height
    //if you add them that becomes the distance b/w the 2 terminal left and right nodes of that node
    //Like you get it for every node. Just add them and you will get the diameter at every node
    //Since we need diameter of tree, the max of them will be the result


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
        int[] maxi = new int[1];
        int res = calculateDiameter(t1,maxi);
        System.out.println(maxi[0]);
    }

    private static int calculateDiameter(TreeNode node, int[] maxi) {

        if(node == null)
            return 0;

        int lh = calculateDiameter(node.left, maxi);
        int rh = calculateDiameter(node.right, maxi);

        maxi[0] = Math.max(maxi[0], lh+rh);

        return 1+Math.max(lh,rh);
    }
}
