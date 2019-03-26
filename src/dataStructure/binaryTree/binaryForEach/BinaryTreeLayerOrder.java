package dataStructure.binaryTree.binaryForEach;

import dataStructure.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName BinaryTreeLayerOrder
 * @Description 二叉树按层遍历
 * 思想：
 * 首先构造一个队列，先入先出
 * 1、如果根节点存在，先把根节点加入队列
 * 2、进入while循环，循环的条件是队列为空就停止，不为空则持续循环
 * 3、在while循环中首先把队列中的根节点取出，并把val值添加到list中
 * 4、随后判断当前结点是否右左右节点，有则按照先左后右的顺序把结点添加到队列
 * @Author 王海峰
 * @Date 2019/3/26 14:20
 * @Version 1.0
 */
public class BinaryTreeLayerOrder {
    public static void layerOrder(TreeNode root) {
        if (root != null) {
            ArrayList<Integer> list = new ArrayList<>();
            Deque<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode temp = queue.pop();
                list.add(temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            for (int i=0;i<list.size();i++) {
                System.out.print(list.get(i)+" ");
            }
        }
    }
}
