package dataStructure.binaryTree.binaryForEach;

import dataStructure.binaryTree.TreeNode;

/**
 * @ClassName BinaryTreePreOrder
 * @Description 二叉树前序遍历----根 左 右    直接打印遍历结果；
 * @Author 王海峰
 * @Date 2019/3/26 13:57
 * @Version 1.0
 */
public class BinaryTreePreOrder {
    public static void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val+" ");
            if (root.left != null) {
                preOrder(root.left);
            }
            if (root.right != null) {
                preOrder(root.right);
            }

        }

    }
}
