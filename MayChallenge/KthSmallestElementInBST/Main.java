package KthSmallestElementInBST;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(8);
        root.right.right = new TreeNode(9);

        Solution s = new Solution();
        int res = s.kthSmallest(root,3);
        System.out.println(res);
    }
}
