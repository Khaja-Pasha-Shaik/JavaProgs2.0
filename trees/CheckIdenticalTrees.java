package trees;

public class CheckIdenticalTrees {

    //Brute approach - do any traversal for 2 trees
    //Add to a list
    //compare the lists

    public static void main(String[] args) {

        //Take root nodes of trees
        //This is a sample code
        TreeNode p = new TreeNode(10); //consider root of Tree1
        TreeNode q = new TreeNode(10); //Consider root of Tree2

        boolean res = isSameTree(p,q);
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null){
            return p==q;
        }
        return (p.data == q.data)
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}
