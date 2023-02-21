package Tree;

//104. Maximum Depth of Binary Tree
public class MaxDepth {
    public int maxDepthOfTree(TreeNode root) {
        if(root == null) return 0;
        int l = maxDepthOfTree(root.left)+1;
        int r= maxDepthOfTree(root.right)+1;
        return l>r? l:r;
    }
}
