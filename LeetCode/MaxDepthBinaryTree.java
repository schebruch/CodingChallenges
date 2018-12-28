class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null){
            return 1;
        }
        if(root.left == null)
            return 1 + maxDepth(root.right);
        if(root.right == null)
            return 1 + maxDepth(root.left);
        return 1 + max(maxDepth(root.left) ,maxDepth(root.right));
    }
    static int max(int num1 , int num2){
        if(num1 > num2)
            return num1;
        return num2;
    }
}