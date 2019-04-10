package dataStructure.binaryTree;

/**
 * @ClassName BSTConvertToLianBiao
 * @Description
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * @Author 王海峰
 * @Date 2019/4/1 14:11
 * @Version 1.0
 */
public class BSTConvertToDoubleLianBiao {
    TreeNode head=null;
    TreeNode realHead=null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){
            return null;
        }
        Convert(pRootOfTree.left); //左

        if(head == null){ //根
            head = pRootOfTree;
            realHead = pRootOfTree;
        }else{
            head.right = pRootOfTree;
            pRootOfTree.left = head;
            head = pRootOfTree;
        }

        Convert(pRootOfTree.right); //右
        return realHead;

    }
}
