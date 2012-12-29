package tree;

/**
 * Minimum Depth of Binary Tree 
 * Should be every careful, it is not like the maximum depth.
 */

public class MinimumDepth {
	public int minDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left == null) {
            return minDepth(root.right) + 1;
        } else if (root.right == null) {
            return minDepth(root.left) + 1;
        } else {
            return Math.min(minDepth(root.right), minDepth(root.left)) + 1;
        }
    }
}