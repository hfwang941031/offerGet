package dataStructure.binaryTree.binaryForEach;

/**
 * @ClassName IsResultOfBinaryTreePostOrder
 * @Description 输入一个整数数组，
 * 判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。
 * 假设输入的数组的任意两个数字都互不相同。
 *
 *
 * 思想：
 * 如果该数组为二叉树后序遍历得到，则应该具有以下特点：
 *
 * 1、数组中最后一个元素为该二叉树的根节点
 * 2、数组中前半部分应该是该二叉树的左子树及其子树，应该都小于根节点的值
 * 3、数组中后半部分应该是该二叉树的右子树及其子树，应该都大于根节点的值
 * 数组的牵绊部分
 * @Author 王海峰
 * @Date 2019/3/26 14:49
 * @Version 1.0
 */
public class IsResultOfBinaryTreePostOrder {
    public static boolean VerifySequenceOfBST(int[] sequence) {
        if (sequence.length==0)
            return false;
        return isTreeBST(sequence,0,sequence.length-1);

    }

    public static boolean isTreeBST(int[] sequence, int start, int end) {
        //通过数组的头索引和尾索引来确定该数组是否为空
        //头索引大于尾索引不可能发生
        //头索引等于尾索引说明数组容量1，此时该数组为一个只有根节点的二叉树后序遍历得到
        if (start>=end)
            return true;
        int i=start;
        //找到左子树和右子树分界点
        //for循环结束时说名sequecne[i]不小于sequence[end]（根节点），此时sequence[i]为右子树结点
        for (; i < end; i++) {
            if (sequence[i] > sequence[end]) {
                break;
            }
        }
        //从第一个右子树开始判断是不是到该数组倒数第二个元素之前都大于根节点
        //若非，则不是搜索二叉树后序遍历得到的
        //因为如果是搜索二叉树得到的，那么从数组中第一个大于根节点的元素起，直到倒数第二个数组元素都应该大于根节点
        for (int j = i; j < end; j++) {
            if (sequence[j] < sequence[end]) {
                return false;
            }
        }

        //最后end-1的原因是  end为根节点， 应该判断直到倒数第二个元素  即end-1
        return isTreeBST(sequence, start, i - 1) && isTreeBST(sequence, i, end-1);


    }
}
