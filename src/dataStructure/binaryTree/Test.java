package dataStructure.binaryTree;

import dataStructure.binaryTree.binaryForEach.BinaryTreeLayerOrder;
import dataStructure.binaryTree.binaryForEach.BinaryTreeMidOrder;
import dataStructure.binaryTree.binaryForEach.BinaryTreePostOrder;
import dataStructure.binaryTree.binaryForEach.BinaryTreePreOrder;
import dataStructure.binaryTree.TreeNode;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 王海峰
 * @Date 2019/3/26 14:07
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args){
        TreeNode t1 = new TreeNode(8);
        TreeNode t2 = new TreeNode(6);
        TreeNode t3 = new TreeNode(10);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(7);
        TreeNode t6 = new TreeNode(9);
        TreeNode t7 = new TreeNode(11);
        t1.left=t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left=t6;
        t3.right = t7;
        System.out.print("前序遍历：");
        BinaryTreePreOrder.preOrder(t1);
        System.out.print("中序遍历：");
        BinaryTreeMidOrder.midOrder(t1);
        System.out.print("后序遍历：");
        BinaryTreePostOrder.postOrder(t1);
        System.out.print("按层遍历：");
        BinaryTreeLayerOrder.layerOrder(t1);
    }
}
