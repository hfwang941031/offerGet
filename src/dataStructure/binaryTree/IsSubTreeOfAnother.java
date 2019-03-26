package dataStructure.binaryTree;

/**
 * @ClassName IsSubTreeOfAnother
 * @Description 输入两棵二叉树A，B，判断B是不是A的子结构。
 *              ps：我们约定空树不是任意一个树的子结构）
 * @Author 王海峰
 * @Date 2019/3/26 15:35
 * @Version 1.0
 */
public class IsSubTreeOfAnother {
    public boolean hasSubTree(TreeNode root1, TreeNode root2) {
        boolean res=false;
        //当两个树都不为空的时候才进行比较，否则直接返回false
        if (root1 != null && root2 != null) {

            //如果找到了对应root2的根节点的点
            if (root1.val == root2.val) {
                //以这个根节点为起点判断是否包含root2
                res = isSubTree(root1, root2);
            }
            //如果找不到，则让root1的左儿子当作起点，去判断包含root2
            if (!res) {
                res = hasSubTree(root1.left, root2);
            }
            //如果还找不到，那么就再去root的右儿子当作起点，去判断包含root2
            if (!res) {
                res = hasSubTree(root1.right, root2);
            }

        }
        return res;


    }

    public boolean isSubTree(TreeNode root1, TreeNode root2) {
        //如果root2已经遍历完都能对的上，返回true
        if (root2==null)
            return true;
        //如果root2还没有遍历完，root1却遍历完了，返回false
        if (root1==null)
            return false;
        //如果有其中一个点没有对应上，返回false
        if (root1.val!=root2.val)
            return false;
        //如果根节点对应的上，则分贝去子节点里匹配
        return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);

    }
}
