// 4.1 - Implement a function to check if a binary tree is balanced. For the purposes of this question, a balanced tree is defined to be a tree such that the heighs of the two subtrees of any node never differ by more than one.

public class TreeGraph1 {

    public static void main(String args[]) {

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;

        System.out.println(isBalanced(n1));

    }

    public static int isBalanced(TreeNode root) {

        if(root == null) {

            return 0;

        }

        int left = isBalanced(root.left);
        if(left == -1) {

            return -1;

        }

        int right = isBalanced(root.right);
        if(right == -1) {

            return -1;

        }

        if(Math.abs(left - right) > 1) {

            return -1;

        } else {

            return Math.max(left, right) + 1;

        }
    
    }

}
