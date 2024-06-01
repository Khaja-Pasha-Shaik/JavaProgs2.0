package trees;

public class AllOrderDFSTraversals {

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
        System.out.println("Inorder traversal::");
        inorderTraversal(t1);
        System.out.println("pre order traversal::");
        preOrderTraversal(t1);
        System.out.println("post order traversal::");
        postOrderTraversal(t1);
    }

    private static void postOrderTraversal(TreeNode node) {
        if(node == null){
            return;
        }
        //left,right,root
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data+" ");
    }

    private static void preOrderTraversal(TreeNode node) {
        if(node == null){
            return;
        }
        //root,left,right
        System.out.print(node.data+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    private static void inorderTraversal(TreeNode node) {
        //base condition
        if(node == null){
            return;
        }

        inorderTraversal(node.left);
        System.out.print(node.data+" ");
        inorderTraversal(node.right);
    }
}
