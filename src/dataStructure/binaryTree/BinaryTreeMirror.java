package dataStructure.binaryTree;

/**
 * @ClassName BinaryTreeMirror
 * @Description 操作给定的二叉树，将其变换为源二叉树的镜像
 * 思想：
 * 从根节点开始，交换左右子树，首先要进行左右子树存在性的判断  该算法基于递归
 *
 * @Author 王海峰
 * @Date 2019/3/26 15:20
 * @Version 1.0
 */
public class BinaryTreeMirror {
    public static TreeNode mirrorBST(TreeNode root) {
        if (root==null)
            return null;
        if (root!= null ) {
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            if (root.left != null) {
                mirrorBST(root.left);
            }
            if (root.right != null) {
                mirrorBST(root.right);
            }
        }

        return root;

    }
}
