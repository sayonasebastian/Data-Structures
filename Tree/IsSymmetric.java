package Tree;
// 101. Symmetric Tree
public class IsSymmetric {
    public boolean validate(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null) {
            System.out.println("x");
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return validate(left.left, right.right) && validate(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return validate(root.left, root.right);

    }
}
