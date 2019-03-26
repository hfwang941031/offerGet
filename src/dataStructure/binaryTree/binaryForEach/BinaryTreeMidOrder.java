package dataStructure.binaryTree.binaryForEach;

import dataStructure.binaryTree.TreeNode;

/**
 * @ClassName BinaryTreeMidOrder
 * @Description 二叉树中序遍历--左 根 右 直接打印遍历结果；
 * @Author 王海峰
 * @Date 2019/3/26 14:00
 * @Version 1.0
 */
public class BinaryTreeMidOrder {
    public static void midOrder(TreeNode root)
    {
        if (root != null) {
            if (root.left != null) {
                midOrder(root.left);
            }
            System.out.print(root.val+" ");
            if (root.right != null) {
                midOrder(root.right);
            }

        }


    }
}
