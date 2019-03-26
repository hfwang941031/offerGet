package dataStructure.binaryTree.binaryForEach;

import dataStructure.binaryTree.TreeNode;

/**
 * @ClassName BinaryTreePostOrder
 * @Description 二叉树后序遍历  左 右 根  直接打印遍历结果
 * @Author 王海峰
 * @Date 2019/3/26 14:04
 * @Version 1.0
 */
public class BinaryTreePostOrder {
    public static void postOrder(TreeNode root) {
        if (root != null) {
            if (root.left != null) {
                postOrder(root.left);
            }
            if (root.right != null) {
                postOrder(root.right);
            }
            System.out.print(root.val+" ");
        }
    }
}
